package juego.nivel;

import juego.Juego;
import juego.entidad.personaje.enemigo.Enemigo;
import juego.entidad.personaje.enemigo.MechaBullrich;
import juego.entidad.personaje.enemigo.Monstruo;
import juego.entidad.personaje.enemigo.Motaro;
import juego.entidad.personaje.enemigo.Terminator;

public class NivelTres extends Nivel 
{
	public NivelTres(Juego j)
	{
		super(j, 10);
		this.espaciado = 96;
	}

	@Override
	protected Enemigo producirMas() {
		return new Terminator(this.juego);
	}

	@Override
	protected Enemigo producirMedio() {
		return new Motaro(this.juego);
	}

	@Override
	protected Enemigo producirMenos() {
		return new Monstruo(this.juego);
	}
}
