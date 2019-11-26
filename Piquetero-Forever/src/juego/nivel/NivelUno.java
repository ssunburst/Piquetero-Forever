package juego.nivel;

import juego.Juego;
import juego.entidad.personaje.enemigo.MechaBullrich;
import juego.entidad.personaje.enemigo.Motaro;
import juego.entidad.personaje.enemigo.Terminator;
import juego.entidad.personaje.enemigo.Bison;
import juego.entidad.personaje.enemigo.Enemigo;
import juego.entidad.personaje.enemigo.Monstruo;

public class NivelUno extends Nivel 
{
	public NivelUno(Juego j)
	{
		super(j, 6);
		this.espaciado = 98;
	}
	
	

	@Override
	protected Enemigo producirMas() {
		return new MechaBullrich(this.juego);
	}

	@Override
	protected Enemigo producirMedio() {
		return new Bison(this.juego);
	}

	@Override
	protected Enemigo producirMenos() {
		return new Bison(this.juego);
	}	
}
