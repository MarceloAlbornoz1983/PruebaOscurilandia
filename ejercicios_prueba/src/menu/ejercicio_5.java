package menu;

import java.util.Scanner;

public class ejercicio_5 {
	
	public static void main(String[] args) {
		
	Scanner in = new Scanner(System.in);
	
	int cont,number=1;
	int acum,prom;
	
	
	
	while (number!=0) {
	System.out.println("Escriba un n�mero");
	number=in.nextInt();
	}
	cont=1;
		cont=cont+1;
	
	acum=1;
		acum=(acum+number);	
	
	prom=acum/cont;
		
	System.out.println("Usted ingres� "+cont+" n�meros");
	System.out.println("El promedio de sus n�meros es: "+prom);
	
		
		
	in.close();}

	}

