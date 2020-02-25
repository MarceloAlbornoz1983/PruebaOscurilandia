package repasosbryan;

public class ejercicioMatrizNoCuadrada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
{

			int[] [] matriz = new int [9][4]; //ejemplo matriz cuadrado
			
			for (int i = 0; i < matriz.length; i++) {  // dimension uno
				for (int j = 0; j < matriz[i]; j++) { //dimension dos
					matriz [i][j] = i+j;
					
				}
			}
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz[i]; j++) {
					System.out.print("["+matriz[i][j]+"]");
				}
				System.out.println("");
			}
		}

	}
	}

}
