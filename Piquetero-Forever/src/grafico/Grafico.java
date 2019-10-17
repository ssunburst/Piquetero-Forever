package grafico;

import javax.swing.*;

import grafico.detector.DetectorColisiones;
import juego.entidad.Entidad;

import java.awt.*;
import java.awt.event.*;
import java.lang.Iterable;

public abstract class Grafico extends JLabel
{
	protected Icon[] imagenes;
	protected Entidad entidad;
	protected DetectorColisiones dc;
	protected int direccion;
	protected final int DERECHA = 1;
	protected final int IZQUIERDA = -1;
	
	
	public Grafico(Entidad e)
	{
		super();
		this.entidad = e;
		setearImagenes();
		this.setIcon(imagenes[posIdle()]);
		this.setSize(new Dimension(imagenes[0].getIconWidth(), imagenes[0].getIconWidth()));
	}
	
	public void setearImagen(int img)
	{
		this.setIcon(imagenes[img]);
	}
	
	public Icon[] getImagenes() {
		return imagenes;
	}
	
	public Entidad getEntidad()
	{
		return this.entidad;
	}
	
	public Iterable<Entidad> detectarColisiones()
	{
		return this.dc.detectarColisiones();
	}
	
	public void mover()
	{
		Point p = this.getLocation();
		double x = p.getX() + this.entidad.getVelocidad()*direccion;
		double y = p.getY();
		p.setLocation(x, y);
		this.setLocation(p);		
		this.repaint();
	}
	
	protected abstract void setearImagenes();
	
	public int posIdle()
	{
		return 0;
	}
	
	public int posAtaque()
	{
		return 1;
	}
	
	public int posMuerte()
	{
		return 2;
	}
}
