package grafico.enemigo;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import grafico.Grafico;
import juego.entidad.Entidad;

public class GraficoMBullrich extends GraficoEnemigo
{
	public GraficoMBullrich(Entidad e)
	{
		super(e);
	}

	@Override
	protected void setearImagenes() 
	{
		super.setearImagenes();
		this.imagenes[0] = new ImageIcon(this.getClass().getResource("/imagenes/bul_walk.gif"));
		this.imagenes[1] = new ImageIcon(this.getClass().getResource("/imagenes/bul_walk.gif"));
		this.imagenes[2] = null;	
	}
}
