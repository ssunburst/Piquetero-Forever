package GUI;

import javax.swing.*;

import GUI.boton.BotonMortero;
import GUI.boton.BotonPersonaje3;
import GUI.boton.BotonPersonaje4;
import GUI.boton.BotonPersonaje5;
import GUI.boton.BotonSubZero;
import GUI.boton.BotonTienda;

import java.awt.*;
import java.awt.event.*;
import juego.Juego;
import juego.entidad.personaje.enemigo.MechaBullrich;
import grafico.enemigo.GraficoMBullrich;
import grafico.mapa.Mapa;
import java.util.List;
import java.util.LinkedList;
import juego.entidad.Entidad;

public class GameGUI extends JFrame {
	private Juego juego;
	private JPanel pnTienda, pnPuntaje, pnMonedas;
	private JLabel lblPuntaje, lblMonedas;
	private JLabel lblSbraPuntaje, lblSbraMonedas;
	private List<JButton> lstBotones;
	private BotonTienda btnMortero, btnSubZero;
	private JButton btnVender;

	public GameGUI() {
		juego = new Juego(this);
		Container cp = this.getContentPane();

		cp.setLayout(null);
		this.setBounds(10, 0, 1260, 641);
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		lstBotones = new LinkedList<JButton>();
		// Panel tienda
		pnTienda = new JPanel();
		pnTienda.setLayout(new GridLayout(6,1));
		pnTienda.setBounds(1095, 5, 150, 603);
		pnTienda.setBackground(Color.black);
		cp.add(pnTienda);

		// Label de Puntaje
		lblSbraPuntaje = new JLabel("PUNTAJE   " + juego.getPuntaje());
		lblSbraPuntaje.setFont(new Font("Arial black", Font.ITALIC, 35));
		lblSbraPuntaje.setBounds(46, 34, 400, 35);
		juego.getMapa().add(lblSbraPuntaje);
		juego.getMapa().setComponentZOrder(lblSbraPuntaje, 0);
		
		lblPuntaje = new JLabel("PUNTAJE   " + juego.getPuntaje());
		lblPuntaje.setFont(new Font("Arial black", Font.ITALIC, 35));
		lblPuntaje.setBounds(50, 30, 400, 35);
		lblPuntaje.setForeground(Color.white);
		juego.getMapa().add(lblPuntaje);
		juego.getMapa().setComponentZOrder(lblPuntaje, 0);

		// Label de Monedas
		lblSbraMonedas = new JLabel("TURRODOLARES   " + juego.getMonedas());
		lblSbraMonedas.setFont(new Font("Arial black", Font.ITALIC, 35));
		lblSbraMonedas.setBounds(596, 34, 500, 35);
		juego.getMapa().add(lblSbraMonedas);
		juego.getMapa().setComponentZOrder(lblSbraMonedas, 0);
		
		lblMonedas = new JLabel("TURRODOLARES   " + juego.getMonedas());
		lblMonedas.setFont(new Font("Arial black", Font.ITALIC, 35));
		lblMonedas.setBounds(600, 30, 500, 35);
		lblMonedas.setForeground(Color.WHITE);
		juego.getMapa().add(lblMonedas);
		juego.getMapa().setComponentZOrder(lblMonedas, 0);
		

		// Botones
		btnMortero = new BotonMortero(juego);
		btnSubZero = new BotonSubZero(juego);
		BotonTienda btnP3 = new BotonPersonaje3(juego);
		BotonTienda btnP4 = new BotonPersonaje4(juego);
		BotonTienda btnP5 = new BotonPersonaje5(juego);
		
		lstBotones.add(btnMortero);
		lstBotones.add(btnSubZero);
		lstBotones.add(btnP3);
		lstBotones.add(btnP4);
		lstBotones.add(btnP5);

		for (JButton b : lstBotones)
			pnTienda.add(b);

		btnVender = new JButton("Vender");
		btnVender.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (juego.entidades().iterator().hasNext()) {
					setearPanel(false);
					juego.getMapa().setVender(true);
					btnVender.setEnabled(false);
				}
			}
		});
		pnTienda.add(btnVender);

//		--------------------------------------------------------------------
//		TEST BULLRICH
		
		Entidad mb = new MechaBullrich(juego);
		Point p = new Point(1087, juego.getMapa().rowSize()*3+113);
		juego.agregarEntidad(mb, p);
		System.out.println(mb.getGrafico().getLocation());
		
		cp.add(juego.getMapa());

		this.setVisible(true);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				GameGUI g = new GameGUI();
				Thread t = new Thread(g.juego());
				t.start();
			}
		});
	}

	public void actualizarPuntaje() {
		this.lblPuntaje.setText("Puntaje: " + juego.getPuntaje());
		this.lblSbraPuntaje.setText("PUNTAJE   " + juego.getPuntaje());
		lblPuntaje.repaint();
	}

	public void actualizarMonedas() {
		this.lblMonedas.setText("TURRODOLARES   " + juego.getMonedas());
		this.lblSbraMonedas.setText("TURRODOLARES   " + juego.getMonedas());
		lblMonedas.repaint();
	}

	public void setearPanel(boolean but) {
		for (JButton b : lstBotones)
			b.setEnabled(but);
	}
	
	public Juego juego()
	{
		return juego;
	}
	
	public void setearBotonVender(boolean v)
	{
		btnVender.setEnabled(v);
	}

}
