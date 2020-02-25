package menu;

import java.util.Scanner;

public class ejercicio_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		int prom;
		int num1;
		int num2; 
		int num3;
		
		System.out.println("Escriba un numero");
		num1=in.nextInt();
		
		System.out.println("Escriba un numero");
		num2=in.nextInt();
		
		System.out.println("Escriba un numero");
		num3=in.nextInt();
		
		
		
		
		prom=(num1+num2+num3)/3;
		System.out.println("El promedio de sus tres n�meros es: "+prom);
				
	}

}

