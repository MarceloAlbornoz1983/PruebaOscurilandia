package menu;

import java.util.Scanner;

public class ejercicio_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner in = new Scanner(System.in);{
	
	String nombre;
	int ac;
	
	System.out.println ("Escriba nombres con J");
	nombre=in.nextLine();
	
	if(nombre.equalsIgnoreCase("")){
		nombre="JUAN";
		System.out.println("¡GANASTE!");
	}else{
		System.out.println ("Escriba nombres con J");
		nombre=in.nextLine();
		
	ac=0;
	ac=ac+1;
	
	System.out.println("Cantidad de intentos: "+ac);
		
	in.close();}
	
	}
	}
}
