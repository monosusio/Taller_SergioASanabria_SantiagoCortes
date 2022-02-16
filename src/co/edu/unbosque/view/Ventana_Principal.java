package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Ventana_Principal extends JFrame {
	
	public Panel_Inicial Pi;
	
	
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
		
	}

	public Panel_Inicial getPi() {
		return Pi;
	}

	public void setPi(Panel_Inicial pi) {
		Pi = pi;
	}

}
