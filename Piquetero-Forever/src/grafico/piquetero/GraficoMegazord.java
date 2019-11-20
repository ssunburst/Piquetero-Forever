package grafico.piquetero;

import javax.swing.ImageIcon;

import juego.entidad.Entidad;

public class GraficoMegazord extends GraficoPiquetero 
{

	public GraficoMegazord(Entidad e) 
	{
		super(e);
	}
	
	@Override
	protected void setearImagenes() {
		super.setearImagenes();
		this.imagenes[0] = new ImageIcon(this.getClass().getResource("/imagenes/megazord_idle.gif"));
		this.imagenes[1] = new ImageIcon(this.getClass().getResource("/imagenes/megazord_atck.gif"));
	}
	
}
