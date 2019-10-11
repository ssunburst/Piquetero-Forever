package visitor;

import juego.personaje.piquetero.Piquetero;
import juego.personaje.ffaa.Enemigo;
import juego.Entidad;
import juego.personaje.proyectil.Proyectil;
import juego.personaje.proyectil.ProyectilAmigo;
import juego.personaje.proyectil.ProyectilEnemigo;

public abstract class Visitor 
{
	protected Entidad entidad;
	
	public Visitor(Entidad e)
	{
		this.entidad = e;
	}
	
	public abstract void visitarPiquetero(Piquetero e);
	
	public abstract void visitarFFAA(Enemigo e);
}
