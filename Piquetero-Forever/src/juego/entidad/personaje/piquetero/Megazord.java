package juego.entidad.personaje.piquetero;

import grafico.piquetero.GraficoMegazord;
import juego.Juego;
import juego.accionador.AccionadorMelee;
import juego.entidad.Entidad;

public class Megazord extends Piquetero 
{

	public Megazord(Juego j) {
		super(j);
		this.accionador = new AccionadorMelee(this, 20);
		this.vida = 400;
		this.precio = 500;
		this.dagno = 600;
		this.grafico = new GraficoMegazord(this);
	}
}
