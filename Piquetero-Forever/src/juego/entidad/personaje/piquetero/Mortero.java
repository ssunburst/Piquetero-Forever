package juego.entidad.personaje.piquetero;

import grafico.piquetero.GraficoMortero;
import juego.Juego;
import juego.accionador.AccionadorRango;
import juego.entidad.Entidad;
import juego.entidad.proyectil.Peronball;

public class Mortero extends Piquetero 
{	
	public Mortero(Juego j) 
	{
		super(j);
		this.accionador = new AccionadorRango(this, 90);
		this.proyectil = new Peronball(j);
		this.velocidad = 2;
		this.precio = 170;
		this.vida = 100;
		this.grafico = new GraficoMortero(this);
	}
	
	@Override
	public Entidad clonar() {
		return new Mortero(this.juego);
	}

}
