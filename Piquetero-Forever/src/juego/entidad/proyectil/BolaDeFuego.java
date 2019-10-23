package juego.entidad.proyectil;

import java.awt.Point;

import grafico.Grafico;
import grafico.proyectil.GraficoProyectilEnemigo;
import juego.Juego;
import juego.accionador.AccionadorMelee;
import juego.entidad.Entidad;

public class BolaDeFuego extends ProyectilEnemigo
{

	public BolaDeFuego(Juego j) 
	{
		super(j);
		this.grafico = new GraficoProyectilEnemigo(this, 1);
		this.dagno = 100;
		this.velocidad = 15;
	}

	@Override
	public Proyectil clonar(Point p) 
	{
		Proyectil ret = new BolaDeFuego(this.juego);
		ret.getGrafico().setLocation(p);
		return ret;
	}
}
