package PKS;

public class Kromi extends Carros {
	
	int aFabricacion;
	String marca;
	public int getaFabricacion() {
		return aFabricacion;
	}
	public void setaFabricacion(int aFabricacion) {
		this.aFabricacion = aFabricacion;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	@Override
	public String toString() {
		return "Kromi [aFabricacion=" + aFabricacion + ", marca=" + marca + "]";
	}
	
	


}
