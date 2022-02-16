package co.edu.unbosque.view;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Panel_Inicial extends JPanel{
	
	private JButton BotonVtotales, BotonDfacturas,BotonCunidades,BotonPventas,BotonDescripcion;
	
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
		
		BotonCunidades = new JButton("Cantidad de unidades");
		BotonCunidades.setActionCommand("Cunidades");
		add(BotonCunidades);
		
		BotonPventas = new JButton("Promedio de ventas");
		BotonPventas.setActionCommand("Pventas");
		add(BotonPventas);
		
		BotonDescripcion = new JButton("Buscar por descripcion");
		BotonDescripcion.setActionCommand("Descripcion");
		add(BotonDescripcion);
	}

	public JButton getBotonVtotales() {
		return BotonVtotales;
	}

	public void setBotonVtotales(JButton botonVtotales) {
		BotonVtotales = botonVtotales;
	}

	public JButton getBotonDfacturas() {
		return BotonDfacturas;
	}

	public void setBotonDfacturas(JButton botonDfacturas) {
		BotonDfacturas = botonDfacturas;
	}

	public JButton getBotonCvendidas() {
		return BotonCunidades;
	}

	public void setBotonCvendidas(JButton botonCvendidas) {
		BotonCunidades = botonCvendidas;
	}

	public JButton getBotonPventas() {
		return BotonPventas;
	}

	public void setBotonPventas(JButton botonPventas) {
		BotonPventas = botonPventas;
	}

	public JButton getBotonDescripcion() {
		return BotonDescripcion;
	}

	public void setBotonDescripcion(JButton botonDescripcion) {
		BotonDescripcion = botonDescripcion;
	}


	
	

}
