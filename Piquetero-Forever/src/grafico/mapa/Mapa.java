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

	public Mapa(Juego j) {
		this.setLayout(null);
		this.juego = j;

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
		this.setComponentZOrder(background, 0);
	}

	private class MapListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			int x = fixX(e.getX());
			int y = fixY(e.getY());

			if (y > -1) {
				Point p = new Point(x, y);
				Grafico g = posAliadas.get(p);
				if (g == null) {
					Tienda t = juego.getTienda();
					Entidad toAdd = t.getToAdd();
					if (toAdd != null) 
					{
						juego.agregarEntidad(toAdd);
						toAdd.getGrafico().setLocation(p);
						graficos.add(toAdd.getGrafico());
						agregarGrafico(toAdd.getGrafico(), x, y);
						juego.getTienda().setNextToAdd(null);
					}
				}

			}
		}
	}

	// Agrega un nuevo gráfico al mapa en las coordeanadas dadas.
	public void agregarGrafico(Grafico toAdd, int clickX, int clickY) {
		toAdd.setLocation(new Point(clickX, clickY));
		this.graficos.add(toAdd);
		this.add(toAdd);
		this.setComponentZOrder(toAdd, 0);
		this.repaint();
	}

	public void quitarGrafico(Grafico toRem) {
		Point p = toRem.getLocation();
		p.setLocation(p.getX() + toRem.getWidth(), p.getY());
		posAliadas.remove(p);
		graficos.remove(toRem);
		remove(toRem);
		this.repaint();
	}

	// Determina el ancho de cuadrícula del juego del mapa.
	public int colSize() {
		return this.getWidth() / COLUMNAS;
	}

	// Determina el alto de cuadrícula del mapa
	public int rowSize() {
		return (this.getHeight() - playZoneY) / FILAS;
	}

	// Dada una coordenada y, lo mapea a su correspondiente en el ordenamiento
	// fila-columna del mapa.
	private int fixX(int x) {
		return (x / colSize()) * colSize();

	}

	// Dada un valor y de una coordenada, lo mapea a su correspondiente en el
	// ordenamiento fila-columna del mapa.
	private int fixY(int y) {
		if (y < 113)
			return -1;
		else {
			return (((y - playZoneY) / rowSize()) * rowSize()) + playZoneY;
		}
	}
}
