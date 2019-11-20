package grafico.enemigo;

import grafico.Grafico;
import grafico.detector.DetectorHaciaIzquierda;
import juego.entidad.Entidad;
import javax.swing.Icon;

public abstract class GraficoEnemigo extends Grafico 
{
	protected GraficoEnemigo(Entidad e) 
	{
		super(e);
	}

	@Override
	protected void setearImagenes() 
	{
		imagenes = new Icon[3];
	}
	
	@Override
	public int posAtaque() 
	{
		return 1;
	}
	
	@Override
	public int posMuerte() 
	{
		return 2;
	}
}
