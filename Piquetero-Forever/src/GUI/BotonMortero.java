package GUI;

import juego.Juego;
import juego.personaje.piquetero.Mortero;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class BotonMortero extends BotonPiquetero 
{
	public BotonMortero(Juego j) 
	{
		super(j);
		this.setText("Mortero");
		
		this.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (juego.getTienda().getToAdd() == null) 
				{
					Mortero m = new Mortero();
					
					System.out.println("Monedas actuales: " + juego.getMonedas());
					
					if (juego.getMonedas() >= m.getPrecio()) 
					{
						juego.gastarMonedas(m.getPrecio());
						juego.getTienda().setNextToAdd(m);
					}
				}
			}
		});
	}
}
