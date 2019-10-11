package juego.personaje.piquetero;

import grafico.Grafico;
import juego.Entidad;
import juego.personaje.Personaje;
import visitor.Visitor;
import juego.Juego;

public abstract class Piquetero extends Personaje 
{	
	protected int precio;
	
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
	
	public int getPrecio()
	{
		return precio;
	}
	
	public void vender()
	{
		this.juego.gastarMonedas(-(this.precio));
		this.juego.quitarEntidad(this);
	}
}
