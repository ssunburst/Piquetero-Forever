package juego.nivel;

import juego.Juego;
import juego.entidad.personaje.enemigo.MechaBullrich;

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
		this.normal = new MechaBullrich(this.juego);
		this.menos = new MechaBullrich(this.juego);	
	}
}
