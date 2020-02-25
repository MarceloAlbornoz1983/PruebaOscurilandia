package cl.awakelab.poo;

public class Monopatin implements IVehiculo {

	@Override
	public int contarPasajeros() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public boolean buenEstadoDeFrenos() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void desechar() {
		System.out.println("A la basura no más!");
		
	}

}
