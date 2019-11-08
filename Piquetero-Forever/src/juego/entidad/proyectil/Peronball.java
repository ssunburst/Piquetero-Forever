package juego.entidad.proyectil;

import java.awt.Point;

import grafico.proyectil.GraficoPeronball;
import juego.Juego;

public class Peronball extends ProyectilAmigo 
{
	public Peronball(Juego j) {
		super(j);
		this.dagno = 200;
		this.velocidad = 11;
		this.grafico = new GraficoPeronball(this);
	}

	@Override
	public Proyectil clonarEn(Point p) 
	{
		Proyectil ret = new Peronball(this.juego);
		ret.getGrafico().setLocation(p);
		return ret;
	}

}
