package juego.entidad.personaje.piquetero;

import grafico.piquetero.GraficoSubZero;
import juego.Juego;

public class SubZero extends Piquetero 
{
	public SubZero(Juego j)
	{
		super(j);
		this.grafico = new GraficoSubZero(this);
		this.velocidad = 3;
		this.precio = 100;
	}
}
