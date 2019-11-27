package juego.entidad.personaje;

import grafico.GraficoEntidad;
import juego.Juego;
import juego.accionador.AccionadorPersonaje;
import juego.entidad.Entidad;
import juego.entidad.proyectil.Proyectil;
import juego.estado.Estado;
import juego.estado.Normal;
import juego.accionador.Accionador;

public abstract class Personaje extends Entidad
{
	protected Estado estado;
	protected Accionador accionador;
	
	protected Personaje(Juego j) 
	{
		super(j);
		estado = new Normal(this);
	}
	
	public void setVida(int v)
	{
		this.vida = v;
	}
	
	@Override
	public void accionar() 
	{
		accionador.accionar();
	}
	
	@Override
	public void atacar(Entidad e) 
	{
		accionador.atacar(e);
	}
	
	@Override
	public void mover() 
	{
		estado.mover();
	}
	
	@Override
	public void recibirDagno(int d) 
	{
		estado.recibirDagno(d);
	}
	
	public void setEstado(Estado e)
	{
		this.estado = e;
	}
}
