package grafico.piquetero;

import java.awt.Point;
import javax.swing.ImageIcon;
import grafico.GraficoEntidad;
import grafico.GraficoPersonaje;
import grafico.GraficoPersonajeRango;
import juego.entidad.Entidad;
import juego.entidad.personaje.piquetero.TurroMortero;

import java.awt.*;


public class GraficoMortero extends GraficoPersonajeRango
{
	public GraficoMortero(Entidad e)
	{
		super(e);
	}

	@Override
	protected void setearImagenes() 
	{
		super.setearImagenes();
		this.imagenes[0] = new ImageIcon(this.getClass().getResource("/imagenes/mortero_idle.gif"));
		this.imagenes[2] = new ImageIcon(this.getClass().getResource("/imagenes/mortero_idle_shield.gif"));
	}
}
