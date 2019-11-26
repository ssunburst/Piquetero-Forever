package grafico;

import javax.swing.*;

import grafico.detector.DetectorColisiones;
import juego.entidad.Entidad;

import java.awt.*;
import java.awt.event.*;
import java.lang.Iterable;

public abstract class GraficoEntidad extends Grafico
{
	protected Entidad entidad;
	
	public GraficoEntidad(Entidad e) 
	{
		super();
		this.entidad = e;
	}	
	
	public Entidad getEntidad()
	{
		return this.entidad;
	}
	
	
	public int posIdle()
	{
		return 0;
	}
	
	public abstract int posAtaque();
}
