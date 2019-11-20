package grafico.objeto;

import juego.entidad.Entidad;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class GraficoBarril extends GraficoObjeto
{
	public GraficoBarril(Entidad e)
	{
		super(e);
	}
	
	@Override
	protected void setearImagenes() 
	{
		super.setearImagenes();
		this.imagenes[0] = new ImageIcon(this.getClass().getResource("/imagenes/barril.gif"));
	}
}
