package grafico.proyectil;

import grafico.Grafico;
import grafico.detector.DetectorHaciaIzquierda;
import juego.entidad.Entidad;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class GraficoProyectilEnemigo extends Grafico 
{
	public GraficoProyectilEnemigo(Entidad e, int img) 
	{
		super(e);
		this.direccion = IZQUIERDA;
		this.dc = new DetectorHaciaIzquierda(this.entidad.getJuego(), this);
	}

	@Override
	protected void setearImagenes() 
	{
		imagenes = new Icon[1];
		imagenes[0] = new ImageIcon(this.getClass().getResource("/imagenes/fireball.jpeg"));
	}
}
