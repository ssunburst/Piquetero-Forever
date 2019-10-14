package grafico.detector;

import juego.Juego;
import juego.entidad.Entidad;
import java.util.LinkedList;
import java.util.List;

import grafico.Grafico;
import grafico.mapa.Mapa;

public class DetectorHaciaIzquierda extends DetectorColisiones 
{
	public DetectorHaciaIzquierda(Juego j, Grafico g) 
	{
		super(j,g);
	}
	
	@Override
	public Iterable<Entidad> detectarColisiones() 
	{
		List<Entidad> ret = new LinkedList<Entidad>();
		Mapa m = grafico.getEntidad().getJuego().getMapa();
		for (Grafico g: m.graficos())
		{
			if (this.grafico.getY() == g.getY())
			{
				int x = this.grafico.getX();
				if ((x <= (g.getX() + g.getWidth()) && (x >= g.getX())))
					ret.add(g.getEntidad());
			}
		}
		return ret;
	}
}
