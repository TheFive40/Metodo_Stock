package MetodoStock;

import javax.swing.JOptionPane;

public class Sales_Oxacidas_BasicasStock {
public void Sales_Basicas() {
	String compuesto = JOptionPane.showInputDialog("Ingresa el compuesto");
	int OH = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el número de hidrogenos de tu elemento"));
	String Oxidacion = JOptionPane.showInputDialog("Ingrese el estado de oxidacion en números romanos");
	if(compuesto.contentEquals("Ni2(OH)2SO4")&& OH == 2) {
		JOptionPane.showMessageDialog(null, "Tu compuesto Es un Dihidroxi sulfato de Niquel " + Oxidacion);

	}else if (compuesto.contentEquals("Cu2(OH)2S6O4")&& OH == 1) {
		JOptionPane.showMessageDialog(null, "Tu compuesto Es un Dihidroxi sulfato de Cobre " + Oxidacion);

	}else if (compuesto.contentEquals("Ca(OH)2CO3")&& OH == 2) {
		JOptionPane.showMessageDialog(null, "Tu compuesto Es un Dihidroxi carbonato de Calcio " + Oxidacion);

	}else if (compuesto.contentEquals("Fe(OH)2CO2") && OH == 2) {
		JOptionPane.showMessageDialog(null, "Tu compuesto Es un Dihidroxi carbonato de Hierro " + Oxidacion);

	}else if (compuesto.contentEquals("Cu(OH)SO4") && OH == 1) {
		JOptionPane.showMessageDialog(null, "Tu compuesto Es un Hidroxi sulfato de Cobre " + Oxidacion);

	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
