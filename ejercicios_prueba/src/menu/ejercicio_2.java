package menu;

import java.util.Scanner;

public class ejercicio_2{

	public static void main(String[] args) {
		
		 Scanner ingresoTeclado = new Scanner(System.in);
		 String nombre;
		 boolean m = true;
		 boolean h = false;
		
		System.out.println("Escriba su nombre: ");
		nombre = ingresoTeclado.nextLine();
        	if(nombre.endsWith("a")) {
        		System.out.print("BANO MUJERES");
        	}
        	if(nombre.endsWith("o")) {
        		System.out.print("BANO HOMBRES");
        	
        	}
        	System.out.println("");
        		
         System.out.println("Ingrese M para mujer o H para hombre");
         String sexo = ingresoTeclado.nextLine();
         	sexo.toLowerCase();
         	if(m) {
         		System.out.print("BANO MUJERES");
            if(h) {
            	System.out.print("BANO HOMBRES");
            				}
            				
         				}
            		}
            			
        	}		
            		
		
	
	
 		   
	
		
	

	
