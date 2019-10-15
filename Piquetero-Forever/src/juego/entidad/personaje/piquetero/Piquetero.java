package juego.entidad.personaje.piquetero;

import grafico.Grafico;
import visitor.Visitor;
import juego.Juego;
import juego.entidad.Entidad;
import juego.entidad.personaje.Personaje;
import visitor.VisitorPiquetero;

public abstract class Piquetero extends Personaje 
{	
	
	public Piquetero(Juego j) 
	{
		super(j);
		this.velocidad = 0;
		this.visitor = new VisitorPiquetero(this);
	}
	
	@Override
	public void aceptar(Visitor v) 
	{
		v.visitarPiquetero(this);
	}

	@Override
	public void vender() 
	{
		this.juego.gastarMonedas(-(this.precio/2));
		this.juego.quitarEntidad(this);
	}
}
