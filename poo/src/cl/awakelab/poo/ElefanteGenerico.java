package cl.awakelab.poo;

public class ElefanteGenerico extends MediosDeTransportes {
	
	

	//solo será una caracteristica que le definimos a elefante
	public float kilosDePopo;
	
	
	
	public ElefanteGenerico() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ElefanteGenerico(float velocidadMaxima, float kilometrosXLitro, 
			int capacidadPasajeros, float autonomia,float kilosDePopo) {
		
		super(velocidadMaxima, kilometrosXLitro, capacidadPasajeros, autonomia);
			this.kilosDePopo= kilosDePopo;
	}

	public float kilosDePopo() {
		return kilosDePopo; 
	}
	
	public void setKilosDePopo(float kilosDePopo) {
		this.kilosDePopo = kilosDePopo;
	}

		
		
	

}
