package grafico.enemigo;

import grafico.Grafico;
import grafico.detector.DetectorHaciaIzquierda;
import juego.entidad.Entidad;

public class GraficoEnemigo extends Grafico 
{
	public GraficoEnemigo(Entidad e) 
	{
		super(e);
		this.dc = new DetectorHaciaIzquierda(this.entidad.getJuego(), this);
	}
}
