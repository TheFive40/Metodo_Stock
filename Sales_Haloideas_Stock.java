package MetodoStock; //PAQUETE

import java.util.Scanner; //IMPORTAMOS LAS LIBRERIAS DE JAVA UTIL DE LA CLASE SCANNER 

public class Sales_Haloideas_Stock { //CLASE 
	public void Haloideas () { //METODO
	Scanner Entrada = new Scanner(System.in); //INDICAMOS QUE QUEREMOS QUE EL USUARIO  NOS INGRESE UN DATO DESDE EL TECLADO DE LA CONSOLA
	System.out.println("Ingrese un compuesto"); //LE DECIMOS QUE NOS INGRESE UN COMPUESTO ATRAVEZ DE UN MENSAJE QUE APARECERA EN LA CONSOLA
	String compuesto = Entrada.nextLine(); //GUARDAMOS LO QUE NOS INGRESO EL USUARIO EN LA VARIABLE COMPUESTO
		//EVALUAMOS CON UN CONDICIONAL SI EL COMPUESTO INGRESADO POR EL USUARIO ES UN "FeCl2"
	if(compuesto.contains("FeCl2")) {
		//SI ES VERDADERA EJECUTA ESTA LINEA DE CODIGO
		System.out.println("Cloruro de Hierro (II)"); //MUESTRA UN MENSAJE POR CONSOLA QUE LE INDIQUE LA NOMENCLATURA 
		//ES UN CLORURO DE HIERRO CON SU ESTADO DE OXIDACION (III)
		
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
