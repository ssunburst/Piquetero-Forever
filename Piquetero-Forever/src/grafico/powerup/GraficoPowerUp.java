package grafico.powerup;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.Icon;

import grafico.Grafico;
import juego.powerup.PowerUp;

public class GraficoPowerUp extends Grafico implements MouseListener 
{
	protected PowerUp pup;
	
	public GraficoPowerUp(PowerUp p) 
	{
		super();
		pup = p;
		this.addMouseListener(this);
	}
	
	@Override
	protected void setearImagenes() {
		this.imagenes = new Icon[1];
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		pup.activar();
		getParent().remove(this);
	}

	@Override
	public void mouseEntered(MouseEvent e) {}

	@Override
	public void mouseExited(MouseEvent e) {}

	@Override
	public void mousePressed(MouseEvent e) {}

	@Override
	public void mouseReleased(MouseEvent e) {}
	
	
}
