package juego.nivel;

import juego.Juego;
import juego.entidad.personaje.enemigo.Bison;
import juego.entidad.personaje.enemigo.Enemigo;
import juego.entidad.personaje.enemigo.MechaBullrich;
import juego.entidad.personaje.enemigo.Motaro;
import juego.entidad.personaje.enemigo.Terminator;

public class NivelDos extends Nivel 
{
	public NivelDos(Juego j)
	{
		super(j, 8);
		this.espaciado = 97;
	}

	@Override
	protected Enemigo producirMas() 
	{
		return new Terminator(this.juego);
	}

	@Override
	protected Enemigo producirMedio() {
		return new Bison(this.juego);
	}

	@Override
	protected Enemigo producirMenos() 
	{
		return new Motaro(this.juego);
	}
}
