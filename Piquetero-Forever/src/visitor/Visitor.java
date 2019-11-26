package visitor;

import juego.entidad.personaje.enemigo.Enemigo;
import juego.entidad.personaje.piquetero.Piquetero;
import juego.entidad.proyectil.Proyectil;
import juego.entidad.objeto.Barril;
import juego.entidad.objeto.Lava;

public abstract class Visitor 
{
	public Visitor() 
	{
	}
	
	public void visitar(Piquetero e) {}
	
	public void visitar(Enemigo e) {}
	
	public void visitar(Proyectil p) {}
	
	public void visitar(Barril b) {}
	
	public void visitar(Lava a) {}
	
}
