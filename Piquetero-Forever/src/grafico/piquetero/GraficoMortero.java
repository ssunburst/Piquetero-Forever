package grafico.piquetero;

import java.awt.Point;
import javax.swing.ImageIcon;
import grafico.Grafico;
import juego.Entidad;
import juego.personaje.piquetero.Mortero;
import java.awt.*;


public class GraficoMortero extends Grafico
{
	public GraficoMortero(Entidad e)
	{
		super(e, 2);
		this.imagenes[0] = new ImageIcon(this.getClass().getResource("/imagenes/mortero_idle.gif"));
		this.setSize(new Dimension(120, 100));
		setIcon(imagenes[0]);
	}
}
