package juego.personaje.piquetero;

import grafico.piquetero.GraficoMortero;

public class Mortero extends Piquetero 
{	
	public Mortero() 
	{
		this.precio = 100;
		this.dagno = 70;
		this.velocidadAtaque = 3;
		this.vida = 50;
		this.grafico = new GraficoMortero(this);
	}
}
