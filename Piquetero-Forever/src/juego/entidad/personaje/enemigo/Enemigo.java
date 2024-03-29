package juego.entidad.personaje.enemigo;

import java.awt.Point;
import java.util.Random;

import grafico.GraficoEntidad;
import grafico.detector.DetectorHaciaIzquierda;
import juego.Juego;
import juego.entidad.Entidad;
import juego.entidad.objeto.Objeto;
import juego.entidad.personaje.Personaje;
import juego.powerup.ChoriAsfalto;
import juego.powerup.ChoriClasico;
import juego.powerup.ChoriCongelado;
import juego.powerup.ChoriToxico;
import juego.powerup.PowerUp;
import juego.powerup.PowerUps;
import visitor.Visitor;
import visitor.VisitorEnemigo;

public abstract class Enemigo extends Personaje
{
	protected PowerUp premio;
	protected int recompensa;	// Cantidad de monedas otorgadas
	protected int puntaje;		// Puntos otorgados al jugador
	
	protected Enemigo(Juego j) 
	{
		super(j);
		this.direccion = IZQUIERDA;
		this.detector = new DetectorHaciaIzquierda(j, this);
		this.visitor = new VisitorEnemigo(this);
		Random ran = new Random();
		int p = ran.nextInt(5);
		if (p == 4)
		{
			PowerUps pups = new PowerUps(juego);
			p = ran.nextInt(pups.totalPowerUps());
			premio = pups.getPowerUp(p);
		}
	}
	
	@Override
	public void aceptar(Visitor v)
	{
		v.visitar(this);
	}
	
	@Override
	public void morir() {
		super.morir();
		this.juego.ganarPuntos(this.puntaje);
		this.juego.ganarMonedas(this.recompensa);
		if (premio != null)
		{
			premio.getGrafico().setLocation(grafico.getLocation());
			juego.getMapa().add(premio.getGrafico());
			juego.getMapa().setComponentZOrder(premio.getGrafico(), 0);
		}
	}
	
	@Override
	public void mover() {
		super.mover();
		comprobarFinalizacion();
	}
	
	public void comprobarFinalizacion()
	{
		Point p = this.grafico.getLocation();
		if (p.getX() + this.grafico.getWidth() <= 0)
			this.juego.terminarJuego(false);
	}
}
