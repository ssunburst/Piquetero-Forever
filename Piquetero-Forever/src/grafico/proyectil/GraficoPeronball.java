package grafico.proyectil;

import javax.swing.ImageIcon;

import juego.entidad.Entidad;

public class GraficoPeronball extends GraficoProyectil
{
	public GraficoPeronball(Entidad e) 
	{
		super(e);
	}

	@Override
	protected void setearImagenes() 
	{
		super.setearImagenes();
		imagenes[0] = new ImageIcon(this.getClass().getResource("/imagenes/peronball.gif"));
	}
}
