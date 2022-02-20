package co.edu.unbosque.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

public class CSVReader {
	
	private BufferedReader Lector;
	private String Linea;
	private String partes [] = null;
	public String nombreArchivo;
	private File f;
	public String pais;
	public Productos producto;
	
	public CSVReader() {
		f = new File("archivo\\data.csv");
	}

	
	public void leerArchivo(String nombreArchivo) {
		try {
			Lector = new BufferedReader(new FileReader(nombreArchivo));
			while ((Linea = Lector.readLine()) != null) {
			partes = Linea.split(",");
			añadir_producto();
			System.out.println();
			}
			Lector.close();
			Linea = null;
			
		
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}

		}
	


	public void añadir_producto() {
		for (int i = 0; i < partes.length; i++) {
			System.out.print(partes[i]+ "    |    ");//+"\n");
		
			Productos producto = new Productos(partes[0], partes[1], partes[2], partes[3], partes[4],partes[5], partes[6], partes[7]);
		}
		
		System.out.println(producto);
		
	}
	
	public void buscar_pais() {
		
		for (int i = 0; i < partes.length; i++) {
			if(producto.equals(pais))
			System.out.print(producto.getCountry()+ "    |    ");
			
			}
		}
	
	


	public String getPais() {
		return pais;
	}


	public void setPais(String pais) {
		this.pais = pais;
	}


	public String getNombreArchivo() {
		return nombreArchivo;
	}


	public void setNombreArchivo(String nombreArchivo) {
		this.nombreArchivo = nombreArchivo;
	}}
