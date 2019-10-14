package juego.entidad.proyectil;

import grafico.Grafico;
import visitor.Visitor;
import juego.Juego;
import juego.entidad.Entidad;

public abstract class Proyectil extends Entidad
{
	protected int alcance;
	protected double distanciaRecorrida;
	
	public Proyectil(Juego j)
	{
		super(j);
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
		// Los proyectiles no son visitados.
	}
	
	@Override
	public void atacar(Entidad e) 
	{
		super.atacar(e);
		this.morir();
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
}
