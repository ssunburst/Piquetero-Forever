package grafico;

import juego.entidad.Entidad;

public class GraficoPersonajeRango extends GraficoPersonaje 
{

	protected GraficoPersonajeRango(Entidad e) {
		super(e);
	}
	
	@Override
	public int posAtaque() {
		return posIdle();
	}
	
}
