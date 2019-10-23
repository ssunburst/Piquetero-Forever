package juego.accionador;

import juego.entidad.Entidad;
import java.util.Iterator;

public class AccionadorProyectil extends Accionador 
{
	public AccionadorProyectil(Entidad e) {
		super(e, 0);
		ataque = false;
	}

	protected boolean ataque;
	
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
		entidad.getJuego().quitarLuego(entidad);
		ataque = true;
	}

}
