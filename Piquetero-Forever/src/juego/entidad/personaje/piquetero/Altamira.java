package juego.entidad.personaje.piquetero;

import juego.Juego;
import juego.accionador.AccionadorMelee;
import grafico.piquetero.GraficoAltamira;

public class Altamira extends Piquetero 
{

	public Altamira(Juego j) 
	{
		super(j);
		this.accionador = new AccionadorMelee(this, 20);
		this.grafico = new GraficoAltamira(this);
		this.dagno = 250;
		this.vida = 300;
		this.precio = 300;
	}

}
