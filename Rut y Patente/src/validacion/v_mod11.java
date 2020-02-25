package validacion;

public class v_mod11 {

	public static String SaberV(String let_fin) {
		
		/*
		 * se definen las variables
		 */

		String RutMio = let_fin;
		String miorut = "";
		String let = "";

		int LarCadena = 0;
		int i = 0;
		int c_mod11 = 2;
		int acum = 0;
		int dig;
		int res = 0;

		boolean respuesta_rut = false;
		
		/*
		 * Cambiar variable para uso general del modulo 11, se aceptan todos los string
		 * debe tener el numero compuesto, ya sea en caso de las ppu y en todos los casos sin
		 * el digito verificador
		 */
		
		LarCadena = RutMio.length();
		
		/*
		 * ciclo for lo utilizamos para iterar el substring Rutmio, partimos con el largo 
		 * de la cadena hasta que i sea mayor que -1 con paso negativo. Lo que significa que
		 * el paso ser� desde el fin hasta el comienzo del n�mero
		 */

	

		for (i = LarCadena - 1; i > -1; i--) {
			let = RutMio.substring(i, i + 1);
			
		/*
		 * Se utiliza la condici�n 'if' para arrancar el m�dulo 11 donde la variable
		 * si es menor a 8 d�gitos (largo de rut) realizar� un 'try y catch para corregir
		 * errores y dejarlos fuera de la lectura.
		 */

			if (c_mod11 < 8) {
				try {
		/* integer.parseint nos convertir� la string 'let' (el rut ingresado) en n�mero entero
		 * 
		 */
					dig = Integer.parseInt(let);
				} catch (NumberFormatException err) {
					dig = 1;
				}
				res = dig * c_mod11;
				acum = acum + res;
				c_mod11++;

			} else {
				c_mod11 = 2;
				
				try {
					dig = Integer.parseInt(let);
				} catch (NumberFormatException err) {
					dig = 1;
				}
				/* 'res' ser� igual al d�gito ingresado multiplicado por el m�dulo 11 
				 *  acum ser� igual a acum + resultado de operaci�n de res
				 */
				res = dig * c_mod11;
				acum = acum + res;
				// c_mod aumentar� su valor en 1
				c_mod11++;
			}

		}
		//Se definen las variables
		
		int res_m = acum;
		acum = acum / 11;
		acum = acum * 11;
		int tot_m11 = res_m - acum;
		int dig_ver = 11 - tot_m11;
		
		
		String rut_sv = RutMio.substring(0, LarCadena);
		
		/*
		 * Si el digito verificador (en este caso dig_ver) sea igual a diez, 
		 * la cadena dig_ver1 ser� igual a K
		 */
		if (dig_ver == 10) {
			String dig_verl = "k";
			
			/*
			 *mio rut ser� igual a la cadena definida anteriormente rut_sv, se agrega el gui�n
			 *y el digito verificador dig_ver1 
			 */
			
			miorut = rut_sv + "-" + dig_verl;
			
			/*por otra parte, si el resultado de digito verificador sea 11 o 6, 
			 * este mostrar� 0 
			 * 
			 */
		} else if (dig_ver == 11 || dig_ver == 6) {
			dig_ver = 0;
			miorut = rut_sv + "-" + dig_ver;

		} else {
			miorut = rut_sv + "-" + dig_ver;
		}

		/*
		 * En esta instancia utilizamos un booleano, donde RutMio es igual a miorut,
		 * la respuesta 
		 */

		if (RutMio.equals(miorut)) {
			respuesta_rut = true;
		} else {
			respuesta_rut = false;
		}
		
		return ("-"+dig_ver);
	}

}
