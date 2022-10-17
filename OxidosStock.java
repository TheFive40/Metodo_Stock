package MetodoStock; //NOMBRE DEL PAQUETE 

import java.util.Scanner; //IMPORTAMOS LAS LIBRERIAS PERTINENTES 
public class OxidosStock{ //CREAMOS LA CLASE OXIDOS STOCK 
	public void OxidosStock2() { //METODO  QUE CONTENDRA NUESTRO CODIGO
		//CREAMOS DOS ENTRADAS UNA PARA EL COMPUESTOQUE NOS PASARA EL USUARIO PARA ESTABLECER LA NOMENCLATURA
		Scanner Compuesto = new Scanner(System.in);
		//LE PEDIMOS POR UN MENSAJE QUE INGRESE UN COMPUESTO
		System.out.println("Introduce el compuesto");
		String compuesto = Compuesto.nextLine(); //EL COMPUESTO QUE NOS PASO POR TECLADO ES ALMACENADO EN LA VARIABLE COMPUESTO DE TIPO STRING
		//EVALUAMOS CON UN IF (equals.IgnoreCase NOS AYUDA A IGNORAR LAS MAYUSCULAS Y MINUSCULAS POR EJEMPLO SI  ESCRIBO C SERIA LO MISMO SI ESCRIBIERA c EN MINUSCULA
		//SI EL COMPUESTO QUE NOS PASO EL USUARIO POR TECLADO  CONTIENE UN CARBONO 
		if (compuesto.equalsIgnoreCase(compuesto) && compuesto.contains("C")) {
			//SI CONTIENE UN CARBONO ENTONCES EVALUAME SI ESTA ACOMPAÑADO DE 2 OXIGENOS 
		if(compuesto.contains("CO2")) {
			//SI ESTA CONDICION ES VERDADERA ENTONCES IDENTIFICAMOS EL COMPUESTO Y SABEMOS QUE ES UN OXIDO DE CARBONO 
			System.out.println("Es un OXIDO de Carbono (IV) ");
		}
	}else if (compuesto.equalsIgnoreCase(compuesto) && compuesto.contains("Pb")) { //EN CASO QUE LAA CONDICION ANTERIOR HAYA SIDO FALSA EVALUAME ESTA OTRA 
			//CONDICION 
		if(compuesto.contains("PbO2")) {
			System.out.println("Es un OXIDO de Plomo (IV)"); //SI ES VERDADERA ENTONCES IMPRIME UN MENSAJE EN CONSOLA QUE ES UN OXIDO DE PLOMO
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
