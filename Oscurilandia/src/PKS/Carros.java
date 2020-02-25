package PKS;

import java.awt.*;

public class Carros {
	
	
	public int kromi[]= new int [3];
	public int caguano[]= new int [2];
	public int trupalla[]=new int [1];
	
	
	public Carros(int[] kromi, int[] caguano, int[] trupalla) {
		super();
		this.kromi = kromi;
		this.caguano = caguano;
		this.trupalla = trupalla;
	}


	public int[] getKromi() {
		return kromi;
	}


	public void setKromi(int[] kromi) {
		this.kromi = kromi;
	}


	public int[] getCaguano() {
		return caguano;
	}


	public void setCaguano(int[] caguano) {
		this.caguano = caguano;
	}


	public int[] getTrupalla() {
		return trupalla;
	}


	public void setTrupalla(int[] trupalla) {
		this.trupalla = trupalla;
	}	
	
	
	

}
