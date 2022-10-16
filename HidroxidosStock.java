package MetodoStock;

import java.util.Scanner;

public class HidroxidosStock {
public void Hidroxidos() {
	Scanner entrada = new Scanner(System.in);
	System.out.println("Ingrese un compuesto por favor");
	String compuesto = entrada.nextLine();
	if(compuesto.contains("OH")) {
		if(compuesto.contains("CuOH")){
			System.out.println("Es un  HIDROXIDO de COBRE (I)");
		}else if (compuesto.contentEquals("Cu(OH)2")) {
			System.out.println("Es un HIDROXIDO de COBRE (II)");
		}
		 else if (compuesto.contentEquals("Ca(OH)4")) {
				System.out.println("Es un HIDROXIDO de Plomo (IV)");
		}
		 else if (compuesto.contentEquals("Fe(OH)3")) {
			System.out.println("Es un HIDROXIDO de Hierro (III) ");
		}else if (compuesto.contentEquals("Mg(OH)2")) {
			System.out.println("Es un HIDROXIDO de Manganesio (II)");
		}else if (compuesto.contentEquals("Al(OH)3")) {
			System.out.println("Es un HIDROXIDO de Aluminio (III)");
		}
	}
}
	public static void main(String[] args) {
		HidroxidosStock a = new HidroxidosStock();
		a.Hidroxidos();
	}

}
