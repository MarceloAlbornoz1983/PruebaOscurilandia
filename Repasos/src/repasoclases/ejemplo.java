package repasoclases;

import java.util.ArrayList;

public class ejemplo {
	public static void main (String arg[]){
		
	}
		ArrayList listaNums= new ArrayList () {
		
		listaNums.add(8);
		listaNums.add(3);
		listaNums.add(5); 
		 // le estoy asignando valores a mi lista de números. Son métodos a los que se les asigna un valor
		System.out.println(“Lista de numeros;”+listaNums);
		 // mostrará todos los números
		System.out.println(“Numero posicion2:” + listaNums(2));  //mostrará el 5
		listaNums.set(0,15);
		System.out.println(“Lista de numeros:” + listaNums); // mostrará una nueva lista de números 

		}
}
