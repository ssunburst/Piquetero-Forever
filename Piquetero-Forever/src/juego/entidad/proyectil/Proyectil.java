package juego.entidad.proyectil;

import grafico.Grafico;
import juego.Juego;
import juego.accionador.AccionadorProyectil;
import juego.entidad.Entidad;
import visitor.Visitor;
import java.awt.Point;

public abstract class Proyectil extends Entidad
{
	protected int alcance;
	protected double distanciaRecorrida;
	
	public Proyectil(Juego j)
	{
		super(j);
		this.accionador = new AccionadorProyectil(this);
	}
	
	public int getAlcance() {
		return alcance;
	}
	
	@Override
	public void recibirDagno(int d) 
	{
		// Los proyectiles no reciben daño.
	}
	
	@Override
	public void aceptar(Visitor v) 
	{
		v.visitarDisparo(this);
	}
	
	public boolean alcanzoDestino()
	{
		return distanciaRecorrida >= alcance;
	}
	
	public double distanciaRecorrida()
	{
		return distanciaRecorrida;
	}
	
	public void recorrerDistancia(double d)
	{
		distanciaRecorrida =+ d;
	}
	
	public abstract Proyectil clonar(Point p);
}
