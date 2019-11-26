package grafico.enemigo;

import juego.entidad.Entidad;
import javax.swing.Icon;
import javax.swing.ImageIcon;

import grafico.GraficoPersonaje;

import java.util.Random;

public class GraficoBison extends GraficoPersonaje 
{

	public GraficoBison(Entidad e) 
	{
		super(e);
	}
	
	@Override
	protected void setearImagenes() 
	{
		this.imagenes = new Icon[5];
		this.imagenes[0] = new ImageIcon(this.getClass().getResource("/imagenes/bison_mov1.gif"));
		this.imagenes[1] = new ImageIcon(this.getClass().getResource("/imagenes/bison_mov2.gif"));
		this.imagenes[2] = new ImageIcon(this.getClass().getResource("/imagenes/bison_mov3.gif"));
		this.imagenes[3] = new ImageIcon(this.getClass().getResource("/imagenes/bison_atck1.gif"));
		this.imagenes[4] = new ImageIcon(this.getClass().getResource("/imagenes/bison_atck2.gif"));
	}
	
	@Override
	public int posAtaque() {
		Random ran = new Random();
		return ran.nextInt(2) + 3;
	}
	
	@Override
	public int posIdle() {
		Random ran = new Random();
		return ran.nextInt(3);
	}
	
}
