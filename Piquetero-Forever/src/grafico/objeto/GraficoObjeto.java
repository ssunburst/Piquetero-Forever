package grafico.objeto;

import grafico.GraficoEntidad;
import juego.entidad.Entidad;

import javax.swing.Icon;

public abstract class GraficoObjeto extends GraficoEntidad 
{
	
	protected GraficoObjeto(Entidad e) 
	{
		super(e);
	}
	
	@Override
	public int posAtaque() 
	{
		return 0;
	}
	
	@Override
	public int posIdle() 
	{
		return 0;
	}

	@Override
	protected void setearImagenes() 
	{
		imagenes = new Icon[1];
	}

}
