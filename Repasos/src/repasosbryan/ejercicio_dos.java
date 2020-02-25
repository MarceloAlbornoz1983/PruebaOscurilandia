package repasosbryan;

public class ejercicio_dos {

	public static void main(String[] args) {

		
		
		
		for (int i=1;i<11;i++){  // declaramos hasta cuál tabla llegar
			System.out.println("Tabla de multiplicar: " + i);
			for(int j=1;j<11;j++) {
				System.out.println(i+"X"+j+"="+(i*j)); 
				/*pasamos el segundo for que pasará por la segunda dimensión del arreglo o segundo número
				 * Luego nos multiplicará i por jota que serán nuestras dos variables que se multiplicará
				 * en i*j
				 */
			}
		}
	}

}
