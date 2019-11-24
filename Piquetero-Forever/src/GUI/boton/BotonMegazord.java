package GUI.boton;

import juego.Juego;
import juego.entidad.Entidad;
import juego.entidad.personaje.piquetero.Megazord;

public class BotonMegazord extends BotonTienda {

	public BotonMegazord(Juego j) 
	{
		super(j, "MEGAZORD");
	}
	
	@Override
	public Entidad crearEntidad() {
		return new Megazord(this.juego);
	}

}
