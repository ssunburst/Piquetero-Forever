package juego.personaje.proyectil;

import grafico.Grafico;
import juego.Entidad;
import visitor.Visitor;
import juego.Juego;

public abstract class Proyectil extends Entidad
{
	protected int alcance;
	
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
}
