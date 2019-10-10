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
import java.util.Dictionary;
import java.util.Hashtable;

public class Mapa extends JPanel 
{
	protected Image img;
	protected Juego juego;
	protected JLabel background;
	
	protected List<Grafico> graficos;
	protected Dictionary<Point, Grafico> posiciones;
	
	protected final int FILAS = 5;
	protected final int COLUMNAS = 9;
	protected final int playZoneY = 113;
	
	public Mapa(Juego j) 
	{
		this.setLayout(null);
		this.juego = j;
		
		graficos = new LinkedList<Grafico>();
		posiciones = new Hashtable<Point, Grafico>();
		
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
	
	public void agregarGrafico(Grafico toAdd, int clickX, int clickY) {
//		System.out.println("X arreglado:" + clickX + " - Y arreglado: " + clickY );
		toAdd.setLocation(new Point(clickX, clickY));
		this.graficos.add(toAdd);
		this.add(toAdd);
		this.setComponentZOrder(toAdd, 0);
		this.repaint(); 
	}
	
	
	private class MapListener extends MouseAdapter
	{		
		@Override
		public void mouseClicked(MouseEvent e) 
		{	
			int x = fixX(e.getX());
			int y = fixY(e.getY());
			
			if (y > -1)
			{			
				Tienda t = juego.getTienda();
				Entidad toAdd = t.getToAdd();
				if (toAdd != null)
				{
					Grafico g = toAdd.getGrafico();
					juego.agregarEntidad(toAdd);
					posiciones.put(new Point(g.getX(), g.getY()), g);
					agregarGrafico(toAdd.getGrafico(), x, y);
				}
				
			}
		}
	}
	
	public int colSize()
	{
		return this.getWidth() / COLUMNAS;
	}
	
	public int rowSize()
	{
		return (this.getHeight() - playZoneY) / FILAS;
	}
	
	private int fixX(int x)
	{
		return (x/colSize())*colSize();
		
	}
	
	private int fixY(int y)
	{
		if (y < 113)
			return -1;
		else
		{
			return (((y - playZoneY) / rowSize()) * rowSize()) + playZoneY;
		}
	}
}
