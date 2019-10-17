package grafico.piquetero;

import javax.swing.ImageIcon;

import juego.entidad.personaje.piquetero.Piquetero;

public class GraficoSubZero extends GraficoPiquetero 
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
//		imagenes[0] = new ImageIcon(this.getClass().getResource("/imagenes/subzero_atck.gif"));
		imagenes[1] = new ImageIcon(this.getClass().getResource("/imagenes/subzero_atck.gif"));
		imagenes[2] = null;
	}

}
