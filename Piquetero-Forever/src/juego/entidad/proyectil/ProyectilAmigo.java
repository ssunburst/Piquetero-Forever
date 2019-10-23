package juego.entidad.proyectil;

import grafico.detector.DetectorHaciaDerecha;
import juego.Juego;
import visitor.*;

public abstract class ProyectilAmigo extends Proyectil
{
	public ProyectilAmigo(Juego j) {
		super(j);
		this.detector = new DetectorHaciaDerecha(j, this);
		this.direccion = DERECHA;
		this.visitor = new VisitorPiquetero(this);
	}
}
