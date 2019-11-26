package grafico;

import java.awt.Dimension;

import javax.swing.Icon;
import javax.swing.JLabel;

import juego.entidad.Entidad;

public abstract class Grafico extends JLabel
{
	protected Icon[] imagenes;
	protected int posActual;
	
	protected Grafico()
	{
		super();	
		setearImagenes();
		this.setIcon(imagenes[0]);
		posActual = 0;
		this.setSize(new Dimension(imagenes[0].getIconWidth(), 100));
	}
	
	public void setearImagen(int img)
	{
		this.setIcon(imagenes[img]);
		posActual = img;
	}
	
	protected abstract void setearImagenes();
	
	public int posActual()
	{
		return posActual;
	}
}
