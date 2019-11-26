package grafico.piquetero;

import javax.swing.ImageIcon;

import grafico.GraficoPersonaje;
import juego.entidad.Entidad;

public class GraficoAltamira extends GraficoPersonaje 
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
		imagenes[2] = new ImageIcon(this.getClass().getResource("/imagenes/altamira_idle_shield.gif"));
		imagenes[3] = new ImageIcon(this.getClass().getResource("/imagenes/altamira_atck_shield.gif"));
	}

}
