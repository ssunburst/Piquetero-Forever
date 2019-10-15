package juego.entidad.personaje.enemigo;

import grafico.Grafico;
import juego.Juego;
import juego.entidad.Entidad;
import juego.entidad.personaje.Personaje;
import juego.objeto.Objeto;
import visitor.Visitor;
import visitor.VisitorEnemigo;

public abstract class Enemigo extends Personaje
{
	protected Objeto premio;
	protected int recompensa;	// Cantidad de monedas otorgadas
	protected int puntaje;		// Puntos otorgados al jugador
	
	public Enemigo(Juego j) 
	{
		super(j);
		this.visitor = new VisitorEnemigo(this);
	}
	
	@Override
	public void aceptar(Visitor v)
	{
		v.visitarEnemigo(this);
	}
}
