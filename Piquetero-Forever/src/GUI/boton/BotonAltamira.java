package GUI.boton;

import juego.Juego;
import juego.entidad.Entidad;
import juego.entidad.personaje.piquetero.Altamira;

public class BotonAltamira extends BotonTienda
{
	public BotonAltamira(Juego j)
	{
		super(j, "ALTAMIRA");
	}
	
	@Override
	public Entidad crearEntidad() {
		return new Altamira(this.juego);
	}

}
