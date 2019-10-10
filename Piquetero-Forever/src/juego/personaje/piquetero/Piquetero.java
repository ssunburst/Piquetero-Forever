package juego.personaje.piquetero;

import grafico.Grafico;
import juego.Entidad;
import juego.personaje.Personaje;

public abstract class Piquetero extends Personaje 
{	
	protected int precio;
	
	public Piquetero() 
	{
		velocidad = 0;
	}

	@Override
	public void atacar(Entidad e) {
		// TODO Auto-generated method stub
		
	}
	
	public int getPrecio()
	{
		return precio;
	}
}
