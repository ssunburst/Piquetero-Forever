package grafico.enemigo;

import javax.swing.ImageIcon;

import juego.entidad.Entidad;

public class GraficoMotaro extends GraficoEnemigo 
{

	public GraficoMotaro(Entidad e) {
		super(e);

	}
	
	@Override
	protected void setearImagenes() 
	{
		super.setearImagenes();
		this.imagenes[0] = new ImageIcon(this.getClass().getResource("/imagenes/motaro_walk.gif"));
		this.imagenes[1] = new ImageIcon(this.getClass().getResource("/imagenes/motaro_atck.gif"));
		this.imagenes[2] = null;	
	}

}
