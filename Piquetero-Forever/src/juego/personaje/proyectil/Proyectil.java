package juego.personaje.proyectil;

import grafico.Grafico;
import juego.Entidad;

public abstract class Proyectil extends Entidad
{
	protected int alcance;

	public int getAlcance() {
		return alcance;
	}
}
