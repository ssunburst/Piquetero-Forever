package GUI.boton;

import juego.Juego;
import juego.entidad.Entidad;
import juego.entidad.personaje.piquetero.KungLao;
import juego.entidad.personaje.piquetero.SubZero;

public class BotonKungLao extends BotonTienda {
	public BotonKungLao(Juego j) 
	{
		super(j, "Kung Lao");
	}

	@Override
	public Entidad crearEntidad(Juego j) {
		return new KungLao(this.juego);
	}
}
