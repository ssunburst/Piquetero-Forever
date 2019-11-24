package GUI.boton;

import juego.entidad.Entidad;
import juego.entidad.personaje.piquetero.Mortero;
import juego.Juego;

public class BotonMortero extends BotonTienda
{
	public BotonMortero(Juego j) 
	{
		super(j, "MORTERO");
	}
	
	@Override
	public Entidad crearEntidad() 
	{
		return new Mortero(this.juego);
	}
	
}
