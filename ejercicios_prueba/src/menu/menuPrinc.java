package menu;

import java.util.Scanner;
import menu.*;

public class menuPrinc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner in = new Scanner(System.in);
		 

		System.out.println("Escriba su opción del 1 al 10");
		int opcion= in.nextInt();
		
		switch (opcion) {
		
		case 1:
			ejercicio_1 op1 = new ejercicio_1();
			op1.main(args);
			break;
		case 2:
			ejercicio_2 op2 = new ejercicio_2();
			op2.main(args);
			break;
		case 3:
			ejercicio_3 op3 = new ejercicio_3();
			op3.main(args);
			break;
		case 4:
			ejercicio_4 op4 = new ejercicio_4();
			op4.main(args);
			break;
		case 5:
			ejercicio_5 op5 = new ejercicio_5();
			op5.main(args);
			break;
		case 6:
			ejercicio_6 op6 = new ejercicio_6();
			op6.main(args);
			break;
		case 7:
			ejercicio_7 op7 = new ejercicio_7();
			op7.main(args);
			break;
		case 8:
			ejercicio_8 op8 = new ejercicio_8();
			op8.main(args);
			break;
		case 9:
			ejercicio_9 op9 = new ejercicio_9();
			op9.main(args);
			break;
		case 10:
			System.out.println("Salir");
			
			break;
		}
		

	}

}
