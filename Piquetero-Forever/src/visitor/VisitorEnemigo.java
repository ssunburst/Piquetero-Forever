package visitor;

import juego.entidad.Entidad;
import juego.entidad.objeto.Lava;
import juego.entidad.objeto.Barril;
import juego.entidad.personaje.enemigo.Enemigo;
import juego.entidad.personaje.piquetero.Piquetero;

public class VisitorEnemigo extends VisitorEntidad
{

	public VisitorEnemigo(Entidad e) 
	{
		super(e);
	}
	
	@Override
	public void visitar(Piquetero e) 
	{
		this.entidad.atacar(e);
	}

	@Override
	public void visitar(Enemigo e) 
	{
		
	}
	
	public void visitar(Barril b) 
	{
		entidad.atacar(b);
	}
	
	public void visitar(Lava a) 
	{
		entidad.recibirDagno(a.getDagno());
	}
}
