package juego.personaje.ffaa;

import grafico.Grafico;
import juego.objeto.Objeto;
import juego.personaje.Personaje;

public abstract class Enemigo extends Personaje
{
	protected Objeto premio;
	protected int recompensa;	// Cantidad de monedas otorgadas
	protected int puntaje;		// Puntos otorgados al jugador
}
