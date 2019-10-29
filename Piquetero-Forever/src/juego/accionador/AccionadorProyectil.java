package juego.accionador;

import juego.entidad.Entidad;
import java.util.Iterator;

public class AccionadorProyectil extends Accionador 
{
	protected boolean ataque;
	
	public AccionadorProyectil(Entidad e) {
		super(e);
		ataque = false;
	}
	
	@Override
	public void accionar() 
	{
		Iterable<Entidad> cols = entidad.detectarColisiones();
		Iterator<Entidad> colsIt = cols.iterator();
		while (colsIt.hasNext() && !ataque)
			colsIt.next().aceptar(entidad.visitor());
		if (!ataque)
			entidad.mover();
	}

	@Override
	public void atacar(Entidad e) 
	{
		e.recibirDagno(entidad.getDagno());
		entidad.morir();
		ataque = true;
	}

}
