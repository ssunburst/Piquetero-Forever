package juego.nivel;

import java.util.List;

import juego.Juego;
import juego.entidad.personaje.enemigo.Enemigo;

import java.util.LinkedList;
import java.util.Random;

import grafico.mapa.Mapa;

import java.util.Iterator;
import java.awt.Point;

public abstract class Nivel {
	protected Juego juego;
	protected List<Enemigo>[] oleadas;
	protected int oleadaActiva;
	protected boolean nivelTerminado;
	protected Random ran;
	protected Iterator<Enemigo> it;
	protected int demora;
	protected int demoraConsumida;
	protected int espaciado;

	protected Enemigo mas;
	protected Enemigo normal;
	protected Enemigo menos;

	public Nivel(Juego j, int o) {
		juego = j;
		oleadas = (List<Enemigo>[]) new List[o];
		ran = new Random();

		for (int i = 0; i < oleadas.length; i++) {
			inicializarEnemigos();
			oleadas[i] = new LinkedList<Enemigo>();
			agregarEnemigos(i);
		}
		it = oleadas[0].iterator();
		oleadaActiva = 0;
		nivelTerminado = false;
		demora = 150;
		demoraConsumida = 0;
	}

	public Nivel(Juego j) {
		this(j, 2);
	}

	public void accionar() {
		if (comprobarDemora()) 
		{
			if (it.hasNext()) 
			{
				int p = ran.nextInt(100);
				if (p > espaciado) 
				{
					Mapa m = juego.getMapa();
					int f = m.filas();
					int x = m.posColumna(m.columnas()+1);
					int y = m.posFila(ran.nextInt(f) + 1);
					Enemigo toAdd = it.next();
					toAdd.getGrafico().setLocation(new Point(x, y));
					juego.agregarLuego(toAdd);
				}
			} else 
			{
				if (oleadaActiva == (oleadas.length - 1))
					nivelTerminado = true;
				else 
				{
					demoraConsumida = 0;
					oleadaActiva++;
				}
			}
		}
	}

	protected abstract void inicializarEnemigos();

	protected void agregarEnemigos(int i) {
		for (int j = 0; j < 10; j++) {
			int r = ran.nextInt(10);
			if (r < 5)
				oleadas[i].add(mas.clonar());
			else if ((r >= 5) && (r < 9))
				oleadas[i].add(normal.clonar());
			else
				oleadas[i].add(menos.clonar());
		}
	}

	protected boolean comprobarDemora() {
		if (demoraConsumida == demora)
			return true;
		else {
			demoraConsumida++;
			return false;
		}
	}

	public boolean termino() {
		return nivelTerminado;
	}
}
