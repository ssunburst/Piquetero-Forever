package juego.powerup;

import grafico.powerup.GraficoChoriClasico;
import juego.Juego;
import visitor.VisitorChoriClasico;

public class ChoriClasico extends PowerUp 
{
	public ChoriClasico(Juego j) {
		super(j);
		this.grafico = new GraficoChoriClasico(this);
		this.visitor = new VisitorChoriClasico(this);
	}	
}
