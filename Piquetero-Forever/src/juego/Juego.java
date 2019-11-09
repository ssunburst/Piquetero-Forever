package juego;

import grafico.mapa.Mapa;
import juego.entidad.Entidad;
import juego.nivel.Nivel;

import java.util.List;

import org.omg.CORBA.FREE_MEM;

import java.util.LinkedList;
import GUI.GameGUI;
import java.awt.Point;
import juego.nivel.NivelUno;
import juego.nivel.NivelDos;
import juego.nivel.NivelTres;

public class Juego implements Runnable {
	protected Mapa mapa;
	protected GameGUI gui;
	
	protected Tienda tienda;
	
	protected Nivel[] niveles;
	protected int nivelActual;
	
	protected List<Entidad> entidades;
	protected List<Entidad> aAgregar;
	protected List<Entidad> aQuitar;
	
	protected boolean juegoActivo;
	protected boolean victoria;
	protected int puntaje;
	protected int monedas;

	public Juego(GameGUI g) 
	{
		gui = g;
		puntaje = 0;
		monedas = 1000;
		mapa = new Mapa(this);
		tienda = new Tienda(this);
		entidades = new LinkedList<Entidad>();
		aQuitar = new LinkedList<Entidad>();
		aAgregar = new LinkedList<Entidad>();
		juegoActivo = true;
		victoria = true;
		
		niveles = new Nivel[3];
		niveles[0] = new NivelUno(this);
		niveles[1] = new NivelDos(this);
		niveles[2] = new NivelTres(this);
		nivelActual = 0;
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

	public int getNivelActual() {
		return nivelActual + 1;
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
		if (niveles[nivelActual].termino())
		{
			if (nivelActual == (niveles.length -1))
				terminarJuego(true);
			else
			{
				nivelActual++;
				gui.actualizarNivel();
			}
		}
		else
		{
			niveles[nivelActual].accionar();
			for (Entidad e : entidades)
				e.accionar();
		}
	}

	public GameGUI getGUI() {
		return gui;
	}

	public boolean juegoActivo() {
		return juegoActivo;
	}

	public void terminarJuego(boolean v) 
	{
		if (!v)
			victoria = false;
		juegoActivo = false;
	}
	
	
	protected void finalizar(boolean v)
	{
		entidades.clear();
		aQuitar.clear();
		aAgregar.clear();
		gui.finalizar(v);		
	}

	@Override
	public void run() {
		while (juegoActivo) {
			this.accionar();
			mapa.purgar();
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
		finalizar(victoria);
	}
}
