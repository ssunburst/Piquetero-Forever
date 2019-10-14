package juego.entidad;

import javax.swing.JComponent;
import javax.swing.Icon;
import java.awt.Point;
import grafico.Grafico;
import juego.Juego;
import visitor.Visitor;

public abstract class Entidad
{
	protected Juego juego;
	protected Grafico grafico;
	protected int dagno;
	protected int precio;
	protected int velocidad;
	protected int vida;
	protected Visitor visitor;
	
	
	public Entidad(Juego j)
	{
		this.juego = j;
	}
	
	public int getPrecio()
	{
		return precio;
	}
	
	public int getVida() {
		return vida;
	}

	public abstract void recibirDagno(int d);
	
	public void morir()
	{
		// Animaciones y otres
		this.grafico.setearImagen(Grafico.MORIR);
		juego.quitarEntidad(this);
	}
	
	public Visitor visitor()
	{
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
	
	public abstract void accionar();
	
	public void atacar(Entidad e)
	{
		// AGREGAR animación y otres.
		this.grafico.setearImagen(Grafico.ATACAR);
		e.recibirDagno(this.dagno);
		this.grafico.setearImagen(Grafico.IDLE);
	}
	
	public void vender()
	{
		
	}
	
	public abstract void aceptar(Visitor v);
}
