package juego.accionador;

import java.util.Iterator;

import juego.entidad.Entidad;

public class AccionadorMelee extends Accionador {
	protected boolean estadoAtaque;
	protected boolean flag;

	public AccionadorMelee(Entidad e, int d) {
		super(e, d);
	}

	@Override
	public void accionar() 
	{
		flag = false;
		for (Entidad e : entidad.detectarColisiones())
			e.aceptar(entidad.visitor());
		if (!flag)
		{
			this.demoraConsumida = 0;
			if (estadoAtaque)
			{
				estadoAtaque = false;
				entidad.getGrafico().setearImagen(entidad.getGrafico().posIdle());
			}
			entidad.mover();
		}
	}

	@Override
	public void atacar(Entidad e) {
		flag = true;
		if (!estadoAtaque) {
			estadoAtaque = true;
			entidad.getGrafico().setearImagen(entidad.getGrafico().posAtaque());
		}
		if (comprobarDemora()) {
			e.recibirDagno(entidad.getDagno());
		}
	}
}
