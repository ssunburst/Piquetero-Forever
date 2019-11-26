package visitor;

import juego.entidad.Entidad;
import juego.entidad.personaje.enemigo.Enemigo;
import juego.entidad.personaje.piquetero.Piquetero;
import juego.estado.Ralentizado;
import juego.powerup.PowerUp;

public class VisitorChoriCongelado extends VisitorPowerUp
{

	public VisitorChoriCongelado(PowerUp p) 
	{
		super(p);
	}

	@Override
	public void visitar(Enemigo e) {
		e.setEstado(new Ralentizado(e));
	}

}
