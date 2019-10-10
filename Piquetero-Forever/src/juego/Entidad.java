package juego;

import javax.swing.JComponent;
import javax.swing.Icon;
import java.awt.Point;
import grafico.Grafico;
import visitor.Visitor;

public abstract class Entidad
{
	protected Grafico grafico;
	protected Visitor v;
	protected int dagno;
	protected int velocidad;
	
	public Grafico getGrafico()
	{
		return grafico;
	}
	
	public abstract void atacar(Entidad e);
}
