package grafico.detector;

import juego.Juego;
import juego.entidad.Entidad;
import java.util.LinkedList;
import java.util.List;

import grafico.GraficoEntidad;
import grafico.mapa.Mapa;

public class DetectorHaciaIzquierda extends DetectorColisiones {
	public DetectorHaciaIzquierda(Juego j, Entidad e) {
		super(j, e);
	}

	@Override
	public Iterable<Entidad> detectarColisiones() {
		List<Entidad> ret = new LinkedList<Entidad>();
		Mapa m = entidad.getJuego().getMapa();
		GraficoEntidad grafico = entidad.getGrafico();
		for (GraficoEntidad g : m.graficos()) {
			if (grafico.getY() == g.getY()) {
				if (g != grafico) {
					int x = grafico.getX();
					if ((x <= (g.getX() + g.getWidth()) && (x >= g.getX())))
						ret.add(g.getEntidad());
				}
			}
		}
		return ret;
	}
}
