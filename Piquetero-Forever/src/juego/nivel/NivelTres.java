package juego.nivel;

import juego.Juego;
import juego.entidad.personaje.enemigo.MechaBullrich;

public class NivelTres extends Nivel 
{
	public NivelTres(Juego j)
	{
		super(j);
		this.espaciado = 96;
	}
	
	@Override
	protected void inicializarEnemigos() 
	{
		this.mas = new MechaBullrich(this.juego);
		this.normal = new MechaBullrich(this.juego);
		this.menos = new MechaBullrich(this.juego);	
	}
}
