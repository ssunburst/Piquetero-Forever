package grafico.piquetero;

import javax.swing.ImageIcon;

import juego.entidad.Entidad;

public class GraficoKungLao extends GraficoPiquetero {

	public GraficoKungLao(Entidad e) 
	{
		super(e);
	}
	
	protected void setearImagenes() 
	{
		super.setearImagenes();
		imagenes[0] = new ImageIcon(this.getClass().getResource("/imagenes/kunglao_idle.gif"));
		imagenes[1] = new ImageIcon(this.getClass().getResource("/imagenes/kunglao_atck.gif"));
		imagenes[2] = null;
	}
}
