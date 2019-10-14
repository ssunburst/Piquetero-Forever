package grafico.piquetero;

import java.awt.Point;
import javax.swing.ImageIcon;
import grafico.Grafico;
import juego.entidad.Entidad;
import juego.entidad.personaje.piquetero.Mortero;

import java.awt.*;


public class GraficoMortero extends Grafico
{
	public GraficoMortero(Entidad e)
	{
		super(e);
		this.imagenes[0] = new ImageIcon(this.getClass().getResource("/imagenes/mortero_idle.gif"));
		this.imagenes[1] = null;
		this.imagenes[2] = null;
		this.setSize(new Dimension(120, 100));
		setIcon(imagenes[0]);
	}
}
