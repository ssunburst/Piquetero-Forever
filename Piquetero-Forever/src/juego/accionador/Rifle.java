package juego.accionador;

import juego.Juego;
import juego.entidad.proyectil.BolaDeFuegoB;
import juego.entidad.proyectil.Proyectil;

public class Rifle extends Arma 
{
	public Rifle(Juego j) 
	{
		super(j);
	}

	@Override
	public Proyectil disparar() 
	{
		return new BolaDeFuegoB(juego);
	}
}
