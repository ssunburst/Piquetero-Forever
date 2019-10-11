package juego.personaje.proyectil;

import juego.Juego;
import visitor.*;

public abstract class ProyectilAmigo extends Proyectil
{

	public ProyectilAmigo(Juego j) {
		super(j);
		this.visitor = new VisitorPiquetero(this);
	}

	@Override
	public void accionar() 
	{
		//TODO mover a derecha -> detectar coliciones -> atacar
	}
}
