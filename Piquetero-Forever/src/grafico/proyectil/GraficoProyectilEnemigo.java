package grafico.proyectil;

import grafico.Grafico;
import grafico.detector.DetectorHaciaIzquierda;
import juego.entidad.Entidad;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class GraficoProyectilEnemigo extends GraficoProyectil 
{
	public GraficoProyectilEnemigo(Entidad e, int img) 
	{
		super(e);
	}

	@Override
	protected void setearImagenes() 
	{
		super.setearImagenes();
		imagenes[0] = new ImageIcon(this.getClass().getResource("/imagenes/fireball.jpeg"));
	}
}
