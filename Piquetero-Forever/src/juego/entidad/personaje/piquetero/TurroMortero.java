package juego.entidad.personaje.piquetero;

import grafico.piquetero.GraficoMortero;
import juego.Juego;
import juego.accionador.AccionadorRango;
import juego.accionador.Mortero;
import juego.entidad.Entidad;
import juego.entidad.proyectil.Peronball;
import juego.entidad.proyectil.Proyectil;

public class TurroMortero extends Piquetero 
{	
	public TurroMortero(Juego j) 
	{
		super(j);
		this.accionador = new AccionadorRango(this, 90, new Mortero(j));
		this.velocidad = 2;
		this.precio = 170;
		this.vida = 100;
		this.grafico = new GraficoMortero(this);
	}
}
