package juego.accionador;

import juego.Juego;
import juego.entidad.proyectil.Peronball;
import juego.entidad.proyectil.Proyectil;

public class Mortero extends Arma
{
	public Mortero(Juego j) 
	{
		super(j);
	}

	@Override
	public Proyectil disparar() {
		return new Peronball(juego);
	}
}
