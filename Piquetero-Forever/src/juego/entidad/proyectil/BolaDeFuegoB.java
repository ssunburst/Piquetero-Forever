package juego.entidad.proyectil;

import java.awt.Point;

import grafico.GraficoEntidad;
import grafico.proyectil.GraficoBFB;
import juego.Juego;
import juego.accionador.AccionadorMelee;
import juego.entidad.Entidad;

public class BolaDeFuegoB extends ProyectilEnemigo
{

	public BolaDeFuegoB(Juego j) 
	{
		super(j);
		this.grafico = new GraficoBFB(this);
		this.dagno = 70;
		this.velocidad = 15;
	}
}
