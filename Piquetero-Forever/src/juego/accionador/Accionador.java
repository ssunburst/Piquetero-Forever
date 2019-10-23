package juego.accionador;

import juego.entidad.Entidad;

public abstract class Accionador 
{
	Entidad entidad;
	public int demora;
	public int demoraConsumida;
	
	public Accionador(Entidad e, int d)
	{
		this.entidad = e;
		this.demora = d;
		demoraConsumida = 0;
	}
	
	public abstract void accionar();
	
	public abstract void atacar(Entidad e);
	
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
