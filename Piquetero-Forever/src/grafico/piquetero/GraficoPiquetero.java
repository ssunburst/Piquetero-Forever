package grafico.piquetero;

import grafico.Grafico;
import grafico.detector.DetectorHaciaDerecha;
import juego.entidad.Entidad;
import juego.entidad.personaje.piquetero.Piquetero;

import java.awt.Event;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GraficoPiquetero extends Grafico
{
	Piquetero entidad;

	public GraficoPiquetero(Piquetero e, int img) 
	{
		super(e);
		this.dc = new DetectorHaciaDerecha(this.entidad.getJuego(), this);
		this.direccion = DERECHA;
	}
	
}
