package grafico.powerup;

import javax.swing.ImageIcon;

import juego.powerup.PowerUp;

public class GraficoChoriToxico extends GraficoPowerUp {

	public GraficoChoriToxico(PowerUp p) {
		super(p);
	}
	
	@Override
	protected void setearImagenes() {
		super.setearImagenes();
		this.imagenes[0] = new ImageIcon(this.getClass().getResource("/imagenes/toxic_chori.gif"));
	}

}
