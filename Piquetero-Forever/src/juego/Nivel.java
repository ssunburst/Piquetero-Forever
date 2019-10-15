package juego;
import java.util.List;

import juego.entidad.personaje.enemigo.Enemigo;

import java.util.LinkedList;

public class Nivel 
{
	protected List<Enemigo>[] oleadas;
	protected List<Enemigo> oleadaActiva;
	
	public Nivel(int o)
	{
		oleadas = (List<Enemigo>[])new List[o];
	}
}
