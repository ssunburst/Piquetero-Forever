package juego.entidad.proyectil;

import juego.Juego;
import juego.entidad.Entidad;
import visitor.VisitorFFAA;

public abstract class ProyectilEnemigo extends Proyectil
{

	public ProyectilEnemigo(Juego j) {
		super(j);
		this.visitor = new VisitorFFAA(this);
	}
	
	@Override
	public void accionar() 
	{
		// TODO mover a izquierda, detectar colisiones -> atacar
	}
}
