package juego.nivel;

import juego.Juego;
import juego.entidad.personaje.enemigo.MechaBullrich;
import juego.entidad.personaje.enemigo.Motaro;
import juego.entidad.personaje.enemigo.Terminator;

public class NivelUno extends Nivel 
{
	public NivelUno(Juego j)
	{
		super(j);
		this.espaciado = 97;
	}
	
	@Override
	protected void inicializarEnemigos() 
	{
		this.mas = new Terminator(this.juego);
		this.normal = new MechaBullrich(this.juego);
		this.menos = new Motaro(this.juego);	
	}
}
