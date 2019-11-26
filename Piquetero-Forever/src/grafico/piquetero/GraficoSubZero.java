package grafico.piquetero;

import javax.swing.ImageIcon;

import grafico.GraficoPersonaje;
import juego.entidad.personaje.piquetero.Piquetero;

public class GraficoSubZero extends GraficoPersonaje 
{
	public GraficoSubZero(Piquetero e) 
	{
		super(e);
	}

	@Override
	protected void setearImagenes() 
	{
		super.setearImagenes();
		imagenes[0] = new ImageIcon(this.getClass().getResource("/imagenes/subzero_idle.gif"));
		imagenes[1] = new ImageIcon(this.getClass().getResource("/imagenes/subzero_atck.gif"));
		imagenes[2] = new ImageIcon(this.getClass().getResource("/imagenes/subzero_idle_shield.gif"));
		imagenes[3] = new ImageIcon(this.getClass().getResource("/imagenes/subzero_atck_shield.gif"));
	}

}
