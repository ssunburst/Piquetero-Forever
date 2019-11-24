package juego.entidad.objeto;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.Icon;
import java.awt.Point;
import grafico.Grafico;
import grafico.detector.DetectorHaciaDerecha;
import juego.Juego;
import juego.accionador.AccionadorMelee;
import juego.entidad.Entidad;
import visitor.Visitor;
import visitor.VisitorPiquetero;

public abstract class Objeto extends Entidad
{

	protected Objeto(Juego j) 
	{
		super(j);
		this.detector = new DetectorHaciaDerecha(j, this);
		this.visitor = new VisitorPiquetero(this);
	}
	
	@Override
	public void atacar(Entidad e) {}
	
	public void mover() {}
	
}
