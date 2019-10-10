package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.Event;
import juego.Entidad;
import juego.Juego;

public abstract class BotonTienda extends JButton
{
	protected Juego juego;
	protected Entidad entidad;
	
	public BotonTienda(Juego j)
	{
		this.setSize(new Dimension(80,20));
		juego = j;
	}

	public Entidad getEntidad() {
		return entidad;
	}

	public void setEntidad(Entidad entidad) {
		this.entidad = entidad;
	}	
}
