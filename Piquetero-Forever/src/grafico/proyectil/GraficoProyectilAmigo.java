package grafico.proyectil;

import grafico.Grafico;
import grafico.detector.DetectorHaciaDerecha;

import java.awt.Point;
import juego.entidad.Entidad;
import juego.entidad.proyectil.Proyectil;
import javax.swing.Icon;

public class GraficoProyectilAmigo extends Grafico 
{
	public GraficoProyectilAmigo(Entidad e, int img) 
	{
		super(e);
		this.direccion = DERECHA;
		this.dc = new DetectorHaciaDerecha(this.entidad.getJuego(), this);
	}

	@Override
	protected void setearImagenes() 
	{
		imagenes = new Icon[1];
	}
	
	
}
