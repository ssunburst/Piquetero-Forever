package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import juego.Juego;
import juego.entidad.Entidad;
import juego.entidad.personaje.piquetero.Mortero;

public abstract class BotonTienda extends JButton
{
	protected Juego juego;
	protected Entidad entidad;
	
	public BotonTienda(Juego j)
	{
		this.setSize(new Dimension(80,20));
		juego = j;
		this.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (juego.getTienda().getToAdd() == null) 
				{
					Entidad e = crearEntidad(j);
					
					System.out.println("Monedas actuales: " + juego.getMonedas());
					
					if (juego.getMonedas() >= e.getPrecio()) 
					{
						juego.gastarMonedas(e.getPrecio());
						juego.getTienda().setNextToAdd(e);
						juego.getGUI().setearPanel(false);
						juego.getGUI().setearBotonVender(false);
					}
				}
			}
		});
	}

	public Entidad getEntidad() {
		return entidad;
	}

	public abstract Entidad crearEntidad(Juego j);
	
	
}
