package cl.awakelab.web;

import cl.awakelab.poo.*; //necesito importar el package de método y atributos

public class Ejecutalo {
	
	//Este será la emulación de la interfaz de usuario

	public static void main(String[] args) {
		
		//instanciamos MediosDeTRansporte para tener acceso a los metodos y objeetos
		
		MediosDeTransportes m1 = new MediosDeTransportes(200,25,5,250);
		//con el nuevo contructror me obliga a ingresar los cuatro datos dentro de este
		
		
		MediosDeTransportes m2= new MediosDeTransportes();
		
		ElefanteGenerico e1 = new ElefanteGenerico(60,200,4, 400, 20);
		
				
		ElefanteAfricano dumbito= new ElefanteAfricano();
		
		Autito fitito = new Autito();
		
		Monopatin mono = new Monopatin();
		
		dumbito.setKilosDePopo(10);
		dumbito.setAutonomia(10);
		dumbito.setTamanoOreja(10);
		
		/*System.out.println("Autonomia m:1 "+m1.getAutonomia());
		System.out.println("Autonomia e1: "+e1.getAutonomia());
		System.out.println("Autonomia dumbito"+ dumbito.getAutonomia()); */
		
				acelerar(fitito,2);
	}
		public static void acelerar(MediosDeTransportes mdt, int incremento) {
			
			for(int i=0;i<incremento;i++) {
				mdt.avanzar();
				
				
			}
		}
		
		public static void cuentaPax(IVehiculo veh) { 
			veh.contarPasajeros();
		}
}
