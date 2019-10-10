package juego;
import grafico.mapa.Mapa;
import java.util.List;
import java.util.LinkedList;

public class Juego 
{
	protected int puntaje;
	protected int monedas;
	protected Mapa mapa;
	protected Nivel nivelActual;
	protected Tienda tienda;
	protected List<Entidad> entidades;
	
	public Juego()
	{
		puntaje = 0;
		monedas = 1000;
		mapa = new Mapa(this);
		tienda = new Tienda(this);
		entidades = new LinkedList<Entidad>();
	}
	
	public int getPuntaje() {
		return puntaje;
	}
	
	public void setPuntaje(int p) {
		puntaje = p;
	}
	
	public Nivel getNivelActual() {
		return nivelActual;
	}
	
	public void setNivelActual(Nivel nivelActual) {
		this.nivelActual = nivelActual;
	}
	
	public Mapa getMapa() {
		return mapa;
	}
	
	public Tienda getTienda() {
		return tienda;
	}
	
	public int getMonedas()
	{
		return monedas;
	}
	
	public void gastarMonedas(int m)
	{
		this.monedas -= m;
	}
	
	public Iterable<Entidad> entidades()
	{
		return this.entidades;
	}
	
	public void agregarEntidad(Entidad e)
	{
		this.entidades.add(e);
	}
	
	public void quitarEntidad(Entidad e)
	{
		this.entidades.remove(e);
	}
}
