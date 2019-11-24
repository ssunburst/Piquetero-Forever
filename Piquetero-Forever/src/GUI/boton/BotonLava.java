package GUI.boton;

import juego.Juego;
import juego.entidad.Entidad;
import juego.entidad.objeto.Lava;

public class BotonLava extends BotonTienda {

	public BotonLava(Juego j)
	{
		super(j, "LAVA");
	}
	
	@Override
	public Entidad crearEntidad() 
	{
		return new Lava(this.juego);
	}

}
