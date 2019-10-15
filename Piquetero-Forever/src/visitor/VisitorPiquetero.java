package visitor;

import juego.entidad.Entidad;
import juego.entidad.personaje.enemigo.Enemigo;
import juego.entidad.personaje.piquetero.Piquetero;
import juego.entidad.proyectil.ProyectilAmigo;
import juego.entidad.proyectil.ProyectilEnemigo;

public class VisitorPiquetero extends Visitor
{
	
	public VisitorPiquetero(Entidad e)
	{
		super(e);
	}
	
	@Override
	public void visitarPiquetero(Piquetero e) 
	{	
	}

	@Override
	public void visitarEnemigo(Enemigo e) 
	{
		this.entidad.atacar(e);
	}
}
