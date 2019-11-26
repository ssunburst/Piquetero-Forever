package grafico.powerup;

import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;

import juego.powerup.PowerUp;

public class GraficoChoriAsfalto extends GraficoPowerUp {

	public GraficoChoriAsfalto(PowerUp p) {
		super(p);
	}

	@Override
	protected void setearImagenes() {
		super.setearImagenes();
		this.imagenes[0] = new ImageIcon(this.getClass().getResource("/imagenes/hard_chori.gif"));
	}
}
