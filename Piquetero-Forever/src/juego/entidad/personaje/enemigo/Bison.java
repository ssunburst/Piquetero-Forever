package juego.entidad.personaje.enemigo;

import grafico.enemigo.GraficoBison;
import juego.Juego;
import juego.accionador.AccionadorMelee;

public class Bison extends Enemigo
{

	public Bison(Juego j) 
	{
		super(j);
		this.accionador = new AccionadorMelee(this, 30);
		this.dagno = 150;
		this.puntaje = 400;
		this.recompensa = 200;
		this.vida = 300;
		this.velocidad = 9;
		this.grafico = new GraficoBison(this);
	}

	@Override
	public Enemigo clonar() 
	{
		return new Bison(this.juego);
	}
	

}
