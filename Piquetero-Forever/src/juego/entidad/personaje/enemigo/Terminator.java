package juego.entidad.personaje.enemigo;

import grafico.enemigo.GraficoTerminator;
import juego.Juego;
import juego.accionador.AccionadorRango;
import juego.entidad.proyectil.BolaDeFuegoA;
import juego.entidad.proyectil.BolaDeFuegoB;
import juego.entidad.proyectil.Proyectil;

public class Terminator extends Enemigo
{

	public Terminator(Juego j) {
		super(j);
		this.accionador = new AccionadorRango(this, 50);
		this.grafico = new GraficoTerminator(this);
		this.velocidad = 2;
		this.vida = 300;
		this.puntaje = 70;
		this.recompensa = 100;
	}
	
	@Override
	public Proyectil disparar() 
	{
		return new BolaDeFuegoB(this.juego);
	}
}
