package juego.powerup;

import grafico.powerup.GraficoChoriCongelado;
import juego.Juego;
import visitor.VisitorChoriCongelado;

public class ChoriCongelado extends PowerUp 
{
	public ChoriCongelado(Juego j) 
	{
		super(j);
		this.grafico = new GraficoChoriCongelado(this);
		this.visitor = new VisitorChoriCongelado(this);
	}	
}
