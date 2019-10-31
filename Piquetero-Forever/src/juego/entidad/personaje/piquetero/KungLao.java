package juego.entidad.personaje.piquetero;

import grafico.piquetero.GraficoKungLao;
import juego.Juego;
import juego.accionador.AccionadorMelee;

public class KungLao extends Piquetero {

	public KungLao(Juego j)
	{
		super(j);
		this.grafico = new GraficoKungLao(this);
		this.accionador = new AccionadorMelee(this, 20);
		this.precio = 100;
		this.vida = 400;
		this.dagno = 100;
	}
	
}
