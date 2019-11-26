package grafico.proyectil;

import grafico.GraficoEntidad;
import grafico.detector.DetectorHaciaIzquierda;
import juego.entidad.Entidad;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class GraficoBFA extends GraficoProyectil 
{
	public GraficoBFA(Entidad e) 
	{
		super(e);
	}

	@Override
	protected void setearImagenes() 
	{
		super.setearImagenes();
		imagenes[0] = new ImageIcon(this.getClass().getResource("/imagenes/fireball_high.png"));
	}
}
