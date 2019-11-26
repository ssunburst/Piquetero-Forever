package juego.powerup;

import grafico.powerup.GraficoPowerUp;
import juego.Juego;
import visitor.Visitor;
import juego.entidad.Entidad;

public abstract class PowerUp 
{
	protected Juego juego;
	protected Visitor visitor;
	protected GraficoPowerUp grafico;
	
	public PowerUp(Juego j)
	{
		juego = j;
	}
	
	public void activar()
	{
		for (Entidad e : juego.entidades())
			e.aceptar(visitor);
	}
	
	public GraficoPowerUp getGrafico()
	{
		return grafico;
	}
}
