package juego.entidad.objeto;

import grafico.objeto.GraficoBarril;
import juego.Juego;
import juego.entidad.Entidad;
import visitor.Visitor;

public class Barril extends ObjetoDurable 
{

	public Barril(Juego j) {
		super(j);
		this.grafico = new GraficoBarril(this);
		this.vida = 3000;
		this.precio = 75;
	}

	@Override
	public void aceptar(Visitor v) 
	{
		v.visitar(this);		
	}
	
}
