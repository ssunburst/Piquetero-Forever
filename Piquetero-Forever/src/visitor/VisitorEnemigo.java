package visitor;

import juego.entidad.Entidad;
import juego.entidad.objeto.Lava;
import juego.entidad.objeto.Barril;
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
	
	@Override
	public void visitarBarril(Barril b) 
	{
		entidad.atacar(b);
	}
	
	@Override
	public void visitarLava(Lava a) 
	{
		entidad.recibirDagno(a.getDagno());
	}
}
