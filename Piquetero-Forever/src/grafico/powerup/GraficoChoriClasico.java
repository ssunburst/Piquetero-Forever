package grafico.powerup;

import javax.swing.ImageIcon;

import juego.powerup.PowerUp;

public class GraficoChoriClasico extends GraficoPowerUp 
{

	public GraficoChoriClasico(PowerUp p) {
		super(p);
	}

	@Override
	protected void setearImagenes() {
		super.setearImagenes();
		this.imagenes[0] = new ImageIcon(this.getClass().getResource("/imagenes/health_chori.gif"));
	}
}
