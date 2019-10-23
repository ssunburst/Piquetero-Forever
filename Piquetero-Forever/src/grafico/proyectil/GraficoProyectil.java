package grafico.proyectil;

import javax.swing.Icon;
import grafico.Grafico;
import juego.entidad.Entidad;

public abstract class GraficoProyectil extends Grafico 
{
	
	public GraficoProyectil(Entidad e) 
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
	
	@Override
	public int posMuerte() {
		return 0;
	}

}
