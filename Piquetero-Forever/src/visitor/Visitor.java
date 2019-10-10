package visitor;

import juego.personaje.piquetero.Piquetero;
import juego.personaje.ffaa.Enemigo;
import juego.Entidad;

public abstract class Visitor 
{
	protected Entidad entidad;
	
	public abstract void visitarPiquetero(Piquetero e);
	
	public abstract void visitarFFAA(Enemigo e);
}
