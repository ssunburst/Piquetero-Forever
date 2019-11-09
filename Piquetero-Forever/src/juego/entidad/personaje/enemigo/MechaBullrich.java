package juego.entidad.personaje.enemigo;

import grafico.enemigo.GraficoMBullrich;
import juego.Juego;
import juego.accionador.AccionadorRango;
import juego.entidad.proyectil.BolaDeFuegoA;
import visitor.Visitor;
import visitor.VisitorEnemigo;

public class MechaBullrich extends Enemigo {
	
	public MechaBullrich(Juego j)
	{
		super(j);
		this.proyectil = new BolaDeFuegoA(j);
		this.puntaje = 100;
		this.recompensa = 70;
		this.accionador = new AccionadorRango(this, 50);
		this.velocidad = 3;
		this.vida = 100;
		this.grafico = new GraficoMBullrich(this);
	}
	
	@Override
	public Enemigo clonar() {
		return new MechaBullrich(this.juego);
	}
}
