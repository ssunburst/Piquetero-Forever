package grafico.piquetero;

import javax.swing.ImageIcon;

import juego.entidad.Entidad;

public class GraficoAltamira extends GraficoPiquetero 
{

	public GraficoAltamira(Entidad e) 
	{
		super(e);
	}
	
	@Override
	protected void setearImagenes() {
		super.setearImagenes();
		imagenes[0] = new ImageIcon(this.getClass().getResource("/imagenes/altamira_idle.gif"));
		imagenes[1] = new ImageIcon(this.getClass().getResource("/imagenes/altamira_atck.gif"));
		imagenes[2] = null;
	}

}
