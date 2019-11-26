package juego.entidad.personaje.piquetero;

import juego.Juego;
import juego.accionador.AccionadorMelee;
import juego.entidad.Entidad;
import grafico.piquetero.GraficoAltamira;

public class Altamira extends Piquetero 
{

	public Altamira(Juego j) 
	{
		super(j);
		this.accionador = new AccionadorMelee(this, 30);
		this.grafico = new GraficoAltamira(this);
		this.dagno = 350;
		this.precio = 200;
		this.vida = 300;
	}
}
