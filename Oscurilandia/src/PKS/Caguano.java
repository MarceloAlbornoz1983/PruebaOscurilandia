package PKS;

public class Caguano extends Carros {
	
	int numeroOcupantes;
	int fecha;
	
	
	// metodos setter a getters 
	public int getNumeroOcupantes() {
		return numeroOcupantes;
	}
	public void setNumeroOcupantes(int numeroOcupantes) {
		this.numeroOcupantes = numeroOcupantes;
	}
	public int getFecha() {
		return fecha;
	}
	public void setFecha(int fecha) {
		this.fecha = fecha;
	}
	@Override
	public String toString() {
		return "Caguano [numeroOcupantes=" + numeroOcupantes + ", fecha=" + fecha + "]";
	}

	
	
	

}
