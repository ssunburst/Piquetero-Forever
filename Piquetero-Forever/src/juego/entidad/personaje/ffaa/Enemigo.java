package juego.entidad.personaje.ffaa;

import grafico.Grafico;
import juego.Juego;
import juego.entidad.Entidad;
import juego.entidad.personaje.Personaje;
import juego.objeto.Objeto;
import visitor.Visitor;

public abstract class Enemigo extends Personaje
{
	protected Objeto premio;
	protected int recompensa;	// Cantidad de monedas otorgadas
	protected int puntaje;		// Puntos otorgados al jugador
	
	public Enemigo(Juego j) 
	{
		super(j);
	}
	
	@Override
	public void aceptar(Visitor v)
	{
		v.visitarFFAA(this);
	}
}
