package juego.entidad.personaje.enemigo;

import grafico.enemigo.GraficoTerminator;
import juego.Juego;
import juego.accionador.AccionadorRango;
import juego.entidad.proyectil.BolaDeFuegoB;

public class Terminator extends Enemigo
{

	public Terminator(Juego j) {
		super(j);
		this.accionador = new AccionadorRango(this, 50);
		this.grafico = new GraficoTerminator(this);
		this.velocidad = 2;
		this.proyectil = new BolaDeFuegoB(j);
		this.vida = 150;
		this.puntaje = 70;
		this.recompensa = 20;
	}
	
	@Override
	public Enemigo clonar() 
	{
		return new Terminator(this.juego);
	}

}
