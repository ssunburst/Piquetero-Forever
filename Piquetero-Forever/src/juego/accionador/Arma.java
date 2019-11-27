package juego.accionador;

import juego.Juego;
import juego.entidad.proyectil.Proyectil;

public abstract class Arma 
{
	protected Juego juego;
	
	public Arma(Juego j)
	{
		juego = j;
	}
	
	public abstract Proyectil disparar();
}
