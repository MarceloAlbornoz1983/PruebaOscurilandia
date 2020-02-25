package repasosbryan;

public class ejercicioMatriz {

	public static void main(String[] args) {

		int[] [] matriz = new int [4][4]; //ejemplo matriz cuadrado
		
		for (int i = 0; i < matriz.length; i++) {  // dimension uno
			for (int j = 0; j < matriz.length; j++) { //dimension dos
				matriz [i][j] = i+j;
				
			}
		}
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.println("["+matriz[i][j]+"]");
			}
			System.out.println("");
		}
	}

}
