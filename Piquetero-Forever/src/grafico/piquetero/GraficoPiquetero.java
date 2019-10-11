package grafico.piquetero;

import grafico.Grafico;
import juego.Entidad;
import java.awt.Event;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import juego.personaje.piquetero.Piquetero;

public class GraficoPiquetero extends Grafico
{
	Piquetero entidad;

	public GraficoPiquetero(Piquetero e, int img) {
		super(e, img);
		this.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				entidad.vender();
			}
		});
	}

}
