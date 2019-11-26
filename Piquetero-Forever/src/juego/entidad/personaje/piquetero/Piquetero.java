package juego.entidad.personaje.piquetero;

import grafico.GraficoEntidad;
import grafico.detector.DetectorHaciaDerecha;
import visitor.Visitor;
import juego.Juego;
import juego.accionador.AccionadorPersonaje;
import juego.entidad.Entidad;
import juego.entidad.personaje.Personaje;
import visitor.VisitorPiquetero;

public abstract class Piquetero extends Personaje 
{	
	
	protected Piquetero(Juego j)
	{
		super(j);
		this.direccion = ESTATICO;
		this.detector = new DetectorHaciaDerecha(j, this);
		this.visitor = new VisitorPiquetero(this);
	}
	
	@Override
	public void aceptar(Visitor v) 
	{
		v.visitar(this);
	}

	@Override
	public void vender() 
	{
		this.juego.gastarMonedas(-(this.precio/2));
		this.juego.quitarEntidad(this);
	}
}
