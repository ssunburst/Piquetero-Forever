package GUI.boton;

import juego.Juego;
import juego.entidad.Entidad;
import juego.entidad.personaje.piquetero.SubZero;

public class BotonSubZero extends BotonTienda 
{	
	public BotonSubZero(Juego j)
	{
		super(j, "SUB-ZERO");
	}

	@Override
	public Entidad crearEntidad() {
		return new SubZero(this.juego);
	}

}
