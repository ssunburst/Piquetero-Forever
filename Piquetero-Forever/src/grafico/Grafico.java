package grafico;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import juego.Entidad;

public abstract class Grafico extends JLabel
{
	protected Icon[] imagenes;
	protected Entidad entidad;
	
	public Grafico(Entidad e, int img)
	{
		super();
		this.entidad = e;
		imagenes = new Icon[img];
		
		this.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				super.mouseClicked(arg0);
			}
			
		});
	}
	
	public Icon[] getImagenes() {
		return imagenes;
	}
	
	public Entidad getEntidad()
	{
		return this.entidad;
	}
	
	public void setEntidad(Entidad e)
	{
		this.entidad = e;
	} 
}
