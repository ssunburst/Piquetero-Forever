package juego.powerup;

import juego.Juego;

public class PowerUps 
{
	protected PowerUp[] pups;
	protected Juego juego;
	
	public PowerUps(Juego j)
	{
		juego = j;
		pups = new PowerUp[4];
		pups[0] = new ChoriAsfalto(juego);
		pups[1] = new ChoriClasico(juego);
		pups[2] = new ChoriCongelado(juego);
		pups[3] = new ChoriToxico(juego);
	}
	
	public int totalPowerUps()
	{
		return pups.length;
	}
	
	public PowerUp getPowerUp(int p)
	{
		return pups[p];
	}
}
