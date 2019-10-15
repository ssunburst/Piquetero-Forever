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
	public static final int IDLE = 0;
	public static final int ATACAR = 1;
	public static final int MORIR = 2;
	
	
	public Grafico(Entidad e)
	{
		super();
		this.entidad = e;
		imagenes = new Icon[3];
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
		double x = p.getX();
		p.setLocation(x + this.entidad.getVelocidad()*direccion, p.getY());			
	}
}
