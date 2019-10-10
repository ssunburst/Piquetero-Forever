package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import juego.Juego;
import grafico.ffaa.GraficoMBullrich;
import grafico.mapa.Mapa;

public class GameGUI extends JFrame  
{
	private JPanel pnTienda, pnPuntaje, pnMonedas;
	private Juego j;
	
	public GameGUI()
	{
		j = new Juego();
		Container cp = this.getContentPane();
		
		cp.setLayout(null);
		this.setBounds(10, 0, 1260, 641);
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		pnTienda = new JPanel();
		pnTienda.setBounds(1095, 5, 150, 603);
		pnTienda.setBackground(Color.black);
		cp.add(pnTienda);
		
		
		// Botones
		BotonMortero bMortero = new BotonMortero(j);
		bMortero.setBounds(20, 20, bMortero.getWidth(), bMortero.getHeight());
		pnTienda.add(bMortero);
		
		cp.add(j.getMapa());
		
////		// Enemy Test
//		GraficoMBullrich bull = new GraficoMBullrich();
//		bull.setBounds(400, 500, bull.getWidth(), bull.getHeight());
//		this.add(bull);		
		
		this.setVisible(true);

		
		
//		while (true)
//		{
//			bull.setBounds(bull.getX(), bull.getY(), bull.getWidth(), bull.getHeight());
//		}
		
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable()
				{
					@Override
					public void run() {
						new GameGUI();
					}
				});;
	}
}
