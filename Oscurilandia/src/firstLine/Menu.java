package firstLine;

import java.util.Scanner;

public class Menu {
	

		public static void main(String[] args) {
			
			Scanner teclado= new Scanner(System.in);
			
			int opcion;
			do{
				System.out.println("Menú principal");
				System.out.println("1.Nueva");
				System.out.println("2.Continuar");
				System.out.println("0.Salir");
				System.out.print("Opcion (0-2):");
				
				opcion=teclado.nextInt();
				
				
				switch(opcion){
				case 0:
				break;
				case 1:
				System.out.println("partidaNueva");
				break;
				case 2:
				System.out.println("continuar");
				break;
				default:
					System.out.println("Salir");

				}
				}
				while(opcion!=0);


				
		}

		private static void Continue() {
			// TODO Auto-generated method stub
			
		}

	}


