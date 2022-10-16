package MetodoStock;

import java.util.Scanner;

public class Acidos_HidracidosStock {
public void Acidos_Hidracido() {
	Scanner entrada = new Scanner(System.in);
	System.out.println("Ingrese un compuesto por favor");
	String compuesto = entrada.nextLine();
	if(compuesto.contentEquals("HCl")) {
		System.out.println("Es un Cloruro de Hidrógeno");
	}else if (compuesto.contentEquals("H2S")) {
		System.out.println("Es un Sulfuro de Hidrógeno");
	}else if (compuesto.contentEquals("HF")) {
		System.out.println("Es un Fluoruro de Hidrógeno");
	}else if (compuesto.contentEquals("HI")) {
		System.out.println("Es un Yodo de Hidrógeno");
	}else if (compuesto.contentEquals("HBr")) {
		System.out.println("Es un Bromo de Hidrógeno");
	}else if (compuesto.contentEquals("H2Se")) {
		System.out.println("Es un Selenium de Hidrógeno");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
