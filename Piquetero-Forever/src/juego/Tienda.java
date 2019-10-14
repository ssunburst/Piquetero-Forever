package juego;

import juego.entidad.Entidad;

public class Tienda 
{
	protected Entidad aColocar;
	protected Juego juego;

	
	public Tienda(Juego juego)
	{
		aColocar = null;
		this.juego = juego;
	}
	
	public void setNextToAdd(Entidad toAdd) {
		this.aColocar = toAdd;
	}
	
	public Entidad getToAdd()
	{
		Entidad toReturn = aColocar;
		return toReturn;
	}
}
