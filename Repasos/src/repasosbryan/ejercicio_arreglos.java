package repasosbryan;

import java.util.Scanner;

public class ejercicio_arreglos {

	public static void main(String[] args) {
		
		Scanner teclado= new Scanner (System.in);
		
		System.out.println("Ingrese tamaño del arreglo: ");
		int largo=teclado.nextInt();
		
		int[] aOrdenar = new int[largo];
		
		for (int i = 0; i< aOrdenar.length; i++) {
			System.out.println("ingresa un número: ");
			aOrdenar[i]= teclado.nextInt();
		}
			
		//metodo burbuja
			
			int aux=0;
			for (int i = 0; i< aOrdenar.length; i++) {
					for (int j = 0; j < aOrdenar.length; j++) {
					if (aOrdenar[i]>aOrdenar[j]) {
						aux=aOrdenar[i];
						aOrdenar[i]=aOrdenar[j];
						aOrdenar[j]=aux;
						}					
					}
				}
			System.out.println("");
			for (int i = 0; i < aOrdenar.length; i++) {
				System.out.print("Sus números de menor a mayor son: "+""+"["+aOrdenar[i]+"]");
				
			}
			
		}
		
		

			
			
			
		}
		
	

		
		
		
	

