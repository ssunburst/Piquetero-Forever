package grafico.powerup;

import javax.swing.ImageIcon;

import juego.powerup.PowerUp;

public class GraficoChoriCongelado extends GraficoPowerUp {

	public GraficoChoriCongelado(PowerUp p) {
		super(p);
	}
	
	@Override
	protected void setearImagenes() 
	{
		super.setearImagenes();
		this.imagenes[0] = new ImageIcon(this.getClass().getResource("/imagenes/frozen_chori.gif"));
	}

}
