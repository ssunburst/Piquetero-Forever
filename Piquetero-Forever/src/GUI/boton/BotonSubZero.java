package GUI.boton;

import juego.Juego;
import juego.entidad.Entidad;
import juego.entidad.personaje.piquetero.SubZero;

public class BotonSubZero extends BotonTienda
{

	public BotonSubZero(Juego j) 
	{
		super(j, "Sub-Zero");
	}
	
	@Override
	public Entidad crearEntidad(Juego j) 
	{
		return new SubZero(this.juego);
	}

}
