package juego.estado;

import java.awt.Point;

import juego.entidad.personaje.Personaje;

public class Ralentizado extends Normal 
{
	protected int pasos;
	protected int pasosActuales;
	
	public Ralentizado(Personaje p, int pas) 
	{
		super(p);
		pasos = pas;
		pasosActuales = 0;
	}
	
	public Ralentizado(Personaje p)
	{
		this(p, 100);
	}
	
	@Override
	public void mover() 
	{
		int x = personaje.getGrafico().getX();
		int y = personaje.getGrafico().getY();
		personaje.getGrafico().setLocation(x + personaje.getDireccion(), y);
		pasosActuales++;
		if (pasosActuales == pasos)
			personaje.setEstado(new Normal(personaje));
	}
}
