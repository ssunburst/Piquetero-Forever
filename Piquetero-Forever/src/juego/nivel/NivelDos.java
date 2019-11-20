package juego.nivel;

import juego.Juego;
import juego.entidad.personaje.enemigo.Bison;
import juego.entidad.personaje.enemigo.MechaBullrich;
import juego.entidad.personaje.enemigo.Motaro;
import juego.entidad.personaje.enemigo.Terminator;

public class NivelDos extends Nivel 
{
	public NivelDos(Juego j)
	{
		super(j);
		this.espaciado = 97;
	}
	
	@Override
	protected void inicializarEnemigos() 
	{
		this.mas = new MechaBullrich(this.juego);
		this.normal = new Bison(this.juego);
		this.menos = new Motaro(this.juego);	
	}
}
