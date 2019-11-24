package juego.entidad.proyectil;

import java.awt.Point;

import grafico.Grafico;
import grafico.proyectil.GraficoBFA;
import juego.Juego;
import juego.accionador.AccionadorMelee;
import juego.entidad.Entidad;

public class BolaDeFuegoA extends ProyectilEnemigo
{

	public BolaDeFuegoA(Juego j) 
	{
		super(j);
		this.grafico = new GraficoBFA(this);
		this.dagno = 100;
		this.velocidad = 15;
	}
}
