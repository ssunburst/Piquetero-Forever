package juego;

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
		aColocar = null;
		return toReturn;
	}
}
