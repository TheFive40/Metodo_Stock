package MetodoStock;

import java.util.Scanner;

public class Sales_Haloideas_Stock {
	public void Haloideas () {
	Scanner Entrada = new Scanner(System.in);
	System.out.println("Ingrese un compuesto");
	String compuesto = Entrada.nextLine();
	if(compuesto.contains("FeCl2")) {
		System.out.println("Cloruro de Hierro (II)");
		
	}else if (compuesto.contains("PbCl4")) {
		System.out.println("Cloruro de Plomo (IV)");
	}else if (compuesto.contains("PbS")) {
		System.out.println("Sulfuro de Plomo (II)");
	}else if (compuesto.contains("Fe2S3")) {
		System.out.println("Sulfuro de Hierro (III)");
	}else if (compuesto.contains("CuF2")) {
		System.out.println("Flouro de Cobre (II)");
	}else {
		System.out.println("Elemento no registrado");
	}
	}
	public static void main(String[] args) {
		Sales_Haloideas_Stock a = new Sales_Haloideas_Stock();
		a.Haloideas();
	}

}
