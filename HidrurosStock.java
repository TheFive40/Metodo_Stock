package MetodoStock; //PAQUETE 

import java.util.Scanner; //SE IMPORTAN LAS LIBRERIAAS

public class HidrurosStock { //CLASE 
public void Hidruros() { //METODO SETTER
	Scanner entrada = new Scanner(System.in); //HACEMOS UN INGRESO DE DATOS POR TECLADO INSTANCIANDO LA CLASE SCANNER
	System.out.println("Ingrese un compuesto por favor"); //POR MENSAJE INDICAMOS QUE NOS INGRESE UN COMPUESTO
	String compuesto = entrada.nextLine(); //GUARDAMOS LO QUE EL USUARIO NOS PASO POR TECLADO EN LA VARIABLE COMPUESTO
	//EVALUAMOS CON UN IF SI EL COMPUESTO INGRESADO LLEVA HIDROGENO 
	if(compuesto.contentEquals("H")) {
		//LA CONDICION ES VERDADERA PASARA A LEER LAS LINEAS DE CODIGO QUE ESTAN DENTRO 
		//¿LA VARIABLE COMPUESTO TIENE CuH2?
		if(compuesto.contentEquals("CuH2")) {
			//SI ENTONCES EJECUTA ESTA LINEA DE CODIGO
			System.out.println("es un HIDRURO de Cobre (II)"); //IMPRIME EN COSNOLA EL SIGUIENTE MENSAJE 
		}else if (compuesto.contentEquals("CaH2")) { //CON ELSE INDICAMOS SI LA CONDICION NO SE CUMPLE ENTONCES EVALUA ESTA OTRA CONDICION
			//SE CUMPLE LA CONDICION
			System.out.println("Es un HIDRURO de Calcio"); //IMPRIME EN CONSOLA EL SIGUIENTE MENSAJE
		}else if (compuesto.contentEquals("PbH4")) { //SI NO SE CUMPLE EVALUA ESTA 
			System.out.println("HIDRURO de Plomo (IV)"); //SI LA CONDICION SE CUMPLIO IMPRIME ESTE MENSAJE EN CONSOLA CON LA SIGUIENTE INSTRUCCION
		}else if (compuesto.contentEquals("FeH2")) { //SI NO SE CUMPLE EVALUA ESTA 
			System.out.println("Es un HIDRURO de Hierro (II)"); //IMPRIME EL MENSAJE EN CONSOLA 
		}else if (compuesto.contentEquals("CuH")) { //SI NO SE CUMPLE EVALUA ESTA OTRA
			System.out.println("Es un HIDRURO de COBRE"); //IMPRIME ESTE MENSAJE SI LA CONDICION SE CUMPLIO 
		}else if (compuesto.contentEquals("PbH2")) { //SI NO SE CUMPLE EVALUA ESTA OTRA CONDICION
			System.out.println("Es un HIDRUROde Plomo (II)"); //SI SE CUMPLIO ENTONCES IMPRIME ESTE MENSAJE
		}
		//EN CASO QUE SE INGRESE OTRO ELEMENTO DIFERENTE A LOS QUE APARECEN AQUI EL PROGRAMA DEVOLVERA UN ERROR
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
