package visitor;

import juego.powerup.PowerUp;

public class VisitorPowerUp extends Visitor 
{
	PowerUp pup;
	
	public VisitorPowerUp(PowerUp p) 
	{
		super();
		pup = p;
	}
}
