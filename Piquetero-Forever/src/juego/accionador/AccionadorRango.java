package juego.accionador;

import java.awt.Point;
import java.util.Iterator;
import juego.entidad.Entidad;
import juego.entidad.proyectil.Proyectil;

public class AccionadorRango extends Accionador {
	protected boolean mover;

	public AccionadorRango(Entidad e, int d) {
		super(e, d);
		mover = true;
	}

	@Override
	public void accionar() {
		Iterable<Entidad> cols = entidad.detectarColisiones();
		Iterator<Entidad> colsIt = cols.iterator();
		for (Entidad e : cols)
			e.aceptar(entidad.visitor());
		if (comprobarDemora())
		{
			Proyectil p = entidad.getProyectil().clonar(entidad.getGrafico().getLocation());
			entidad.getJuego().agregarLuego(p);
		}
		if (mover)
			entidad.mover();
		mover = true;

	}

	@Override
	public void atacar(Entidad e) 
	{
		mover = false;
	}
}
