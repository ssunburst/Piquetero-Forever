package visitor;

import juego.entidad.Entidad;
import juego.entidad.personaje.ffaa.Enemigo;
import juego.entidad.personaje.piquetero.Piquetero;
import juego.entidad.proyectil.Proyectil;
import juego.entidad.proyectil.ProyectilAmigo;
import juego.entidad.proyectil.ProyectilEnemigo;

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
