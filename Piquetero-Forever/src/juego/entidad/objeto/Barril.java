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
		this.vida = 2500;
		this.precio = 0;
	}

	@Override
	public Entidad clonar() {
		return new Barril(this.juego);
	}

	@Override
	public void aceptar(Visitor v) 
	{
		v.visitarBarril(this);		
	}
	
}
