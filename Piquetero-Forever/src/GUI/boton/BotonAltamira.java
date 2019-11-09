package GUI.boton;

import juego.Juego;
import juego.entidad.Entidad;
import juego.entidad.personaje.piquetero.Altamira;

public class BotonAltamira extends BotonTienda {
	public BotonAltamira(Juego j) 
	{
		super(j, "Altamira");
	}

	@Override
	public Entidad crearEntidad(Juego j) {
		return new Altamira(j);
	}
}
