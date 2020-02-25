package cl.awake.sudoku;

import java.util.Scanner;

public class Ejecucion {
		public static void main(String[] args) {
			
			
			
			Scanner teclado= new Scanner(System.in);
					
			int sudoku[][]= new int[9][9];
			int numero;
			
			for(int i=0;i<=9;i++) {
				for(int j=0;j<=9;j++) {
					System.out.println("Sudoku a resolver"+sudoku);
					System.out.println("["+teclado.nextInt()+"]");
					
				}
				
				
			}
				
			

		}

	}



