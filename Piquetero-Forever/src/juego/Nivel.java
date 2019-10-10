package juego;
import java.util.List;
import java.util.LinkedList;
import juego.personaje.ffaa.Enemigo;

public class Nivel 
{
	protected List<Enemigo>[] oleadas;
	protected List<Enemigo> oleadaActiva;
	
	public Nivel(int o)
	{
		oleadas = (List<Enemigo>[])new List[o];
	}
}
