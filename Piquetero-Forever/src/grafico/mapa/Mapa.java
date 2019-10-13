package grafico.mapa;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.text.Position;

import java.util.List;
import java.util.LinkedList;
import grafico.Grafico;
import juego.Tienda;
import juego.Entidad;
import juego.Juego;
import java.util.Map;
import java.util.HashMap;

public class Mapa extends JPanel {
	protected Image img;
	protected Juego juego;
	protected JLabel background;

	protected List<Grafico> graficos;
	protected Map<Point, Grafico> posAliadas;

	protected final int FILAS = 5;
	protected final int COLUMNAS = 9;
	protected final int playZoneY = 113;
	protected boolean vender;

	/*
	 * Constructor de la clase.
	 */
	public Mapa(Juego j) {
		this.setLayout(null);
		this.juego = j;

		boolean vender = false;

		graficos = new LinkedList<Grafico>();
		posAliadas = new HashMap<Point, Grafico>();

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

	/*
	 * Agrega un nuevo gráfico al mapa en las coordeanadas dadas.
	 */
	public void agregarGrafico(Grafico toAdd, Point p) {
		toAdd.setLocation(p);
		this.graficos.add(toAdd);
		this.add(toAdd);
		this.setComponentZOrder(toAdd, 0);
		this.juego.getGUI().setearPanel(true);
		this.juego.getGUI().setearBotonVender(true);
		this.repaint();
		System.out.println("Agregado un gráfico en la posición " + p);
	}

	/*
	 * Remueve una entidad gráfica del mapa.
	 */
	public void quitarGrafico(Grafico toRem) 
	{
		Point p = toRem.getLocation();
		posAliadas.remove(p);
		graficos.remove(toRem);
		remove(toRem);
		this.repaint();
	}

	/*
	 * Determina el ancho de cuadrícula del juego del mapa.
	 */
	public int colSize() {
		return this.getWidth() / COLUMNAS;
	}

	/*
	 * Determina el alto de cuadrícula del mapa
	 */
	public int rowSize() {
		return (this.getHeight() - playZoneY) / FILAS;
	}

	/*
	 * Dada una coordenada y, lo mapea a su correspondiente en el ordenamiento
	 * fila-columna del mapa.
	 */
	private int fixX(int x) 
	{
		x = (x / colSize()) * colSize();
		if ((0 <= x) && (x < colSize()*COLUMNAS))
			return x;
		else
			return -1;

	}

	/*
	 * Dado un valor y de una coordenada, lo mapea a su correspondiente en el
	 * ordenamiento fila-columna del mapa.
	 */
	private int fixY(int y) {
		if (y < 113)
			y = -1;
		else 
		{
			y = (((y - playZoneY) / rowSize()) * rowSize()) + playZoneY;
			if (y >= rowSize()*FILAS)
				y = -1;
		}
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
				Grafico gVend = (Grafico) posAliadas.get(p);
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

					Grafico g = posAliadas.get(p);
					if (g == null) {
						posAliadas.put(p, toAdd.getGrafico());
						juego.agregarEntidad(toAdd);
						agregarGrafico(toAdd.getGrafico(), p);
						juego.getTienda().setNextToAdd(null);
					}

				}
			}
		}
	}
}
