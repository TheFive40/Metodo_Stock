package MetodoStock;

import javax.swing.JOptionPane; //IMPORTAMOS  LAS LIBRERIAS DE JAVAX SWING DE LA CLASE JOPTIONPANE 

import Quimica.Sales_Oxacidas_Acidas; //IMPORTAMOS LA CLASE DE SALES OXACIDAS ACIDAS

public class Sales_Oxacidas_AcidasStock { //CLASE
public void Sales_Acidas() { //METODO
	
	String compuesto = JOptionPane.showInputDialog("Ingresa el compuesto"); //ESTA INSTRUCCION HACE APARECER UN PANEL EN EL ESCRITORIO DEL USUARIO PIDIENDOLE
	//QUE NOS INGRESE UN COMPUESTO EL CUAL SE GUARDARA EN LA VARIABLE COMPUESTO JOPTIONPANE NOS AYUDA A CREAR ESTAS VENTANAS
	int hidrogenos = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el número de hidrogenos de tu elemento")); //SIGUIENTE A ESTO LE PEDIMOS QUE NOS ABRA
	//OTRA VENTANA EN DONDE EL TIPO DE DATO QUE NOS ALMACENARA SERA UN INT Y LO GUARDARA EN LA VARIABLE HIDROGENOS
	String Oxidacion = JOptionPane.showInputDialog("Ingrese el estado de oxidacion en números romanos"); //Y POR ULTIMO ABRIRA UNA TERCERA VENTANA DONDE LE PEDIRA EL ESTADO
	//DE OXIDACION DE SU ELEMENTO EN NUMEROS ROMANOS 
	if(compuesto.contentEquals("CuH2PO4") && hidrogenos == 2) { //EVALUARA CON UN IF SI EL COMPUESTO INGRESADO POR EL USUARIO ES UN "CuH2PO4" EN CASO DE SER VERDADERA
		JOptionPane.showMessageDialog(null, "Tu compuesto Es un Dihidrogeno fosfato DE COBRE " + Oxidacion); //IMPRIME ESTA INSTRUCCION EN DONDE MUESTRAS UN MENSAJE
		//CON UN JOPTION PANE ES DECIR DESDE UNA VENTANA QUE LE DIGA QUE SU COMPUESTO ES UN DIHIDROGENO FOSFATO DE COBRE 
		//COMO PODEMOS VER AQUI EN EL IF SI TIENE 2 HIDROGENOS LA NOMENCLATURA SERA DIFERENTE POR EJEMPLO EN EL SIGUIENTE IF SI TIENE UN HIDROGENO SU COMPUESTO SERA UN 
		//HIDROGENOCARBONATO  EN CASO QUE EL HIDROGENO FUERA 2 SERIA UN DIHIDROGENOCARBONATO
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
