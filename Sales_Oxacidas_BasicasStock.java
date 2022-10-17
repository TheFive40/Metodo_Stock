package MetodoStock;

import javax.swing.JOptionPane;

public class Sales_Oxacidas_BasicasStock {
public void Sales_Basicas() {
	String compuesto = JOptionPane.showInputDialog("Ingresa el compuesto"); //MOSTRAMOS UNA VENTANA FLOTANTE QUE LE INDICA AL USUARIO QUE INGRESE UN COMPUESTO
	int OH = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el número de hidrogenos de tu elemento")); //LE PEDIMOS QUE INGRESE EL NUMERO DE HIDROGENOS
	//QUE TIENE SU ELEMENTO  Y QUE LO GUARDE EN LA VARIABLE OH ATRAVEZ DE UNA VENTANA FLOTANTE 
	String Oxidacion = JOptionPane.showInputDialog("Ingrese el estado de oxidacion en números romanos"); //ACA LE PEDIMOS QUE INGRESE EL ESTADO DE OXIDACION 
	//EN NUMEROS ROMANOS DE SU ELEMENTO Y QUE LO GUARDE EN LA VARIABLE OXIDACION DE TIPO STRING
	if(compuesto.contentEquals("Ni2(OH)2SO4")&& OH == 2) { //EVALUAMOS CON UN IF SI EL COMPUESTO ES UN Ni2(OH)2SO4 Y TIENE 2 OH SI TIENE 2 OH
		JOptionPane.showMessageDialog(null, "Tu compuesto Es un Dihidroxi sulfato de Niquel " + Oxidacion); //ENTONCES EN UNA VENTANA FLOTANTE  AVISALE AL USUARIO
		//QUE SU COMPUESTO ES UN DI (PORQUE TIENE 2 OH) SULFATO DE NIQUEL 

	}else if (compuesto.contentEquals("Cu2(OH)2S6O4")&& OH == 1) { //ACA SEGUIMOS LA MISMA REGLA DEL IF ANTERIOR
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
