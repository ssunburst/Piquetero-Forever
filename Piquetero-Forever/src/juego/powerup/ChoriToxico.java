package juego.powerup;

import grafico.powerup.GraficoChoriToxico;
import juego.Juego;
import visitor.VisitorChoriToxico;

public class ChoriToxico extends PowerUp 
{
	public ChoriToxico(Juego j) 
	{
		super(j);
		this.grafico = new GraficoChoriToxico(this);
		this.visitor = new VisitorChoriToxico(this);
	}
	
		
}
