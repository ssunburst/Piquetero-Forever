package visitor;

import juego.entidad.Entidad;
import juego.entidad.personaje.ffaa.Enemigo;
import juego.entidad.personaje.piquetero.Piquetero;

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
