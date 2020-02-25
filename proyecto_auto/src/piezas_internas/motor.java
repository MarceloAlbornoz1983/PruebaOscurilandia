package piezas_internas;

public class motor {
	private int velocidad_de_rotacion_del_motor=0;
	private final int capacidad_maxima_en_mililitros_de_gasolina_para_un_piston =
	30;
	 public void Motor(int mililitros_de_gasolina){
	 velocidad_de_rotacion_del_motor = piston(mililitros_de_gasolina, 2);
	 }

	private int piston(int mililitros_de_gasolina, int mililitros_de_oxigeno){
		int fuerza_piston=0;
		
		if (mililitros_de_gasolina>30) {
			fuerza_piston=mililitros_de_gasolina*mililitros_de_oxigeno;
		}else{
			System.out.println("El piston se ha sobrecargado de gasolina y exploto");
		}
		return fuerza_piston;
	}
	
	 public int get_velocidad_de_rotacion_del_motor(){
		 return velocidad_de_rotacion_del_motor;
		 }

}
