package juego.entidad.personaje.piquetero;

import grafico.piquetero.GraficoCapAmerica;
import juego.Juego;
import juego.accionador.AccionadorMelee;
import juego.entidad.Entidad;

public class CapitanAmerica extends Piquetero 
{

	public CapitanAmerica(Juego j) {
		super(j);
		this.accionador = new AccionadorMelee(this, 40);
		this.grafico = new GraficoCapAmerica(this);
		this.vida = 150;
		this.dagno = 70;
		this.precio = 50;
	}
	
	@Override
	public Entidad clonar() {
		return new CapitanAmerica(this.juego);
	}
}
