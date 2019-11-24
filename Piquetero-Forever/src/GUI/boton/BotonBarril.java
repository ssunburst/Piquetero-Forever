package GUI.boton;

import juego.Juego;
import juego.entidad.Entidad;
import juego.entidad.objeto.Barril;

public class BotonBarril extends BotonTienda {

	public BotonBarril(Juego j) {
		super(j, "BARRIL");
	}
	
	@Override
	public Entidad crearEntidad() {
		return new Barril(this.juego);
	}

}
