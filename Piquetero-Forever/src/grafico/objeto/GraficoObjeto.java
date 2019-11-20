package grafico.objeto;

import grafico.Grafico;
import juego.entidad.Entidad;

import javax.swing.Icon;

public abstract class GraficoObjeto extends Grafico 
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
	public int posMuerte() 
	{
		return 0;
	}

	@Override
	protected void setearImagenes() 
	{
		imagenes = new Icon[1];
	}

}
