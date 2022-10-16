package MetodoStock;

import javax.swing.JOptionPane;

import Quimica.Sales_Oxacidas_Acidas;

public class Sales_Oxacidas_AcidasStock {
public void Sales_Acidas() {
	
	String compuesto = JOptionPane.showInputDialog("Ingresa el compuesto");
	int hidrogenos = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el número de hidrogenos de tu elemento"));
	String Oxidacion = JOptionPane.showInputDialog("Ingrese el estado de oxidacion en números romanos");
	if(compuesto.contentEquals("CuH2PO4") && hidrogenos == 2) {
		JOptionPane.showMessageDialog(null, "Tu compuesto Es un Dihidrogeno fosfato DE COBRE " + Oxidacion);
	}else if (compuesto.contentEquals("KHCO3") && hidrogenos == 1) {
		JOptionPane.showMessageDialog(null, "Tu compuesto Es un Hidrogenocarbonato DE POTASIO " + Oxidacion);

	}else if (compuesto.contentEquals("MgHP3O3") && hidrogenos == 1) {
		JOptionPane.showMessageDialog(null, "Tu compuesto Es un Hidrogeno fosfato DE PLOMO " + Oxidacion);

	}else if (compuesto.contentEquals("FeHPO3")&& hidrogenos == 1) {
		JOptionPane.showMessageDialog(null, "Tu compuesto Es un Hidrogeno Fosfato DE HIERRO " + Oxidacion);

	}else if (compuesto.contentEquals("NaH2PO4")&& hidrogenos == 2) {
		JOptionPane.showMessageDialog(null, "Tu compuesto Es un Dihidrogeno Fosfato DE SODIO " + Oxidacion);

	}else if (compuesto.contentEquals("LiHCO2")&& hidrogenos == 1) {
		JOptionPane.showMessageDialog(null, "Tu compuesto Es un Hidrogeno cobalto DE LITIO " + Oxidacion);

	}
	
		
	
}
	public static void main(String[] args) {
		Sales_Oxacidas_Acidas a = new Sales_Oxacidas_Acidas();
		a.Sales_Acidas();
	}

}
