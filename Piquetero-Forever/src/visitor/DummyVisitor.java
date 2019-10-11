package visitor;

import juego.Entidad;
import juego.personaje.ffaa.Enemigo;
import juego.personaje.piquetero.Piquetero;

/*
 * Visitante para aquellas clases que no efectuan acciones directamente sobre otras.
 */
public class DummyVisitor extends Visitor 
{

	public DummyVisitor(Entidad e) {
		super(e);
	}

	@Override
	public void visitarPiquetero(Piquetero e) {}

	@Override
	public void visitarFFAA(Enemigo e) {}

}
