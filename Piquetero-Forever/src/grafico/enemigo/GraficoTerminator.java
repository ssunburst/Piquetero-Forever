package grafico.enemigo;

import javax.swing.ImageIcon;

import grafico.GraficoPersonaje;
import juego.entidad.Entidad;

public class GraficoTerminator extends GraficoPersonaje
{

	public GraficoTerminator(Entidad e) 
	{
		super(e);
	}
	
	@Override
	protected void setearImagenes() 
	{
		super.setearImagenes();
		this.imagenes[0] = new ImageIcon(this.getClass().getResource("/imagenes/terminator_walk.gif"));
		this.imagenes[1] = new ImageIcon(this.getClass().getResource("/imagenes/terminator_walk.gif"));
		this.imagenes[2] = null;	
	}

}
