package rut_ppu;

import java.util.*;
import javax.swing.*;
import validacion.*;

public class IngresoUsuario {
	
/* 
 * se definen las variables string	
 */

	public static void main(String[] args) {
		String mippu = "";
		String mirut = "";
		String mippu_user = "";
		String mirut_user = "";
		String let = "";
		String digppunva = "";
		String digrut = "";

		int dig = 0;

		/*
		 * Este do-while evalua si los datos ingresados tienen digito verificador en
		 * caso de no tener solicita nuevamnete los datos de la patente
		 */
		do {
			mippu = JOptionPane.showInputDialog("Patente con digito verificador:");
			if (v_digito.DigVer(mippu) == false) {
				JOptionPane.showMessageDialog(null,
						"Patente ingresada no tiene digito verificador, intente nuevamente");
			}
		} while (v_digito.DigVer(mippu) == false);

		/*
		 * Aqui se evalua si la la patente es nueva,tomando el tercer digito, si da
		 * error al parseo es ppu nueva, si no da error es patente antigua, para sacar
		 * el digito
		 */
		let = mippu.substring(2, 3);

		mippu_user = mippu;
		mippu = mippu.substring(0, mippu.length() - 2);

		try {
			dig = Integer.parseInt(let);
		} catch (NumberFormatException err) {
			digppunva = v_ppu_nueva.CamLetNum(mippu);
		}
		
		/*
		 * Aca solo para mostrar el valor se agrega lo ingresado por el usuario monos el verificador
		 * y se le carga el verificador generado del programa
		 */
		digppunva = mippu + digppunva;
		digppunva = digppunva.toUpperCase();

		JOptionPane.showMessageDialog(null, "La patente ingresada es: " + digppunva);
		/*
		 * Este do-while evalua si los datos ingresados tienen digito verificador en
		 * caso de no tener solicita nuevamente los datos del rut
		 */
		do {
			mirut = JOptionPane.showInputDialog("Rut con digito verificador:");
			if (v_digito.DigVer(mirut) == false) {
				JOptionPane.showMessageDialog(null, "Rut ingresado no tiene digito verificador, intente nuevamente");
			}
		} while (v_digito.DigVer(mirut) == false);
		
		/*
		 * 
		 */

		mirut_user = mirut;
		mirut = mirut.substring(0, mirut.length() - 2);
		digrut = v_mod11.SaberV(mirut);
		digrut = mirut + digrut;
		digrut = digrut.toUpperCase();
		
		JOptionPane.showMessageDialog(null, "La patente ingresada es: " + digrut);

	}
}
