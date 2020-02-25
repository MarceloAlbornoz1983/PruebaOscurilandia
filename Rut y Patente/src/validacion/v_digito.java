package validacion;

public class v_digito {

	public static boolean DigVer(String num) {

		String minumero = num;

		int larg = 0;

		boolean respuesta_dig = false;

		larg = minumero.length();
		
		/*
		 * implementar un switch case en vez de if para 3 opciones
		 * segun el largo de las ppu y rut
		 */
		if (larg == 9) {
			if (minumero.substring(larg - 2, larg - 1).equals("-")) {

				respuesta_dig = true;
			} else {
				respuesta_dig = false;
			}
		}

		if (larg == 10) {
			if (minumero.substring(larg - 2, larg - 1).equals("-")) {

				respuesta_dig = true;
			} else {
				respuesta_dig = false;
			}
		}
		
		if (larg == 8) {
			if (minumero.substring(larg - 2, larg - 1).equals("-")) {

				respuesta_dig = true;
			} else {
				respuesta_dig = false;
			}
		}

				
		return respuesta_dig;
	}
}

