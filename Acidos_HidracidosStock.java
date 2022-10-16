package MetodoStock; //Paquete en el que se encuentra ubicado nuestra clase

import java.util.Scanner; // Importamos la libreria de Java util especificamos que queremos la clase Scanner 

public class Acidos_HidracidosStock { //Metodo Setter que luego sera llamado en la clase Principal es decir la clase que llev el metodo main
public void Acidos_Hidracido() { // Nombre de la Clase 
	Scanner entrada = new Scanner(System.in); //Pedimos que nos ingrese un compuesto para ellos instanciamos la clase Scanner que nos sirve para
	//Crear el objeto de Entrada y posteriormente utilizarlo en una variable llamada Compuesto con el Metodo NextLine le indicamos que nos ingrese 
	//un Texto 
	System.out.println("Ingrese un compuesto por favor");
	String compuesto = entrada.nextLine();
	
//Con  unos condicionales (IF) Evaluamos si el compuesto ingresado por el usuario es un "HCl" En caso de ser esto verdadero imprimira en consola 
	//La nomenclatura del compuesto que será Cloruro de Hidrogeno esto lo hacemos con Systen.out.println en caso de ser falso ira a evaluar la siguiente condicion 
	//y así sucesivamente hasta que sea verdadera 
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
