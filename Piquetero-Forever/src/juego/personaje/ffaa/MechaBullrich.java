package juego.personaje.ffaa;

import grafico.Grafico;
import juego.Entidad;
import juego.personaje.Personaje;

public class MechaBullrich extends Personaje {
	
	public MechaBullrich() 
	{
		this.armadura = 100;
		this.dagno = 100;
		this.velocidad = 10;
		this.vida = 700;
		this.grafico = null;
	}

	@Override
	public void atacar(Entidad e) {
		// TODO Auto-generated method stub
		
	}
}
