package co.edu.unbosque.controller;

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
	
	
	public void leerArchivo(String nombreArchivo) {
		try {
			Lector = new BufferedReader(new FileReader(nombreArchivo));
			while ((Linea = Lector.readLine()) != null) {
			partes = Linea.split(",");
			imprimirLinea();
			System.out.println();
			}
			Lector.close();
			Linea = null;
			partes = null;
		
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}

		}


	private void imprimirLinea() {
		for (int i = 0; i < partes.length; i++) {
			System.out.print(partes[i]+ "    |    ");
		}
	}}
