package grafico.proyectil;

import javax.swing.Icon;
import grafico.GraficoEntidad;
import juego.entidad.Entidad;

public abstract class GraficoProyectil extends GraficoEntidad 
{
	
	protected GraficoProyectil(Entidad e) 
	{
		super(e);
	}

	@Override
	protected void setearImagenes() 
	{
		this.imagenes = new Icon[1];
	}
	
	@Override
	public int posAtaque() 
	{
		return 0;
	}
}
