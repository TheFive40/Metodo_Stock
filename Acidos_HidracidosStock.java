package MetodoStock;

import java.util.Scanner;

public class Acidos_HidracidosStock {
public void Acidos_Hidracido() {
	Scanner entrada = new Scanner(System.in);
	System.out.println("Ingrese un compuesto por favor");
	String compuesto = entrada.nextLine();
	if(compuesto.contentEquals("HCl")) {
		System.out.println("Es un Cloruro de Hidr�geno");
	}else if (compuesto.contentEquals("H2S")) {
		System.out.println("Es un Sulfuro de Hidr�geno");
	}else if (compuesto.contentEquals("HF")) {
		System.out.println("Es un Fluoruro de Hidr�geno");
	}else if (compuesto.contentEquals("HI")) {
		System.out.println("Es un Yodo de Hidr�geno");
	}else if (compuesto.contentEquals("HBr")) {
		System.out.println("Es un Bromo de Hidr�geno");
	}else if (compuesto.contentEquals("H2Se")) {
		System.out.println("Es un Selenium de Hidr�geno");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
