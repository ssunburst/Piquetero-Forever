package juego.estado;

import java.awt.Point;

import juego.entidad.personaje.Personaje;

public class Normal implements Estado
{
	protected Personaje personaje;
	
	public Normal(Personaje p)
	{
		personaje = p;
	}
	
	@Override
	public void mover() 
	{
		Point p = personaje.getGrafico().getLocation();
		double x = p.getX() + personaje.getVelocidad()*personaje.getDireccion();
		double y = p.getY();
		p.setLocation(x, y);
		personaje.getGrafico().setLocation(p);
	}

	@Override
	public void recibirDagno(int d) 
	{
		personaje.setVida(personaje.getVida() - d);
		if (personaje.getVida() <= 0)
			personaje.morir();
	}

}
