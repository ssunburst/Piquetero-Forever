package grafico.detector;

import juego.entidad.Entidad;
import juego.Juego;
import java.util.List;

import grafico.GraficoEntidad;

public abstract class DetectorColisiones 
{
	protected Juego juego;
	protected Entidad entidad;
	
	protected DetectorColisiones(Juego j, Entidad e)
	{
		juego = j;
		entidad = e;		
	}
	
	public abstract Iterable<Entidad> detectarColisiones();
}
