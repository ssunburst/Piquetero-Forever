package juego.entidad.personaje.piquetero;

import grafico.piquetero.GraficoSubZero;
import juego.Juego;
import juego.entidad.Entidad;
import juego.accionador.AccionadorMelee;

public class SubZero extends Piquetero 
{
	public SubZero(Juego j)
	{
		super(j);
		this.grafico = new GraficoSubZero(this);
		this.accionador = new AccionadorMelee(this, 20);
		this.precio = 100;
		this.vida = 400;
		this.dagno = 100;
	}
}
