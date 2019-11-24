package juego.accionador;

import java.util.Iterator;

import juego.entidad.Entidad;
import juego.entidad.personaje.Personaje;

public class AccionadorMelee extends AccionadorPersonaje {
	protected boolean estadoAtaque;
	protected boolean flag;

	public AccionadorMelee(Personaje p, int d) {
		super(p, d);
	}

	@Override
	public void accionar() 
	{
		flag = false;
		for (Entidad e : personaje.detectarColisiones())
			e.aceptar(personaje.visitor());
		if (!flag)
		{
			this.demoraConsumida = 0;
			if (estadoAtaque)
			{
				estadoAtaque = false;
				personaje.getGrafico().setearImagen(personaje.getGrafico().posIdle());
			}
			personaje.mover();
		}
	}

	@Override
	public void atacar(Entidad e) {
		flag = true;
		if (!estadoAtaque) {
			estadoAtaque = true;
			personaje.getGrafico().setearImagen(personaje.getGrafico().posAtaque());
		}
		if (comprobarDemora()) {
			e.recibirDagno(personaje.getDagno());
		}
	}
}
