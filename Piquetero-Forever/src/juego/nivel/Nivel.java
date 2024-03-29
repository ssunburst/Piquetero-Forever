package juego.nivel;

import java.util.List;

import juego.Juego;
import juego.entidad.personaje.enemigo.Enemigo;

import java.util.LinkedList;
import java.util.Random;

import grafico.mapa.Mapa;

import java.util.Iterator;
import java.awt.Point;

public abstract class Nivel 
{
	protected Juego juego;
	protected List<Enemigo>[] oleadas;
	protected int oleadaActiva;
	protected boolean nivelTerminado;
	protected Random ran;
	protected Iterator<Enemigo> it;
	protected int demora;
	protected int demoraConsumida;
	protected int espaciado;

	public Nivel(Juego j, int o, int e) {
		juego = j;
		oleadas = (List<Enemigo>[]) new List[o];
		ran = new Random();

		for (int i = 0; i < oleadas.length; i++) 
		{
			oleadas[i] = new LinkedList<Enemigo>();
			agregarEnemigos(i, e);
		}
		it = oleadas[0].iterator();
		oleadaActiva = 0;
		nivelTerminado = false;
		demora = 150;
		demoraConsumida = 0;
	}

	public Nivel(Juego j, int e) {
		this(j, 2, e);
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
				boolean flag = true;
				Iterator<Enemigo> ie = oleadas[oleadaActiva].iterator();
				while (flag && ie.hasNext())
				{
					Enemigo en = ie.next();
					flag = flag && en.getVida() <= 0;
				}
				if (flag)
				{
					if (oleadaActiva == (oleadas.length - 1))
						nivelTerminado = true;
					else
					{
						it = oleadas[++oleadaActiva].iterator();
					}
				}
			}
		}
	}

	protected void agregarEnemigos(int i, int e) {
		for (int j = 0; j < e; j++) {
			int r = ran.nextInt(10);
			if (r < 5)
				oleadas[i].add(producirMas());
			else if ((r >= 5) && (r < 9))
				oleadas[i].add(producirMedio());
			else
				oleadas[i].add(producirMenos());
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
	
	protected abstract Enemigo producirMas();
	
	protected abstract Enemigo producirMedio();
	
	protected abstract Enemigo producirMenos();
}
