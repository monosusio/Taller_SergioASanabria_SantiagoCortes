package co.edu.unbosque.view;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Panel_Inicial extends JPanel{
	
	private JButton BotonVtotales, BotonDfacturas,BotonCvendidas,BotonPventas,BotonDescripcion;
	
	public Panel_Inicial() {

		setLayout(new FlowLayout());
		inicializarComponentes();
		setVisible(true);
		
	}
	
	public void inicializarComponentes() {
		
		
		BotonVtotales = new JButton("Ventas totales");
		BotonVtotales.setActionCommand("Vtotales");
		add(BotonVtotales);
		
		BotonDfacturas = new JButton("Detalles de factura");
		BotonDfacturas.setActionCommand("Dfacturas");
		add(BotonDfacturas);
		
		BotonCvendidas = new JButton("Cantidad de unidades");
		BotonCvendidas.setActionCommand("Cvendidas");
		add(BotonCvendidas);
		
		BotonPventas = new JButton("Promedio de ventas");
		BotonPventas.setActionCommand("Pventas");
		add(BotonPventas);
		
		BotonDescripcion = new JButton("Buscar por descripcion");
		BotonDescripcion.setActionCommand("Descripcion");
		add(BotonDescripcion);
	}

	public JButton getBotonRegis() {
		return BotonVtotales;
	}

	public void setBotonRegis(JButton botonRegis) {
		BotonVtotales = botonRegis;
	}

	public JButton getBotonIniciar() {
		return BotonDfacturas;
	}

	public void setBotonIniciar(JButton botonIniciar) {
		BotonDfacturas = botonIniciar;
	}
	
	

}
