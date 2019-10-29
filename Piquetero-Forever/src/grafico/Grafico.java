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
	
	protected Grafico(Entidad e)
	{
		super();
		this.entidad = e;
		setearImagenes();
		this.setIcon(imagenes[posIdle()]);
		this.setSize(new Dimension(imagenes[0].getIconWidth(), 100));
	}
	
	public void setearImagen(int img)
	{
		this.setIcon(imagenes[img]);
		this.repaint();
	}
	
	public Icon[] getImagenes() {
		return imagenes;
	}
	
	public Entidad getEntidad()
	{
		return this.entidad;
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
