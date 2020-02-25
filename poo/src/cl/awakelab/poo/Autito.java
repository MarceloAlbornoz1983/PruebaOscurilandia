package cl.awakelab.poo;

public class Autito extends MediosDeTransportes implements IVehiculo {

	@Override
	public int contarPasajeros() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean buenEstadoDeFrenos() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void desechar() {
		System.out.println("Estacionar en carretera y prenderle fuego.");

	}

}
