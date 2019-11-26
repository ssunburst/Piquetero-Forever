package grafico;

import grafico.detector.DetectorHaciaDerecha;
import juego.entidad.Entidad;
import juego.entidad.personaje.piquetero.Piquetero;

import java.awt.Dimension;
import java.awt.Event;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.Icon;

public abstract class GraficoPersonaje extends GraficoEntidad
{
	protected boolean escudo;
	
	protected GraficoPersonaje(Entidad e) 
	{
		super(e);
		this.setSize(new Dimension(119, 100));
		escudo = false;
	}
	
	@Override
	protected void setearImagenes() 
	{
		imagenes = new Icon[4];
	}
	
	@Override
	public int posIdle() {
		if (!escudo)
			return 0;
		else
			return 2;
	}
	
	@Override
	public int posAtaque() 
	{
		if (!escudo)
			return 1;
		else
			return 3;
	}
	
	public void setearEscudo(boolean e)
	{
		escudo = e;
	}
}
