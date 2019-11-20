package grafico.piquetero;

import javax.swing.ImageIcon;

import juego.entidad.Entidad;

public class GraficoCapAmerica extends GraficoPiquetero
{

	public GraficoCapAmerica(Entidad e) 
	{
		super(e);
	}
	
	@Override
	protected void setearImagenes() 
	{
		super.setearImagenes();
		this.imagenes[0] = new ImageIcon(this.getClass().getResource("/imagenes/cap_idle.gif"));
		this.imagenes[1] = new ImageIcon(this.getClass().getResource("/imagenes/cap_atck.gif"));
	}
	
}
