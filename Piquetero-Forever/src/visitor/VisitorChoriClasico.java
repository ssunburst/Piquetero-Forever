package visitor;

import juego.entidad.Entidad;
import juego.entidad.personaje.piquetero.Piquetero;
import juego.powerup.PowerUp;

public class VisitorChoriClasico extends VisitorPowerUp {

	public VisitorChoriClasico(PowerUp p) {
		super(p);
	}
	
	@Override
	public void visitar(Piquetero e) 
	{
		e.setVida(e.getVida() + 200);
	}

}
