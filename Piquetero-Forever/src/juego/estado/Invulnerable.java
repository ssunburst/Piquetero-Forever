package juego.estado;

import grafico.GraficoPersonaje;
import juego.entidad.personaje.Personaje;

public class Invulnerable extends Normal {
	protected int golpesActuales;
	protected int golpes;

	public Invulnerable(Personaje p, int g) {
		super(p);
		GraficoPersonaje gp = (GraficoPersonaje)personaje.getGrafico();
		gp.setearEscudo(true);
		if (gp.posActual() == 0)
			gp.setearImagen(gp.posIdle());
		else if (gp.posActual() == 1)
			gp.setearImagen(gp.posAtaque());
		golpesActuales = 0;
		golpes = g;
	}

	public Invulnerable(Personaje p) {
		this(p, 7);
	}

	@Override
	public void recibirDagno(int d) {
		golpesActuales++;
		if (golpesActuales == golpes) 
		{
			personaje.setEstado(new Normal(personaje));
			GraficoPersonaje gp = (GraficoPersonaje)personaje.getGrafico();
			gp.setearEscudo(false);
			if (gp.posActual() == 2)
				gp.setearImagen(gp.posIdle());
			else
				gp.setearImagen(gp.posAtaque());
		}
	}

}
