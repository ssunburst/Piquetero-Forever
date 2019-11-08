package grafico.proyectil;

import grafico.Grafico;
import grafico.detector.DetectorHaciaIzquierda;
import juego.entidad.Entidad;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class GraficoBFB extends GraficoProyectil 
{
	public GraficoBFB(Entidad e) 
	{
		super(e);
	}

	@Override
	protected void setearImagenes() 
	{
		super.setearImagenes();
		imagenes[0] = new ImageIcon(this.getClass().getResource("/imagenes/fireball_low.png"));
	}
}
