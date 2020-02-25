package repasoclases;

public class ComparaStrings {

	public static void main (String arg[]){
		
		String str1="El lenguaje Java";
		String str2=new String ("El lenguaje Java");
		
		if(str1==str2) {
			System.out.println("Los mismos objetos");
		}
		else {
			System.out.println("Distintos objetos");
			
		}
		
		if(str1.equals(str2)) {
				System.out.println("El mismo contenido");
						
			}else {
				
				System.out.println("Distinto contenido");
			}
			
		
	}

		
}
