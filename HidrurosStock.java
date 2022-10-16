package MetodoStock;

import java.util.Scanner;

public class HidrurosStock {
public void Hidruros() {
	Scanner entrada = new Scanner(System.in);
	System.out.println("Ingrese un compuesto por favor");
	String compuesto = entrada.nextLine();
	if(compuesto.contentEquals("H")) {
		if(compuesto.contentEquals("CuH2")) {
			System.out.println("es un HIDRURO de Cobre (II)");
		}else if (compuesto.contentEquals("CaH2")) {
			System.out.println("Es un HIDRURO de Calcio");
		}else if (compuesto.contentEquals("PbH4")) {
			System.out.println("HIDRURO de Plomo (IV)");
		}else if (compuesto.contentEquals("FeH2")) {
			System.out.println("Es un HIDRURO de Hierro (II)");
		}else if (compuesto.contentEquals("CuH")) {
			System.out.println("Es un HIDRURO de COBRE");
		}else if (compuesto.contentEquals("PbH2")) {
			System.out.println("Es un HIDRUROde Plomo (II)");
		}
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
