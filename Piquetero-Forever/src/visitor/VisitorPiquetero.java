package visitor;

import juego.entidad.Entidad;
import juego.entidad.personaje.enemigo.Enemigo;
import juego.entidad.personaje.piquetero.Piquetero;
import juego.entidad.proyectil.ProyectilAmigo;
import juego.entidad.proyectil.ProyectilEnemigo;

public class VisitorPiquetero extends VisitorEntidad
{
	
	public VisitorPiquetero(Entidad e)
	{
		super(e);
	}

	@Override
	public void visitar(Enemigo e) 
	{
		this.entidad.atacar(e);
	}
}
