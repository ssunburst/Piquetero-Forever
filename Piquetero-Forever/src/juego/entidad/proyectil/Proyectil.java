package juego.entidad.proyectil;

import grafico.GraficoEntidad;
import juego.Juego;
import juego.entidad.Entidad;
import visitor.Visitor;
import java.awt.Point;
import java.util.Iterator;

public abstract class Proyectil extends Entidad
{	
	boolean ataque;
	
	protected Proyectil(Juego j)
	{
		super(j);
		ataque = false;
	}
	
	@Override
	public void recibirDagno(int d) 
	{
		// Los proyectiles no reciben daño.
	}
	
	@Override
	public void aceptar(Visitor v) 
	{
		v.visitar(this);
	}
	
	@Override
	public void accionar() 
	{
		Iterable<Entidad> cols = detectarColisiones();
		Iterator<Entidad> colsIt = cols.iterator();
		while (colsIt.hasNext() && !ataque)
			colsIt.next().aceptar(visitor);
		if (!ataque)
			mover();
	}
	
	@Override
	public void atacar(Entidad e) 
	{
		e.recibirDagno(this.dagno);
		morir();
		ataque = true;
	}
}
