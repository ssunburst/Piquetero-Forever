package juego.accionador;

import juego.Juego;
import juego.entidad.proyectil.BolaDeFuegoA;
import juego.entidad.proyectil.Proyectil;

public class Pistola extends Arma
{
	public Pistola(Juego j) 
	{
		super(j);
	}

	@Override
	public Proyectil disparar() {
		return new BolaDeFuegoA(juego);
	}

}
