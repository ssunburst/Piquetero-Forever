package juego.entidad.personaje;

import grafico.Grafico;
import juego.Juego;
import juego.accionador.Accionador;
import juego.entidad.Entidad;

public abstract class Personaje extends Entidad
{
	protected int armadura;
	
	protected Personaje(Juego j) 
	{
		super(j);
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
		this.vida -= d;
		if (vida <= 0)
			this.morir();
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
	
	@Override
	public Entidad clonar() 
	{
		return null;
	}
}
