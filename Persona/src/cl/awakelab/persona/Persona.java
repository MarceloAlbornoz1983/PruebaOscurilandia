package cl.awakelab.persona;

public class Persona {

	private int RUT;
	private String nombre;
	private int edad;
	private int id;
	private char genero;
	private final float peso;
	private final float altura;
	
	public Persona() {
		this.altura=0;
		this.edad=0;
		this.genero= "";
		this.id=0;
		this.nombre= ""; // para que el objeto String esté vacio, este debe ""
		this.peso=0;
		this.RUT=0;
		
		
		}
	
	
				// constructor para los atributos declarados al principio
	public Persona(int RUT, String nombre, int edad, int id, String genero, float peso, float altura) {
		super();
		this.RUT= RUT;
		this.nombre = nombre;
		this.edad = edad;
		this.id = id;
		this.genero = genero;
		this.peso = peso;
		this.altura = altura;
	}


		public void nombre(){
			System.out.println("Su Nombre: ");
		}
	
		public void calculoIMC () {
			double  calculoIMC= (peso/(altura*altura));
			if(calculoIMC<20) {
				System.out.println("Está bajo su peso ideal");
			}
			if (calculoIMC >25) {
				System.out.println("Está sobre su peso");				
			}else {
				System.out.println("Su peso está bien");
			}
			
		}
		public void esMayorEdad() {
			if (edad >18){
				System.out.println("Usted es mayor de edad");
			}
		}
		public void compruebaGenero() {
			System.out.println("Usted es: ");
		}
		
		public void toString() {
			
		}

		private void generaid() {
			System.out.println("Su ID es: "+ id);

		}

		public int getRUT() {
			return RUT;
		}



		public void setRUT(int RUT) {
			RUT = RUT;
		}



		public String getNombre() {
			return nombre;
		}



		public void setNombre(String nombre) {
			this.nombre = nombre;
		}



		public int getEdad() {
			return edad;
		}



		public void setEdad(int edad) {
			this.edad = edad;
		}



		public String getGenero() {
			return genero;
		}



		public void setGenero(String genero) {
			this.genero = genero;
		}



		public float getPeso() {
			return peso;
		}



		public void setPeso(float peso) {
			this.peso = peso;
		}



		public float getAltura() {
			return altura;
		}



		public void setAltura(float altura) {
			this.altura = altura;
		}
		
		

	}


