package grafico.mapa;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.text.Position;

import java.util.List;
import java.util.LinkedList;
import grafico.GraficoEntidad;
import juego.Tienda;
import juego.entidad.Entidad;
import juego.Juego;
import java.util.Map;
import java.util.HashMap;

public class Mapa extends JPanel 
{
	protected Juego juego;
	protected JLabel background;

	protected List<GraficoEntidad> graficos;
	protected Map<Point, GraficoEntidad> posAliadas;

	protected int filas = 5;
	protected int columnas = 9;
	protected int playZoneY = 113;
	
	protected boolean vender;

	/*
	 * Constructor de la clase.
	 */
	public Mapa(Juego j) {
		this.setLayout(null);
		this.juego = j;

		boolean vender = false;

		graficos = new LinkedList<GraficoEntidad>();
		posAliadas = new HashMap<Point, GraficoEntidad>();

		Dimension dim = new Dimension(1088, 612);
		setMinimumSize(dim);
		setMaximumSize(dim);
		setPreferredSize(dim);
		setSize(dim);
		setBorder(BorderFactory.createLineBorder(Color.black));
		addMouseListener(new MapListener());

		background = new JLabel();
		background.setBounds(0, 0, this.getWidth(), this.getHeight());
		background.setIcon(new ImageIcon(this.getClass().getResource("/imagenes/mapa.png")));
		this.add(background);
		setComponentZOrder(background, 0);
	}
	
	public int filas()
	{
		return filas;
	}
	
	public int columnas()
	{
		return columnas;
	}
	
	public int posFila(int f)
	{
		return playZoneY + (f-1)*rowSize();
	}
	
	public int posColumna(int c)
	{
		return (c-1)*colSize();
	}
	
	/*
	 * Retorna una colección iterable de los graficos actualmente presentes en el mapa.
	 */
	public Iterable<GraficoEntidad> graficos()
	{
		return graficos;
	}

	/*
	 * Agrega un nuevo gráfico al mapa en las coordeanadas dadas.
	 */
	public synchronized void agregarGrafico(GraficoEntidad toAdd, Point p) {
		toAdd.setLocation(p);
		this.graficos.add(toAdd);
		this.add(toAdd);
		this.setComponentZOrder(toAdd, 0);
	}

	/*
	 * Remueve una entidad gráfica del mapa.
	 */
	public synchronized void quitarGrafico(GraficoEntidad toRem) 
	{
		Point p = toRem.getLocation();
		posAliadas.remove(p);
		graficos.remove(toRem);
		remove(toRem);
		this.repaint();
	}

	/*
	 * Determina el ancho de una cuadrícula del juego del mapa.
	 */
	public int colSize() 
	{
		return this.getWidth() / columnas;
	}

	/*
	 * Determina el alto de cuadrícula del mapa
	 */
	public int rowSize() {
		return (this.getHeight() - playZoneY) / filas;
	}

	/*
	 * Dada una coordenada y, lo mapea a su correspondiente en el ordenamiento
	 * fila-columna del mapa.
	 */
	private int fixX(int x) 
	{
		x = (x / colSize()) * colSize();
		if ((0 <= x) && (x < colSize()*columnas))
			return x;
		else
			return -1;
	}

	/*
	 * Dado un valor y de una coordenada, lo mapea a su correspondiente en el
	 * ordenamiento fila-columna del mapa.
	 */
	private int fixY(int y) {
		if ((y < 113) || (y >= playZoneY + filas*rowSize()))
			y = -1;
		else 
			y = (((y - playZoneY) / rowSize()) * rowSize()) + playZoneY;
		return y;
	}

	/*
	 * Setea el parámetro booleano indicativo de si se está en modo vender.
	 */
	public void setVender(boolean v) {
		vender = v;
	}
	

	/*
	 * Oyente del mapa.
	 */
	private class MapListener extends MouseAdapter {
		@Override
		public void mouseReleased(MouseEvent e) {
			int x = fixX(e.getX());
			int y = fixY(e.getY());
			Point p = new Point(x, y);
			Tienda t = juego.getTienda();
			Entidad toAdd = t.getToAdd();
			if (vender) {
				GraficoEntidad gVend = (GraficoEntidad) posAliadas.get(p);
				if (gVend != null) 
				{
					Entidad aVend = gVend.getEntidad();
					aVend.vender();
					vender = false;
					juego.getGUI().setearPanel(true);
					juego.getGUI().setearBotonVender(true);
				}
			} else if (toAdd != null) {
				if ((y > -1) && (x > -1)) {

					GraficoEntidad g = posAliadas.get(p);
					if (g == null) 
					{
						toAdd.getGrafico().setLocation(p);
						posAliadas.put(p, toAdd.getGrafico());
						juego.agregarLuego(toAdd);
						juego.getGUI().setearPanel(true);
						juego.getGUI().setearBotonVender(true);
						juego.getTienda().setNextToAdd(null);
					}

				}
			}
		}
	}
	
	public void purgar()
	{
		for (GraficoEntidad g : graficos)
		{
			int x = g.getX();
			if ((x + g.getWidth() < 0) || (x > getWidth()))
				juego.quitarLuego(g.getEntidad());
		}
	}
}
