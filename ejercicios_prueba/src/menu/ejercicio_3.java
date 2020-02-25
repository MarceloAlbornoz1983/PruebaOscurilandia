package menu;
import java.util.Scanner;

import menu.*;


public class ejercicio_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner in = new Scanner(System.in);
			
			System.out.println("Escriba su nombre: ");
	        String nom = in.nextLine();
	        
	        System.out.println("¿Es usted hombre o mujer?. Escriba H o M");
	        String sex= in.nextLine();
	      
	               
			  
					
			if(sex.equalsIgnoreCase("")){
				sex="M";
				System.out.println("baño de hombres");
	 	   }
			else{
	 		   System.out.println("baño de mujeres");
	 	   }{
	 		  
			System.out.println("Usará baño o ducha?");
			String opbd = in.nextLine();
			
			
			if(opbd.equalsIgnoreCase("")){
				opbd="bano";
				System.out.println("debe pagar $250");
	 	   }
			else{
	 		   System.out.println("debe pagar $2.500");
		}
	 	   }
		}
		
		

	}


