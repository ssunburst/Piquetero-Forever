package juego.entidad.personaje;

import grafico.Grafico;
import juego.Juego;
import juego.accionador.AccionadorPersonaje;
import juego.entidad.Entidad;
import juego.entidad.proyectil.Proyectil;
import juego.accionador.Accionador;

public abstract class Personaje extends Entidad
{
	protected int armadura;
	protected Accionador accionador;
	
	protected Personaje(Juego j) 
	{
		super(j);
	}
	
	@Override
	public void accionar() 
	{
		accionador.accionar();
	}
	
	@Override
	public void atacar(Entidad e) 
	{
		accionador.atacar(e);
	}

	public int getArmadura() {
		return armadura;
	}

	public void setArmadura(int armadura) {
		this.armadura = armadura;
	}
	
	@Override
	public void recibirDagno(int d) 
	{
		d = consumirArmadura(d);
		super.recibirDagno(d);
	}
	
	private int consumirArmadura(int d)
	{
		armadura -= d;
		int ret = 0;
		if (armadura < 0)
		{
			ret = -armadura;
			armadura = 0;
		}
		return ret;
	}
	
	public Proyectil disparar() 
	{
		return null;
	}
}
