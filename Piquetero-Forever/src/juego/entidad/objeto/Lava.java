package juego.entidad.objeto;

import grafico.objeto.GraficoLava;
import juego.Juego;
import juego.entidad.Entidad;
import visitor.Visitor;

public class Lava extends ObjetoTemporal 
{
	public Lava(Juego j) 
	{
		super(j);
		this.grafico = new GraficoLava(this);
		this.duracion = 500;
		this.precio = 150;
		this.vida = Integer.MAX_VALUE;
		this.dagno = 15;
	}

	@Override
	public void aceptar(Visitor v) 
	{
		v.visitar(this);
	}
}
