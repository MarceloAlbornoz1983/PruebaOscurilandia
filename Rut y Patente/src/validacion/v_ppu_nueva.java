package validacion;

public class v_ppu_nueva {

	public static String CamLetNum(String ppu) {
		// TODO Auto-generated method stub

		String mippu = ppu;
		String let = "";
		String dig = "";
		String let_fin = "";

		int larppu = 0;
		int i = 0;

		/*
		 * Este módulo sólo realiza el cambio de letra a numero segun lo dispuesto en la
		 * legislacion chilena solo para ppu nuevas.
		 */
		mippu = mippu.toLowerCase();
		larppu = mippu.length() - 2;
		
		/*Se utiliza el bucle for para buscar el dígito verificador de la patente
		 * que se ingrese recorriendo cada letra y comparando con cada 'switch' 
		 * si corresponde o no al dígito verificador detendiendo este en su respectivo break.
		 * 
		 */
		for (i = 0; i < larppu; i++) {
			let = mippu.substring(i, i + 1);

			switch (let) {
			case "b":
				dig = "1";
				let_fin = let_fin + dig;
				break;
			case "c":
				dig = "2";
				let_fin = let_fin + dig;
				break;
			case "d":
				dig = "3";
				let_fin = let_fin + dig;
				break;
			case "f":
				dig = "4";
				let_fin = let_fin + dig;
				break;
			case "g":
				dig = "5";
				let_fin = let_fin + dig;
				break;
			case "h":
				dig = "6";
				let_fin = let_fin + dig;
				;
				break;
			case "j":
				dig = "7";
				let_fin = let_fin + dig;
				break;
			case "k":
				dig = "8";
				let_fin = let_fin + dig;
				break;
			case "l":
				dig = "9";
				let_fin = let_fin + dig;
				break;
			case "p":
				dig = "0";
				let_fin = let_fin + dig;
				break;
			case "r":
				dig = "2";
				let_fin = let_fin + dig;
				break;
			case "s":
				dig = "3";
				let_fin = let_fin + dig;
				break;
			case "t":
				dig = "4";
				let_fin = let_fin + dig;
				break;
			case "v":
				dig = "5";
				let_fin = let_fin + dig;
				break;
			case "w":
				dig = "6";
				let_fin = let_fin + dig;
				break;
			case "x":
				dig = "7";
				let_fin = let_fin + dig;
				break;
			case "y":
				dig = "8";
				let_fin = let_fin + dig;
				break;
			case "z":
				dig = "9";
				let_fin = let_fin + dig;
				break;
			}

		}
		
		let_fin = let_fin + (mippu.substring(mippu.length() - 2, mippu.length()));
		
		String respuesta=v_mod11.SaberV(let_fin);
		
		return respuesta;

	}
	
}
