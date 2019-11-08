package juego.entidad.personaje.enemigo;

import grafico.enemigo.GraficoMotaro;
import juego.Juego;
import juego.accionador.AccionadorMelee;

public class Motaro extends Enemigo 
{
	public Motaro(Juego j) {
		super(j);
		this.accionador = new AccionadorMelee(this, 15);
		this.grafico = new GraficoMotaro(this);
		this.dagno = 150;
		this.vida = 200;
		this.velocidad = 5;
		
	}

	@Override
	public Enemigo clonar() {
		return new Motaro(this.juego);
	}
}
