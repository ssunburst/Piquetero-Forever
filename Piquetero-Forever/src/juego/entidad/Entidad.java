package juego.entidad;

import javax.swing.JComponent;
import javax.swing.Icon;
import java.awt.Point;
import grafico.Grafico;
import juego.Juego;
import visitor.Visitor;
import java.util.Iterator;
import juego.accionador.Accionador;
import juego.entidad.proyectil.Proyectil;
import grafico.detector.DetectorColisiones;

public abstract class Entidad {
	protected Juego juego;
	protected Grafico grafico;
	protected Accionador accionador;
	protected Visitor visitor;
	protected DetectorColisiones detector;
	protected Proyectil proyectil;

	protected int dagno;
	protected int precio;
	protected int velocidad;
	protected int vida;
	
	protected int direccion;
	protected final int DERECHA = 1;
	protected final int IZQUIERDA = -1;
	protected final int ESTATICO = 0;

	protected Entidad(Juego j) 
	{
		this.juego = j;
	}
	
	public int getDireccion()
	{
		return direccion;
	}

	public int getPrecio() {
		return precio;
	}

	public int getVida() {
		return vida;
	}

	public abstract void recibirDagno(int d);

	public void morir() {
		// TODO Animaciones y otres
		this.grafico.setearImagen(grafico.posMuerte());
		juego.quitarLuego(this);
	}

	public Visitor visitor() {
		return visitor;
	}

	public Juego getJuego() {
		return juego;
	}

	public Grafico getGrafico() {
		return grafico;
	}

	public int getDagno() {
		return dagno;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void accionar() 
	{
		accionador.accionar();
	}
	
	public void mover()
	{
		Point p = grafico.getLocation();
		double x = p.getX() + velocidad*direccion;
		double y = p.getY();
		p.setLocation(x, y);
		grafico.setLocation(p);
	}

	public void atacar(Entidad e) 
	{
		accionador.atacar(e);
	}
	
	public Proyectil getProyectil()
	{
		return proyectil;
	}
	
	public Iterable<Entidad> detectarColisiones()
	{
		return detector.detectarColisiones();
	}

	public void vender() {}
	
	public abstract Entidad clonar();

	public abstract void aceptar(Visitor v);
}
