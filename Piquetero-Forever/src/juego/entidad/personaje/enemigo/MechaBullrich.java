package juego.entidad.personaje.enemigo;

import juego.Juego;

public class MechaBullrich extends Enemigo {
	
	public MechaBullrich(Juego j)
	{
		super(j);
		this.armadura = 100;
		this.dagno = 100;
		this.velocidad = 10;
		this.vida = 700;
		this.grafico = null;
	}
}
