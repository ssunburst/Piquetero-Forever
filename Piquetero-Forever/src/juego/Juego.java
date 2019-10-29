package juego;

import grafico.mapa.Mapa;
import juego.entidad.Entidad;

import java.util.List;

import org.omg.CORBA.FREE_MEM;

import java.util.LinkedList;
import GUI.GameGUI;
import java.awt.Point;

public class Juego implements Runnable {
	protected int puntaje;
	protected int monedas;
	protected Mapa mapa;
	
	protected Nivel nivelActual;
	protected Tienda tienda;
	
	protected List<Entidad> entidades;
	protected List<Entidad> aAgregar;
	protected List<Entidad> aQuitar;
	
	protected GameGUI gui;
	protected boolean juegoActivo;

	public Juego(GameGUI g) {
		gui = g;
		puntaje = 0;
		monedas = 1000;
		mapa = new Mapa(this);
		tienda = new Tienda(this);
		entidades = new LinkedList<Entidad>();
		aQuitar = new LinkedList<Entidad>();
		aAgregar = new LinkedList<Entidad>();
		juegoActivo = true;

	}

	public int getPuntaje() {
		return puntaje;
	}

	public void ganarPuntos(int p) {
		puntaje +=p;
		this.gui.actualizarPuntaje();
	}
	
	public void ganarMonedas(int m)
	{
		this.monedas+= m;
		this.gui.actualizarMonedas();
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

	public int getMonedas() {
		return monedas;
	}

	public void gastarMonedas(int m) {
		this.monedas -= m;
		this.gui.actualizarMonedas();
	}

	public Iterable<Entidad> entidades() {
		return this.entidades;
	}

	public void agregarEntidad(Entidad e, Point p) {
		this.entidades.add(e);
		this.mapa.agregarGrafico(e.getGrafico(), p);
	}
	
	public void quitarLuego(Entidad e)
	{
		aQuitar.add(e);
	}
	
	public void agregarLuego(Entidad e)
	{
		aAgregar.add(e);
	}

	public void quitarEntidad(Entidad e) {
		this.entidades.remove(e);
		this.mapa.quitarGrafico(e.getGrafico());
	}

	public void accionar() {
		for (Entidad e : entidades)
			e.accionar();
	}

	public GameGUI getGUI() {
		return gui;
	}

	public boolean juegoActivo() {
		return juegoActivo;
	}

	public void terminarJuego() {
		juegoActivo = false;
	}
	
	public void finalizar()
	{
		entidades.clear();
		aQuitar.clear();
		aAgregar.clear();
		gui.mostrarFinalizacion();		
	}

	@Override
	public void run() {
		while (juegoActivo) {
			this.accionar();
			for (Entidad e: aQuitar)
				quitarEntidad(e);
			for (Entidad e: aAgregar)
				agregarEntidad(e, e.getGrafico().getLocation());
			aAgregar = new LinkedList<Entidad>();
			this.mapa.repaint();
			try {
				Thread.sleep(100);
			} catch (InterruptedException ex) {

			}
		}
		finalizar();
	}
}
