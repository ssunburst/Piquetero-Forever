package visitor;

import juego.entidad.Entidad;
import juego.entidad.personaje.piquetero.Piquetero;
import juego.estado.Invulnerable;
import juego.powerup.PowerUp;

public class VisitorChoriAsfalto extends VisitorPowerUp
{

	public VisitorChoriAsfalto(PowerUp p) {
		super(p);
	}
	
	@Override
	public void visitar(Piquetero e) {
		e.setEstado(new Invulnerable(e));
	}

}
