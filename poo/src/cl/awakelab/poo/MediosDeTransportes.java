package cl.awakelab.poo;

public class MediosDeTransportes {  
	//Esta es la clase Object a la que le pusimos nombre MediosDeTransporte
	
	
	// atributos
	private float velocidadMaxima;
	private float kilometrosXLitro;
	private int capacidadPasajeros;
	private float autonomia;
	
	
	public MediosDeTransportes(){ 
		// No olvidar que al escribir public, private, etc genera un metodo, por lo tanto lleva llave
	}
	public MediosDeTransportes(float velocidadMaxima, float kilometrosXLitro, int capacidadPasajeros, float autonomia) {
		super(); //se refiere al constructor del Object
		this.velocidadMaxima = velocidadMaxima;
		this.kilometrosXLitro = kilometrosXLitro;
		this.capacidadPasajeros = capacidadPasajeros;
		this.autonomia = autonomia;
	}
	//constructor vacío
	/*public MediosDeTransportes() {
		this.velocidadMaxima=0;
		this.capacidadPasajeros=0;
		this.kilometrosXLitro=0;
		this.autonomia=0;
	}
	
	
	//constructor
	public MediosDeTransportes(float velocidadMaxima, float kilometrosXLitro,
					int capacidadPasajeros,float autonomía) {
	
		this.velocidadMaxima=velocidadMaxima;
		this.autonomia=autonomia;
		this.capacidadPasajeros=capacidadPasajeros;
		this.kilometrosXLitro=kilometrosXLitro; */
	
		
	
	//metodos
	public void avanzar() {
		System.out.println("Estoy avanzando..");
	}
	public void frenar() { 
		System.out.println ("Estoy deteniendome");
	}
	public void chocar() {
		System.out.println("Tení seguro?");
	}
	
	
	public float getVelocidadMaxima() {//obtiene el atributo
		return velocidadMaxima;//retorna lo que hay en el atributo
	}
	public void setVelocidadMaxima(float velocidadMaxima) { //setea el atributo
		this.velocidadMaxima = velocidadMaxima;
		//hago referencia al atributo que está más arriba
	}
	public float getKilometrosXLitro() {
		return kilometrosXLitro;
	}
	public void setKilometrosXLitro(float kilometrosXLitro) {
		this.kilometrosXLitro = kilometrosXLitro;
	}
	public int getCapacidadPasajeros() {
		return capacidadPasajeros;
	}
	public void setCapacidadPasajeros(int capacidadPasajeros) {
		this.capacidadPasajeros = capacidadPasajeros;
	}
	public float getAutonomia() {
		return autonomia;
	}
	public void setAutonomia(float autonomia) {
		this.autonomia = autonomia;
	}
	
		
	public void pichicateoMotor(float aumentoVelocidad) {
	
	setVelocidadMaxima(aumentoVelocidad);	
	}	
	

}
