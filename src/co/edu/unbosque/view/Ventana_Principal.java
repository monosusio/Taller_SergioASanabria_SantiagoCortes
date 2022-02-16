package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Ventana_Principal extends JFrame {
	
	public Panel_Inicial Pi;
	
	public Panel_PromedioVentas PP;
	
	public Ventana_Principal() {

		setTitle("Registraduria");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.LIGHT_GRAY);
		getContentPane().setLayout(new BorderLayout());
		
		inicializarComponentes();
		
		setVisible(true);
		setLocationRelativeTo(null);
		setResizable(false);
	
	}
	
	public void inicializarComponentes() {
		
		Pi = new Panel_Inicial();
		Pi.setPreferredSize(new Dimension(200,450));
		getContentPane().add(Pi, BorderLayout.CENTER);
		
		PP = new Panel_PromedioVentas();
		PP.setPreferredSize(new Dimension(200,450));
		
	}

	public Panel_Inicial getPi() {
		return Pi;
	}

	public void setPi(Panel_Inicial pi) {
		Pi = pi;
	}

	public Panel_PromedioVentas getPP() {
		return PP;
	}

	public void setPP(Panel_PromedioVentas pP) {
		PP = pP;
	}
	
	

}
