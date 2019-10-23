package visitor;

import juego.entidad.Entidad;
import juego.entidad.personaje.enemigo.Enemigo;
import juego.entidad.personaje.piquetero.Piquetero;

public class VisitorEnemigo extends Visitor
{

	public VisitorEnemigo(Entidad e) 
	{
		super(e);
	}
	
	@Override
	public void visitarPiquetero(Piquetero e) 
	{
		this.entidad.atacar(e);
	}

	@Override
	public void visitarEnemigo(Enemigo e) 
	{
		
	}
	
}
