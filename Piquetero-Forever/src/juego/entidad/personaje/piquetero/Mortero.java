package juego.entidad.personaje.piquetero;

import grafico.piquetero.GraficoMortero;
import juego.Juego;
import juego.accionador.AccionadorMelee;

public class Mortero extends Piquetero 
{	
	public Mortero(Juego j) 
	{
		super(j);
		this.accionador = new AccionadorMelee(this, 30);
		this.velocidad = 2;
		this.precio = 100;
		this.dagno = 70;
		this.vida = 50;
		this.grafico = new GraficoMortero(this);
	}

}
