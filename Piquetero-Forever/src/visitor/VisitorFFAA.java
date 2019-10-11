package visitor;

import juego.personaje.ffaa.Enemigo;
import juego.personaje.piquetero.Piquetero;
import juego.Entidad;

// Visitor para unidades que no visitan a otras.
public class VisitorFFAA extends Visitor
{

	public VisitorFFAA(Entidad e) 
	{
		super(e);
	}
	
	@Override
	public void visitarPiquetero(Piquetero e) 
	{
		this.entidad.atacar(e);
	}

	@Override
	public void visitarFFAA(Enemigo e) {}
	
}
