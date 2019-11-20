package juego.entidad.personaje.enemigo;

import java.awt.Point;

import grafico.Grafico;
import grafico.detector.DetectorHaciaIzquierda;
import juego.Juego;
import juego.entidad.Entidad;
import juego.entidad.objeto.Objeto;
import juego.entidad.personaje.Personaje;
import visitor.Visitor;
import visitor.VisitorEnemigo;

public abstract class Enemigo extends Personaje
{
	protected Objeto premio;
	protected int recompensa;	// Cantidad de monedas otorgadas
	protected int puntaje;		// Puntos otorgados al jugador
	
	protected Enemigo(Juego j) 
	{
		super(j);
		this.direccion = IZQUIERDA;
		this.detector = new DetectorHaciaIzquierda(j, this);
		this.visitor = new VisitorEnemigo(this);
	}
	
	@Override
	public void aceptar(Visitor v)
	{
		v.visitarEnemigo(this);
	}
	
	@Override
	public void morir() {
		super.morir();
		this.juego.ganarPuntos(this.puntaje);
		this.juego.ganarMonedas(this.recompensa);
	}
	
	@Override
	public void mover() {
		super.mover();
		comprobarFinalizacion();
	}
	
	@Override
	public abstract Enemigo clonar();
	
	public void comprobarFinalizacion()
	{
		Point p = this.grafico.getLocation();
		if (p.getX() + this.grafico.getWidth() <= 0)
			this.juego.terminarJuego(false);
	}
}
