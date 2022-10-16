package MetodoStock; //Nombre de nuestro paquete

import java.util.Scanner; //Importamos las librerias pertinentes 

public class HidroxidosStock { //Nombre de la clase 
public void Hidroxidos() { //Metodo Setter 
	Scanner entrada = new Scanner(System.in); //HACEMOS UNA ENTRADA DE DATOS INSTANCIANDO LA CLASE SCANNER 
	System.out.println("Ingrese un compuesto por favor"); //POR MENSAJE LE INDICAMOS AL USUARIO QUE NOS INGRESE UN COMPUESTO
	String compuesto = entrada.nextLine(); //EL USUARIO INGRESA EL COMPUESTO Y LO GUARDA EN LA VARIABLE COMPUESTO
	//CON UN IF PROCEDEMOS A EVALUAR SI LO QUE GUARDA LA VARIABLE COMPUESTO ES UN "OH" RECORDEMOS QUE PARA LOS HIDROXIDOS  DEBEN ESTAR ACOMPAÑADOS DEL OH
	//POR LO TANTO SE DEBE EVALUAR ESTA CONDICION SI LA CONDICION ES VERDADERA VOLVERA A EVALUAR UNA CONDICION DENTRO DE OTRA CONDICION ESTO LO LLAMAMOS IF ANIDADOS
	//ES DECIR QUE PARA QUE SE LEAN LOS OTROS CONDICIONALES ANTES DEBE EVALUAR SI EL COMPUESTO INGRESADO ES UN HIDROXIDO
	if(compuesto.contains("OH")) {
		//UNA VEZ EVALUADO Y DE SER VERDADERA LA CONDICION PASARA A EVALUAR SI EL COMPUESTO TIENE "CuOH" EN CASO DE SER VERDADERA ESTA CONDICION 
		//ENTONCES ESTAREMOS HABLANDO DE UN HIDROXIDO DE COBRE 
		//ASI LO HARA CON EL RESTO DE CONDICIONES EN CASO DE QUE ESTA NO SEA VERDADERA PASARA A EVALUAR LAS DEMAS 
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
