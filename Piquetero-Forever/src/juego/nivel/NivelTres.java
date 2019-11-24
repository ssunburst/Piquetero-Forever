package juego.nivel;

import juego.Juego;
import juego.entidad.personaje.enemigo.MechaBullrich;
import juego.entidad.personaje.enemigo.Monstruo;
import juego.entidad.personaje.enemigo.Motaro;

public class NivelTres extends Nivel 
{
	public NivelTres(Juego j)
	{
		super(j, 10);
		this.espaciado = 96;
	}
	
	@Override
	protected void inicializarEnemigos() 
	{
		this.mas = new Monstruo(this.juego);
		this.normal = new Motaro(this.juego);
		this.menos = new Motaro(this.juego);	
	}
}
