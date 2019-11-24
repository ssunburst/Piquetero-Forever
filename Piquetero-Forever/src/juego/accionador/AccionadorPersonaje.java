package juego.accionador;

import juego.entidad.personaje.Personaje;
import juego.entidad.Entidad;

public abstract class AccionadorPersonaje implements Accionador
{
	public Personaje personaje;
	public int demora;
	public int demoraConsumida;
	
	protected AccionadorPersonaje (Personaje p, int d)
	{
		personaje = p;
		this.demora = d;
		demoraConsumida = 0;
	}
	
	protected boolean comprobarDemora()
	{
		if (demoraConsumida == demora)
		{
			demoraConsumida = 0;
			return true;
		}
		else
		{
			demoraConsumida++;
			return false;
		}
	}
}
