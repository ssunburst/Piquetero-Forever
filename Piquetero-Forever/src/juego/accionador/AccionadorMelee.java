package juego.accionador;

import java.util.Iterator;

import juego.entidad.Entidad;

public class AccionadorMelee extends Accionador
{
	
	protected boolean estadoAtaque;
	
	public AccionadorMelee(Entidad e, int d) 
	{
		super(e, d);
	}
	
	@Override
	public void accionar() 
	{
		Iterable<Entidad> cols = entidad.detectarColisiones();
		Iterator<Entidad> colsIt = cols.iterator();
		if (colsIt.hasNext()) {
			while (colsIt.hasNext())
				colsIt.next().aceptar(entidad.visitor());
		} 
		else
		{
			if(estadoAtaque)
			{
				estadoAtaque = false;
				entidad.getGrafico().setearImagen(entidad.getGrafico().posIdle());
			}
			this.demoraConsumida = 0;
			entidad.mover();
		}
	}

	@Override
	public void atacar(Entidad e) 
	{
		if(!estadoAtaque)
		{
			estadoAtaque = true;
			entidad.getGrafico().setearImagen(entidad.getGrafico().posAtaque());
		}
		if (comprobarDemora())
		{
			e.recibirDagno(entidad.getDagno());
		}
	}
}
