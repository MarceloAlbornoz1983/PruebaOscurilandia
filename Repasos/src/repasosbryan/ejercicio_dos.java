package repasosbryan;

public class ejercicio_dos {

	public static void main(String[] args) {

		
		
		
		for (int i=1;i<11;i++){  // declaramos hasta cu�l tabla llegar
			System.out.println("Tabla de multiplicar: " + i);
			for(int j=1;j<11;j++) {
				System.out.println(i+"X"+j+"="+(i*j)); 
				/*pasamos el segundo for que pasar� por la segunda dimensi�n del arreglo o segundo n�mero
				 * Luego nos multiplicar� i por jota que ser�n nuestras dos variables que se multiplicar�
				 * en i*j
				 */
			}
		}
	}

}
