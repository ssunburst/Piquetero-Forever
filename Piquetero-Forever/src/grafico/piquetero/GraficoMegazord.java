package grafico.piquetero;

import javax.swing.ImageIcon;

import grafico.GraficoPersonaje;
import juego.entidad.Entidad;

public class GraficoMegazord extends GraficoPersonaje 
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
		this.imagenes[2] = new ImageIcon(this.getClass().getResource("/imagenes/megazord_idle_shield.gif"));
		this.imagenes[3] = new ImageIcon(this.getClass().getResource("/imagenes/megazord_atck_shield.gif"));
	}
	
}
