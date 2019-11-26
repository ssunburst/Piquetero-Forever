package juego.entidad.objeto;

import grafico.GraficoEntidad;
import juego.Juego;

public abstract class ObjetoDurable extends Objeto 
{

	protected ObjetoDurable(Juego j) {
		super(j);
	}
	
	@Override
	public void accionar() {}
	
}