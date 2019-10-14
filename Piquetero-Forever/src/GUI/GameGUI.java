package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import juego.Juego;
import grafico.enemigo.GraficoMBullrich;
import grafico.mapa.Mapa;
import java.util.List;
import java.util.LinkedList;

public class GameGUI extends JFrame {
	private JPanel pnTienda, pnPuntaje, pnMonedas;
	private JLabel lblPuntaje, lblMonedas;
	private Juego j;
	private List<JButton> lstBotones;
	private BotonTienda btnMortero;
	private JButton btnVender;

	public GameGUI() {
		j = new Juego(this);
		Container cp = this.getContentPane();

		cp.setLayout(null);
		this.setBounds(10, 0, 1260, 641);
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		lstBotones = new LinkedList<JButton>();
		// Panel tienda
		pnTienda = new JPanel();
		pnTienda.setLayout(new FlowLayout());
		pnTienda.setBounds(1095, 5, 150, 603);
		pnTienda.setBackground(Color.black);
		cp.add(pnTienda);

		// Label de Puntaje
		lblPuntaje = new JLabel("Puntaje: " + j.getPuntaje());
		lblPuntaje.setFont(new Font("Serif", Font.PLAIN, 35));
		lblPuntaje.setBorder(BorderFactory.createLineBorder(Color.black));
		lblPuntaje.setBounds(50, 5, 400, 100);
		cp.add(lblPuntaje);
		cp.setComponentZOrder(lblPuntaje, 0);

		// Label de Monedas
		lblMonedas = new JLabel("Turrodólares: " + j.getMonedas());
		lblMonedas.setFont(new Font("Helvetica", Font.PLAIN, 35));
		lblMonedas.setBorder(BorderFactory.createLineBorder(Color.black));
		lblMonedas.setBounds(700, 5, 400, 100);
		cp.add(lblMonedas);
		cp.setComponentZOrder(lblMonedas, 0);

		// Botones
		btnMortero = new BotonMortero(j);
//		btnMortero.setBounds(20, 20, btnMortero.getWidth(), btnMortero.getHeight());
		lstBotones.add(btnMortero);

		for (JButton b : lstBotones)
			pnTienda.add(b);

		btnVender = new JButton("Vender");
		btnVender.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (j.entidades().iterator().hasNext()) {
					setearPanel(false);
					j.getMapa().setVender(true);
					btnVender.setEnabled(false);
				}
			}
		});
		pnTienda.add(btnVender);

		cp.add(j.getMapa());

		this.setVisible(true);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new GameGUI();
			}
		});
		;
	}

	public void actualizarPuntaje() {
		this.lblPuntaje.setText("Puntaje: " + j.getPuntaje());
		lblPuntaje.repaint();
	}

	public void actualizarMonedas() {
		this.lblMonedas.setText("Turrodólares: " + j.getMonedas());
		lblMonedas.repaint();
	}

	public void setearPanel(boolean but) {
		for (JButton b : lstBotones)
			b.setEnabled(but);
	}
	
	public void setearBotonVender(boolean v)
	{
		btnVender.setEnabled(v);
	}

}
