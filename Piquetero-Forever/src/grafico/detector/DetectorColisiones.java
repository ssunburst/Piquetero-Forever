package grafico.detector;

import juego.entidad.Entidad;
import juego.Juego;
import java.util.List;

import grafico.Grafico;

public abstract class DetectorColisiones 
{
	protected Juego juego;
	protected Grafico grafico;
	
	public DetectorColisiones(Juego j, Grafico g)
	{
		juego = j;
		grafico = g;		
	}
	
	public abstract Iterable<Entidad> detectarColisiones();
}
