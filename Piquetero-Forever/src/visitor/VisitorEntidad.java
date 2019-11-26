package visitor;

import juego.entidad.Entidad;

public abstract class VisitorEntidad extends Visitor 
{
	protected Entidad entidad;
	
	public VisitorEntidad(Entidad e)
	{
		this.entidad = e;
	}
}
