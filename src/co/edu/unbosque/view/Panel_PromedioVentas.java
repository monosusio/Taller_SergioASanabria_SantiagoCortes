package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class Panel_PromedioVentas extends JPanel {
	
	private JPanel p1;
	private JLabel Lpromedio,Lpromedio2,Lpais;
	public String nprom;
	private JComboBox pais;
	
	public Panel_PromedioVentas() {
		
		setLayout(new FlowLayout());
		iniciar();
		setVisible(true);
	}
	
	public void iniciar() {
		
		p1 = new JPanel();
		p1.setLayout(new GridLayout(10,2,1,10));
		p1.setBorder(new TitledBorder("Promedio de ventas"));
		p1.setSize(50, 50);
		add(p1, BorderLayout.BEFORE_FIRST_LINE);
		
		Lpromedio = new JLabel("El promedio de ventas mensuales es de: ");
		p1.add(Lpromedio);
		
		Lpromedio2 = new JLabel(nprom+"promedio");
		p1.add(Lpromedio2);
		
////////////////////////////////////////////////////////////////////////////////////		
		Lpais = new JLabel("Selecciones pais para ver su promedio de ventas");
		p1.add(Lpais);
		
		pais = new JComboBox();
		pais.addItem("pais 1");
		pais.addItem("pias 2");
		pais.addItem("pais 3");
		p1.add(pais);
		
	}

	public JPanel getP1() {
		return p1;
	}

	public void setP1(JPanel p1) {
		this.p1 = p1;
	}

	public JLabel getLpromedio() {
		return Lpromedio;
	}

	public void setLpromedio(JLabel lpromedio) {
		Lpromedio = lpromedio;
	}

	public JLabel getLpromedio2() {
		return Lpromedio2;
	}

	public void setLpromedio2(JLabel lpromedio2) {
		Lpromedio2 = lpromedio2;
	}

	public JLabel getLpais() {
		return Lpais;
	}

	public void setLpais(JLabel lpais) {
		Lpais = lpais;
	}

	public String getNprom() {
		return nprom;
	}

	public void setNprom(String nprom) {
		this.nprom = nprom;
	}

	public JComboBox getPais() {
		return pais;
	}

	public void setPais(JComboBox pais) {
		this.pais = pais;
	}
	
	

}
