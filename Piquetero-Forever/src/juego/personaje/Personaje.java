package juego.personaje;

import grafico.Grafico;
import juego.Entidad;
import juego.Juego;

public abstract class Personaje extends Entidad
{
	protected int velocidadAtaque;
	protected int armadura;
	
	public Personaje(Juego j) 
	{
		super(j);
	}
	
	public int getVelocidadAtaque() {
		return velocidadAtaque;
	}

	public void setVelocidadAtaque(int velocidadAtaque) {
		this.velocidadAtaque = velocidadAtaque;
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
	public void accionar() 
	{
		// NO DEBERIA ESTAR IMPLEMENTADO ACA		
	}
}
