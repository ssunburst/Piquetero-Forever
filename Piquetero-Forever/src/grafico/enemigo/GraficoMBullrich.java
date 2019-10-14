package grafico.enemigo;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import grafico.Grafico;
import juego.entidad.Entidad;

public class GraficoMBullrich extends Grafico
{
	public GraficoMBullrich(Entidad e)
	{
		super(e);
		this.imagenes[1] = new ImageIcon(this.getClass().getResource("/imagenes/bul_atck.gif"));
		this.imagenes[2] = null;
		this.imagenes[3] = null;
		this.setSize(new Dimension(imagenes[1].getIconWidth(), imagenes[1].getIconWidth()));
		this.setMinimumSize(new Dimension(imagenes[1].getIconWidth(), imagenes[1].getIconWidth()));
		this.setMaximumSize(new Dimension(imagenes[1].getIconWidth(), imagenes[1].getIconWidth()));
		this.setPreferredSize(new Dimension(imagenes[1].getIconWidth(), imagenes[1].getIconWidth()));
		setIcon(imagenes[1]);
	}
}
