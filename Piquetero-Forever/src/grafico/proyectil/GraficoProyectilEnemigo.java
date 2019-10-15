package grafico.proyectil;

import grafico.Grafico;
import grafico.detector.DetectorHaciaIzquierda;
import juego.entidad.Entidad;

public class GraficoProyectilEnemigo extends Grafico 
{
	public GraficoProyectilEnemigo(Entidad e, int img) 
	{
		super(e);
		this.direccion = IZQUIERDA;
		this.dc = new DetectorHaciaIzquierda(this.entidad.getJuego(), this);
	}
}
