package MetodoStock; //Nombre del paquete donde esta ubicada nuestra clase

import java.util.Scanner; //Importamos la clase Scanner de las librerias de Java util

public class Acidos_OxacidosStock { // Nombre de la Clase 
	public void Acidos_Oxacidoss() { //Metodo Setter 
	Scanner entrada = new Scanner(System.in); //Creamos el Objeto de Entrada (INPUT)
	System.out.println("Ingrese un compuesto por favor"); //Mostramos un mensaje por consola pidiendole al usuarios que nos ingrese un compuesto 
	String compuesto = entrada.nextLine(); //Guardamos el compuesto ingresado por el usuario en la variable Compuesto
		//Evaluamos con condicionales  lo que esta guardado en la variable compuesto es "H2SO4" En caso de ser verdadera esta condicion entonces estamos 
		//Hablando de un SULFATO (VI) DE HIDROGENO  NOS IMPRIME EL RESULTADO CON SU NUMERO DE OXIDACION EN NUMEROS ROMANOS
		//EN CASO QUE ESTA CONDICION HAYA SIDO FALSA PASARIA A EVALUAR LA SIGUIENTE CONDICION Y EN CASO QUE ESA TAMBIEN FUERA FALSA IRIA CON LAS DEMAS 
		//ASI SUCESIVAMENTE 
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
