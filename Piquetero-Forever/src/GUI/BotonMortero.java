package GUI;

import juego.Entidad;
import juego.Juego;
import juego.personaje.piquetero.Mortero;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class BotonMortero extends BotonPiquetero 
{
	public BotonMortero(Juego j) 
	{
		super(j);
		this.setText("Mortero");
	}

	@Override
	public Entidad crearEntidad(Juego j) 
	{
		return new Mortero(j);
	}
	
}
