package juego.personaje.ffaa;

import grafico.Grafico;
import juego.Juego;
import juego.Entidad;
import juego.objeto.Objeto;
import juego.personaje.Personaje;
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
