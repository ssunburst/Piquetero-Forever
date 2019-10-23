package grafico.detector;

import juego.Juego;
import juego.entidad.Entidad;
import java.util.LinkedList;
import java.util.List;

import grafico.Grafico;
import grafico.mapa.Mapa;

public class DetectorHaciaDerecha extends DetectorColisiones {
	public DetectorHaciaDerecha(Juego j, Entidad e) {
		super(j, e);
	}

	@Override
	public Iterable<Entidad> detectarColisiones() {
		List<Entidad> ret = new LinkedList<Entidad>();
		Mapa m = entidad.getJuego().getMapa();
		Grafico grafico = entidad.getGrafico();
		for (Grafico g : m.graficos()) {
			if (g != entidad.getGrafico()) {
				if (grafico.getY() == g.getY()) 
				{
					int x = grafico.getX();
					if ((x <= g.getX()) && ((x + grafico.getWidth()) >= g.getX()))
						ret.add(g.getEntidad());
				}
			}
		}
		return ret;
	}
}
