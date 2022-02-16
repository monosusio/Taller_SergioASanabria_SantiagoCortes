package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import co.edu.unbosque.view.Ventana_Principal;

public class Controller implements ActionListener{
	
	private Ventana_Principal vistaP;
	
	public Controller() {
		vistaP = new Ventana_Principal();
		AsignarOyentes();
	}
	
	public void AsignarOyentes() {
		
		vistaP.getPi().getBotonCvendidas().addActionListener(this);
		vistaP.getPi().getBotonDescripcion().addActionListener(this);
		vistaP.getPi().getBotonDfacturas().addActionListener(this);
		vistaP.getPi().getBotonPventas().addActionListener(this);
		vistaP.getPi().getBotonVtotales().addActionListener(this);
		
	}

	public void actionPerformed(ActionEvent e) {
		String com = e.getActionCommand();
		
		if(com.equals("Vtotales")) {
			System.out.println("ventas totales");
			JOptionPane.showMessageDialog(null, "Las ventas totales de la tienda son: "+" (ventas totales)");
			
		}
		else if(com.equals("Dfacturas")) {
			System.out.println("Detalles de factura");
			JOptionPane.showMessageDialog(null, "Los productos asociados a la factura "+"(número de factura) "+" son los siguentes:");
		}
		else if(com.equals("Cunidades")) {
			System.out.println("Cantidad de unidades");
			JOptionPane.showMessageDialog(null, "La cantidad de productos vendidos para el Stock: "+"(Número del Stock)"+"\n"
			+"Unidades vendidas: "+"(Unidades vendidas)");
		}
		else if(com.equals("Pventas")) {
			System.out.println("Promedio ventas");
			vistaP.getContentPane().remove(vistaP.getPi());
			vistaP.getPP().setVisible(false);
			vistaP.getContentPane().add(vistaP.getPP());
			vistaP.getPP().setVisible(true);
		}
		else if(com.equals("Descripcion")) {
			System.out.println("Descripcion");
			/*vistaP.getContentPane().remove(vistaP.getPi());
			vistaP.getContentPane().add(vistaP.getPr());
			vistaP.getPr().setVisible(true);*/
		}
	}

}
