package grafico.ffaa;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import grafico.Grafico;
import juego.Entidad;

public class GraficoMBullrich extends Grafico
{
	public GraficoMBullrich(Entidad e)
	{
		super(e, 2);
		this.imagenes[1] = new ImageIcon(this.getClass().getResource("/imagenes/bul_atck.gif"));
		this.setSize(new Dimension(imagenes[1].getIconWidth(), imagenes[1].getIconWidth()));
		this.setMinimumSize(new Dimension(imagenes[1].getIconWidth(), imagenes[1].getIconWidth()));
		this.setMaximumSize(new Dimension(imagenes[1].getIconWidth(), imagenes[1].getIconWidth()));
		this.setPreferredSize(new Dimension(imagenes[1].getIconWidth(), imagenes[1].getIconWidth()));
		setIcon(imagenes[1]);
	}
}
