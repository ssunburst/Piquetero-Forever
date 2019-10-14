package juego.entidad.personaje.piquetero;

import grafico.Grafico;
import visitor.Visitor;
import juego.Juego;
import juego.entidad.Entidad;
import juego.entidad.personaje.Personaje;

public abstract class Piquetero extends Personaje 
{	
	
	public Piquetero(Juego j) 
	{
		super(j);
		velocidad = 0;
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
