package juego.entidad.personaje.piquetero;

import grafico.piquetero.GraficoMortero;
import juego.Juego;

public class Mortero extends Piquetero 
{	
	public Mortero(Juego j) 
	{
		super(j);
		this.velocidad = 2;
		this.precio = 100;
		this.dagno = 70;
		this.velocidadAtaque = 3;
		this.vida = 50;
		this.grafico = new GraficoMortero(this);
	}

}
