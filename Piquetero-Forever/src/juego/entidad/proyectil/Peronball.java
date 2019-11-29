package juego.entidad.proyectil;

import java.awt.Point;

import grafico.proyectil.GraficoPeronball;
import juego.Juego;

public class Peronball extends ProyectilAmigo 
{
	public Peronball(Juego j) {
		super(j);
		this.dagno = 400;
		this.velocidad = 13;
		this.grafico = new GraficoPeronball(this);
	}
}
