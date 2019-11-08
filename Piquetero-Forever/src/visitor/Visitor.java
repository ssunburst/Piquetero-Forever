package visitor;

import juego.entidad.Entidad;
import juego.entidad.personaje.enemigo.Enemigo;
import juego.entidad.personaje.piquetero.Piquetero;
import juego.entidad.proyectil.Proyectil;
import juego.entidad.proyectil.ProyectilAmigo;
import juego.entidad.proyectil.ProyectilEnemigo;

public abstract class Visitor 
{
	protected Entidad entidad;
	
	protected Visitor(Entidad e)
	{
		this.entidad = e;
	}
	
	public abstract void visitarPiquetero(Piquetero e);
	
	public abstract void visitarEnemigo(Enemigo e);
	
	public void visitarDisparo(Entidad e)
	{
		
	}
}
