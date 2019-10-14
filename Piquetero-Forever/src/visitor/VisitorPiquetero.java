package visitor;

import juego.entidad.Entidad;
import juego.entidad.personaje.ffaa.Enemigo;
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
	public void visitarFFAA(Enemigo e) 
	{
		this.entidad.atacar(e);
	}
}
