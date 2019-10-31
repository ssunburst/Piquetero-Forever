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
		imagenes[0] = new ImageIcon(this.getClass().getResource("/imagenes/KungLao_idle.gif"));
		imagenes[1] = new ImageIcon(this.getClass().getResource("/imagenes/KungLao_atck.gif"));
		imagenes[2] = null;
	}
}
