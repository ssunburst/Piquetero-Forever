package visitor;

import juego.personaje.ffaa.Enemigo;
import juego.personaje.piquetero.Piquetero;
import juego.personaje.proyectil.ProyectilAmigo;
import juego.personaje.proyectil.ProyectilEnemigo; 
import juego.Entidad;

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
