package juego.personaje;

import grafico.Grafico;
import juego.Entidad;

public abstract class Personaje extends Entidad
{
	protected int vida;
	protected int velocidadAtaque;
	protected int armadura;
	
	
	public Personaje() 
	{
		this.armadura = 0;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
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
}
