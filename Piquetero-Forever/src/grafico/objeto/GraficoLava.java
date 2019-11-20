package grafico.objeto;

import javax.swing.ImageIcon;

import juego.entidad.Entidad;

public class GraficoLava extends GraficoObjeto 
{
	public GraficoLava(Entidad e) 
	{
		super(e);
	}
	
	@Override
	protected void setearImagenes() 
	{
		super.setearImagenes();
		this.imagenes[0] = new ImageIcon(this.getClass().getResource("/imagenes/lava_puddle.png"));
	}
}
