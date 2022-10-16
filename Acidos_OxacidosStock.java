package MetodoStock;

import java.util.Scanner;

public class Acidos_OxacidosStock {
	public void Acidos_Oxacidoss() {
	Scanner entrada = new Scanner(System.in);
	System.out.println("Ingrese un compuesto por favor");
	String compuesto = entrada.nextLine();
	if (compuesto.contentEquals("H2SO4")) {
		System.out.println("Es un SULFATO (VI) DE HIDROGENO");
	}else if (compuesto.contentEquals("HClO")) {
		System.out.println("Es un Clorato (I) de Hidrógeno");
	}else if (compuesto.contentEquals("HNO3")){
		System.out.println("Es un Nitrato (V) de hidrógeno");
	}else if(compuesto.contentEquals("H2CO2")) {
		System.out.println("Es un Carbono  (II) de Hidrogeno");
	}else if (compuesto.contentEquals("H3PO4")) {
		System.out.println("Es un Fosforo (V) de Hidrogeno ");
	}else if (compuesto.contentEquals("H2SO2")) {
		System.out.println("Es un Sulfato (II) de Hidrogeno");
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
