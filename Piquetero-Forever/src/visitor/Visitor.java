package visitor;

import juego.entidad.Entidad;
import juego.entidad.personaje.enemigo.Enemigo;
import juego.entidad.personaje.piquetero.Piquetero;
import juego.entidad.proyectil.Proyectil;
import juego.entidad.proyectil.ProyectilAmigo;
import juego.entidad.proyectil.ProyectilEnemigo;
import juego.entidad.proyectil.Proyectil;
import juego.entidad.objeto.Barril;
import juego.entidad.objeto.Lava;

public abstract class Visitor 
{
	protected Entidad entidad;
	
	protected Visitor(Entidad e)
	{
		this.entidad = e;
	}
	
	public abstract void visitarPiquetero(Piquetero e);
	
	public abstract void visitarEnemigo(Enemigo e);
	
	public void visitarDisparo(Proyectil p) {}
	
	public void visitarBarril(Barril b) {}
	
	public void visitarLava(Lava a) {}
	
}
