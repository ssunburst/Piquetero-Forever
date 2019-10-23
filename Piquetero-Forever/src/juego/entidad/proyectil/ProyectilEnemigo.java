package juego.entidad.proyectil;

import grafico.detector.DetectorHaciaIzquierda;
import juego.Juego;
import juego.entidad.Entidad;
import visitor.VisitorEnemigo;
import juego.accionador.AccionadorMelee;

public abstract class ProyectilEnemigo extends Proyectil
{
	public ProyectilEnemigo(Juego j) {
		super(j);
		this.detector = new DetectorHaciaIzquierda(j, this);
		this.direccion = IZQUIERDA;
		this.visitor = new VisitorEnemigo(this);
	}
}
