package juego;

import java.util.List;

import juego.entidad.personaje.enemigo.Enemigo;

import java.util.LinkedList;

public class Nivel 
{
	protected Juego juego; 
	protected List<Enemigo>[] oleadas;
	protected List<Enemigo> oleadaActiva;
	protected int descanso;
	protected int piedad;
	
	public Nivel(Juego j, int o)
	{
		oleadas = (List<Enemigo>[])new List[o];
	}
	
	public Nivel(Juego j)
	{
		this(j, 2);
	}
	
	public void accionar()
	{
		
	}
	
	
}
