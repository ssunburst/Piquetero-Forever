package grafico.enemigo;

import grafico.Grafico;
import grafico.detector.DetectorHaciaIzquierda;
import juego.entidad.Entidad;
import javax.swing.Icon;

public class GraficoEnemigo extends Grafico 
{
	public GraficoEnemigo(Entidad e) 
	{
		super(e);
	}

	@Override
	protected void setearImagenes() 
	{
		imagenes = new Icon[3];
	}	
}
