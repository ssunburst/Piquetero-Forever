package grafico.detector;

import juego.entidad.Entidad;
import juego.Juego;
import java.util.List;

import grafico.Grafico;

public abstract class DetectorColisiones 
{
	protected Juego juego;
	protected Entidad entidad;
	
	public DetectorColisiones(Juego j, Entidad e)
	{
		juego = j;
		entidad = e;		
	}
	
	public abstract Iterable<Entidad> detectarColisiones();
}
