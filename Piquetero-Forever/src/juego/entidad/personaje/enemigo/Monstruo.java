package juego.entidad.personaje.enemigo;

import grafico.enemigo.GraficoMonstruo;
import juego.Juego;
import juego.accionador.AccionadorMelee;

public class Monstruo extends Enemigo {

	public Monstruo(Juego j)
	{
		super(j);
		this.accionador = new AccionadorMelee(this, 40);
		this.dagno = 300;
		this.vida = 2500;
		this.velocidad = 2;
		this.recompensa = 500;
		this.puntaje = 1000;
		this.grafico = new GraficoMonstruo(this);
	}
}
