package juego.entidad.personaje.enemigo;

import grafico.enemigo.GraficoMBullrich;
import juego.Juego;
import juego.accionador.AccionadorRango;
import juego.entidad.proyectil.BolaDeFuego;
import visitor.Visitor;
import visitor.VisitorEnemigo;

public class MechaBullrich extends Enemigo {
	
	public MechaBullrich(Juego j)
	{
		super(j);
		this.proyectil = new BolaDeFuego(j);
		this.puntaje = 100;
		this.recompensa = 34;
		this.armadura = 0;
		this.accionador = new AccionadorRango(this, 50);
		this.dagno = 10;
		this.velocidad = 2;
		this.vida = 100;
		this.grafico = new GraficoMBullrich(this);
	}
}
