package GUI;

import javax.swing.*;
import GUI.boton.BotonTienda;
import java.awt.*;
import java.awt.event.*;
import juego.Juego;
import juego.entidad.personaje.enemigo.MechaBullrich;
import juego.entidad.personaje.piquetero.Altamira;
import juego.entidad.personaje.piquetero.CapitanAmerica;
import juego.entidad.personaje.piquetero.Megazord;
import juego.entidad.personaje.piquetero.Mortero;
import grafico.enemigo.GraficoMBullrich;
import grafico.mapa.Mapa;
import java.util.List;
import java.util.LinkedList;
import juego.entidad.Entidad;
import juego.entidad.objeto.Barril;
import juego.entidad.personaje.piquetero.Mortero;
import juego.entidad.personaje.piquetero.SubZero;
import juego.entidad.objeto.Lava;

public class GameGUI extends JFrame {
	private Juego juego;
	private JPanel pnTienda;
	private JLabel lblNivel, lblPuntaje, lblMonedas;
	private JLabel lblSbraNivel, lblSbraPuntaje, lblSbraMonedas;
	private List<JButton> lstBotones;
	private BotonTienda btnMortero, btnSubZero, btnAltamira, btnMegazord, btnCap,
						btnBarril, btnLava;
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
		pnTienda.setLayout(new FlowLayout());
		pnTienda.setBounds(1095, 5, 150, 603);
		pnTienda.setOpaque(false);
//		pnTienda.setBackground(Color.black);
		cp.add(pnTienda);

		// Label de Puntaje
		lblSbraPuntaje = new JLabel("PUNTAJE   " + juego.getPuntaje());
		lblSbraPuntaje.setFont(new Font("Arial black", Font.ITALIC, 30));
		lblSbraPuntaje.setBounds(367, 38, 400, 30);
		juego.getMapa().add(lblSbraPuntaje);
		juego.getMapa().setComponentZOrder(lblSbraPuntaje, 0);
		
		lblPuntaje = new JLabel("PUNTAJE   " + juego.getPuntaje());
		lblPuntaje.setFont(new Font("Arial black", Font.ITALIC, 30));
		lblPuntaje.setBounds(370, 35, 400, 30);
		lblPuntaje.setForeground(Color.white);
		juego.getMapa().add(lblPuntaje);
		juego.getMapa().setComponentZOrder(lblPuntaje, 0);

		// Label de Monedas
		lblSbraMonedas = new JLabel("DOLARUCOS   " + juego.getMonedas());
		lblSbraMonedas.setFont(new Font("Arial black", Font.ITALIC, 30));
		lblSbraMonedas.setBounds(697, 38, 500, 30);
		juego.getMapa().add(lblSbraMonedas);
		juego.getMapa().setComponentZOrder(lblSbraMonedas, 0);
		
		lblMonedas = new JLabel("DOLARUCOS   " + juego.getMonedas());
		lblMonedas.setFont(new Font("Arial black", Font.ITALIC, 30));
		lblMonedas.setBounds(700
				, 35, 500, 30);
		lblMonedas.setForeground(Color.WHITE);
		juego.getMapa().add(lblMonedas);
		juego.getMapa().setComponentZOrder(lblMonedas, 0);
		
		// Label de Nivel
		lblSbraNivel = new JLabel("NIVEL   " + juego.getNivelActual());
		lblSbraNivel.setFont(new Font("Arial black", Font.ITALIC, 40));
		lblSbraNivel.setBounds(11, 21, 500, 50);
		juego.getMapa().add(lblSbraNivel);
		juego.getMapa().setComponentZOrder(lblSbraNivel, 0);
		
		lblNivel = new JLabel("NIVEL   " + juego.getNivelActual());
		lblNivel.setFont(new Font("Arial black", Font.ITALIC, 40));
		lblNivel.setBounds(14, 18, 500, 50);
		lblNivel.setForeground(Color.white);
		juego.getMapa().add(lblNivel);
		juego.getMapa().setComponentZOrder(lblNivel, 0);
		

		// Botones
		btnMortero = new BotonTienda(juego, new Mortero(juego), "MORTERO");
		btnSubZero = new BotonTienda(juego, new SubZero(juego), "SUB-ZERO");
		btnAltamira = new BotonTienda(juego, new Altamira(juego), "ALTAMIRA");
		btnMegazord = new BotonTienda(juego, new Megazord(juego), "MEGAZORD");
		btnCap = new BotonTienda(juego, new CapitanAmerica(juego), "CAPITAN AMERICA");
		
		btnBarril = new BotonTienda(juego, new Barril(juego), "BARRIL");
		btnLava =  new BotonTienda(juego, new Lava(juego), "Lava");
		
		lstBotones.add(btnMortero);
		lstBotones.add(btnSubZero);
		lstBotones.add(btnAltamira);
		lstBotones.add(btnMegazord);
		lstBotones.add(btnCap);
		lstBotones.add(btnBarril);
		lstBotones.add(btnLava);

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
		this.lblPuntaje.setText("PUNTAJE   " + juego.getPuntaje());
		this.lblSbraPuntaje.setText("PUNTAJE   " + juego.getPuntaje());
	}

	public void actualizarMonedas() {
		this.lblMonedas.setText("TURRODOLARES   " + juego.getMonedas());
		this.lblSbraMonedas.setText("TURRODOLARES   " + juego.getMonedas());
	}
	
	public void actualizarNivel()
	{
		this.lblNivel.setText("NIVEL   " + juego.getNivelActual());
		this.lblSbraNivel.setText("NIVEL   " + juego.getNivelActual());
	}
	
	public Juego juego()
	{
		return juego;
	}
	
	public void setearBotonVender(boolean v)
	{
		btnVender.setEnabled(v);
	}
	
	public void setearPanel(boolean but) {
		for (JButton b : lstBotones)
			b.setEnabled(but);
	}
	
	public void finalizar(boolean v)
	{
		for (JButton b : this.lstBotones)
			b.setEnabled(false);
		btnVender.setEnabled(false);
		JOptionPane.showMessageDialog(this, v? "Has vencido! Has logrado mantener viva la llama de la lucha obrera." : "Has sido derrotado. Un día oscuro para la lucha sindical.");
	}

}
