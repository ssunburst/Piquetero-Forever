package juego.accionador;

import java.awt.Point;
import java.util.Iterator;
import juego.entidad.Entidad;
import juego.entidad.proyectil.Proyectil;
import juego.entidad.personaje.Personaje;

public class AccionadorRango extends AccionadorPersonaje 
{
	protected boolean mover;
	protected Arma arma;

	public AccionadorRango(Personaje p, int d, Arma a) {
		super(p, d);
		arma = a;
		mover = true;
	}

	@Override
	public void accionar() {
		Iterable<Entidad> cols = personaje.detectarColisiones();
		for (Entidad e : cols)
			e.aceptar(personaje.visitor());
		if (comprobarDemora())
		{
			Proyectil p = arma.disparar();
			p.getGrafico().setLocation(personaje.getGrafico().getLocation());
			personaje.getJuego().agregarLuego(p);
		}
		if (mover)
			personaje.mover();
		mover = true;

	}

	@Override
	public void atacar(Entidad e) 
	{
		mover = false;
	}
}
