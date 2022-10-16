package MetodoStock;

import java.util.Scanner;
public class OxidosStock{
	public void OxidosStock2() {
		Scanner Compuesto = new Scanner(System.in);
		Scanner Oxidacion = new Scanner(System.in);
		System.out.println("Introduce el compuesto");
		String compuesto = Compuesto.nextLine();
		if (compuesto.equalsIgnoreCase(compuesto) && compuesto.contains("C")) {
		if(compuesto.contains("CO2")) {
			System.out.println("Es un OXIDO de Carbono (IV) ");
		}
	}else if (compuesto.equalsIgnoreCase(compuesto) && compuesto.contains("Pb")) {
		if(compuesto.contains("PbO2")) {
			System.out.println("Es un OXIDO de Plomo (IV)");
		}
	}else if (compuesto.equalsIgnoreCase(compuesto) && compuesto.contains("P")) {
		if (compuesto.contains("P2O3")) {
			System.out.println("Es un OXIDO de Fósforo (III)");
		}else if (compuesto.contains("P2O5")) {
			System.out.println("Es un OXIDO de Fósforo (V)");

		}
	}else if (compuesto.equalsIgnoreCase(compuesto) && compuesto.contains("Cl")) {
		if (compuesto.contains("Cl2O7")) {
			System.out.println("Es un OXIDO de cloro (VII)");
		}
	}else if (compuesto.equalsIgnoreCase(compuesto) && compuesto.contains("I")) {
		if (compuesto.contains("I2O3")) {
			System.out.println("Es un OXIDO de yodo (III)");
		}
	}else if (compuesto.equalsIgnoreCase(compuesto) && compuesto.contains("Fe")) {
		if (compuesto.contains("Fe2O3")) {
			System.out.println("Es un OXIDO de Hierro (III)");
		}else if (compuesto.contains("FeO")) {
			System.out.println("Es un OXIDO de Hierro (II)");
		}
	}else if (compuesto.equalsIgnoreCase(compuesto) && compuesto.contains("S")) {
		if (compuesto.contains("SO3")) {
			System.out.println("Es un OXIDO de azufre (VI)");
		}else if (compuesto.contains("SO2")|| compuesto.contains("S2O4")) {
			System.out.println("Es un OXIDO de azufre (IV)");

		}
	}
	}
	public static void main(String[] args) {
		OxidosStock a = new OxidosStock();
		a.OxidosStock2();
	}
	

}