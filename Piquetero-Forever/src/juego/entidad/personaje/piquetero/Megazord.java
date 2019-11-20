package juego.entidad.personaje.piquetero;

import grafico.piquetero.GraficoMegazord;
import juego.Juego;
import juego.accionador.AccionadorMelee;
import juego.entidad.Entidad;

public class Megazord extends Piquetero 
{

	public Megazord(Juego j) {
		super(j);
		this.accionador = new AccionadorMelee(this, 60);
		this.vida = 400;
		this.precio = 300;
		this.dagno = 400;
		this.grafico = new GraficoMegazord(this);
	}
	
	@Override
	public Entidad clonar() 
	{
		return new Megazord(this.juego);
	}

}
