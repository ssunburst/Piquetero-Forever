package juego.nivel;

import juego.Juego;
import juego.entidad.personaje.enemigo.MechaBullrich;
import juego.entidad.personaje.enemigo.Motaro;
import juego.entidad.personaje.enemigo.Terminator;
import juego.entidad.personaje.enemigo.Bison;
import juego.entidad.personaje.enemigo.Monstruo;

public class NivelUno extends Nivel 
{
	public NivelUno(Juego j)
	{
		super(j, 6);
		this.espaciado = 98;
	}
	
	@Override
	protected void inicializarEnemigos() 
	{
		this.mas = new MechaBullrich(this.juego);
		this.normal = new Terminator(this.juego);
		this.menos = new Bison(this.juego);
	}
}
