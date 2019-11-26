package visitor;

import juego.entidad.personaje.enemigo.Enemigo;
import juego.powerup.PowerUp;

public class VisitorChoriToxico extends VisitorPowerUp
{

	public VisitorChoriToxico(PowerUp p) {
		super(p);
	}
	
	@Override
	public void visitar(Enemigo e) 
	{
		e.recibirDagno(100);
	}

}
