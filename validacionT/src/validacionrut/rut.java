package validacionrut;

public class rut {
	/**
	 * Validaci�n de RUT Chileno
	 * algoritmo Modulo 11
	 */ 
		
		/**
		 *  Valida rut de la forma XXXXXXXX-X 
		 */
		public static Boolean validaRut ( String rut ) {
			Pattern pattern = Pattern.compile("^[0-9]+-[0-9kK]{1}$");
			Matcher matcher = pattern.matcher(rut);
			if ( matcher.matches() == false ) return false;
			String[] stringRut = rut.split("-");
			return stringRut[1].toLowerCase().equals(CommonFn.dv(stringRut[0]));
		}
		
		/**
		 * Valida el d�gito verificador
		 */
		public static String dv ( String rut ) {
			Integer M=0,S=1,T=Integer.parseInt(rut);
			for (;T!=0;T=(int) Math.floor(T/=10))
				S=(S+T%10*(9-M++%6))%11;
			return ( S > 0 ) ? String.valueOf(S-1) : "k";		
		}
		
	}
}