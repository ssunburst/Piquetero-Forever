package juego.entidad.personaje.enemigo;

import grafico.enemigo.GraficoMotaro;
import juego.Juego;
import juego.accionador.AccionadorMelee;

public class Motaro extends Enemigo 
{
	public Motaro(Juego j) {
		super(j);
		this.accionador = new AccionadorMelee(this, 20);
		this.grafico = new GraficoMotaro(this);
		this.dagno = 300;
		this.vida = 400;
		this.velocidad = 5;
		this.recompensa = 120;
		this.puntaje = 300;
	}
}
