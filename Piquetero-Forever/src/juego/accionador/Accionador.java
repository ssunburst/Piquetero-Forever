package juego.accionador;

import juego.entidad.Entidad;

public interface Accionador 
{
	public void accionar();
	
	public void atacar(Entidad e);
}
