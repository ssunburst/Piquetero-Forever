package visitor;

import juego.personaje.ffaa.Enemigo;
import juego.personaje.piquetero.Piquetero; 

public class VisitorPiquetero extends Visitor
{
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
