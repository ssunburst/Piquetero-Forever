package grafico.piquetero;

import grafico.Grafico;
import grafico.detector.DetectorHaciaDerecha;
import juego.entidad.Entidad;
import juego.entidad.personaje.piquetero.Piquetero;

import java.awt.Dimension;
import java.awt.Event;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.Icon;

public abstract class GraficoPiquetero extends Grafico
{
	public GraficoPiquetero(Entidad e) 
	{
		super(e);
		this.setSize(new Dimension(119, 100));
	}
	
	@Override
	protected void setearImagenes() 
	{
		imagenes = new Icon[3];
	}
}
