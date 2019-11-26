package juego.powerup;

import grafico.powerup.GraficoChoriAsfalto;
import juego.Juego;
import visitor.VisitorChoriAsfalto;

public class ChoriAsfalto extends PowerUp
{

	public ChoriAsfalto(Juego j) {
		super(j);
		visitor = new VisitorChoriAsfalto(this);
		grafico = new GraficoChoriAsfalto(this);
	}

}
