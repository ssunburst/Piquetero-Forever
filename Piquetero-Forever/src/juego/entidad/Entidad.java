package juego.entidad;

import javax.swing.JComponent;
import javax.swing.Icon;
import java.awt.Point;
import grafico.GraficoEntidad;
import juego.Juego;
import visitor.Visitor;
import java.util.Iterator;
import juego.accionador.AccionadorPersonaje;
import juego.entidad.proyectil.Proyectil;
import grafico.detector.DetectorColisiones;

public abstract class Entidad {
	protected Juego juego;
	protected GraficoEntidad grafico;
	protected Visitor visitor;
	protected DetectorColisiones detector;

	protected int precio;
	protected int dagno;
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

	public int getVida() {
		return vida;
	}

	public void recibirDagno(int d)
	{
		this.vida -= d;
		if (vida <= 0)
			this.morir();
	}

	public void morir() 
	{
		juego.quitarLuego(this);
	}

	public Visitor visitor() {
		return visitor;
	}

	public Juego getJuego() {
		return juego;
	}

	public GraficoEntidad getGrafico() {
		return grafico;
	}

	public int getDagno() {
		return dagno;
	}
	
	public int getPrecio()
	{
		return precio;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public abstract void accionar();
	
	public abstract void atacar(Entidad e);
	
	public void mover()
	{
		Point p = grafico.getLocation();
		double x = p.getX() + velocidad*direccion;
		double y = p.getY();
		p.setLocation(x, y);
		grafico.setLocation(p);
	}
	
	public Iterable<Entidad> detectarColisiones()
	{
		return detector.detectarColisiones();
	}

	public void vender() {}

	public abstract void aceptar(Visitor v);
}
