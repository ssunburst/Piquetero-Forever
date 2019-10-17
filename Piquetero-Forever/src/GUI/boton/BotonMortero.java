package GUI.boton;

import juego.Juego;
import juego.entidad.Entidad;
import juego.entidad.personaje.piquetero.Mortero;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class BotonMortero extends BotonTienda 
{
	public BotonMortero(Juego j) 
	{
		super(j, "Mortero");
	}

	@Override
	public Entidad crearEntidad(Juego j) 
	{
		return new Mortero(j);
	}
	
}
