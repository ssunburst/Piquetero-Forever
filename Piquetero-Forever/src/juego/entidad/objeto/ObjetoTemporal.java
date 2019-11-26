package juego.entidad.objeto;

import grafico.GraficoEntidad;
import juego.Juego;

public abstract class ObjetoTemporal extends Objeto
{
	protected int durConsumida;
	protected int duracion;
	
	protected ObjetoTemporal(Juego j) {
		super(j);
		durConsumida = 0;
	}
	
	@Override
	public void accionar() 
	{
		durConsumida++;
		if (durConsumida == duracion)
			morir();
	}
	
}
