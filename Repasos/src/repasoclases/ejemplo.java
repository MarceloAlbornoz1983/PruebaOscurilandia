package repasoclases;

import java.util.ArrayList;

public class ejemplo {
	public static void main (String arg[]){
		
	}
		ArrayList listaNums= new ArrayList () {
		
		listaNums.add(8);
		listaNums.add(3);
		listaNums.add(5); 
		 // le estoy asignando valores a mi lista de n�meros. Son m�todos a los que se les asigna un valor
		System.out.println(�Lista de numeros;�+listaNums);
		 // mostrar� todos los n�meros
		System.out.println(�Numero posicion2:� + listaNums(2));  //mostrar� el 5
		listaNums.set(0,15);
		System.out.println(�Lista de numeros:� + listaNums); // mostrar� una nueva lista de n�meros 

		}
}
