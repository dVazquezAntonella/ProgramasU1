package programas;

import java.util.Scanner;

public class Programa3A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String nombre;
		byte edad;
		float esta;
			Scanner leer = new Scanner(System.in);
				System.out.println("Ingresa nombre: ");
					nombre = leer.nextLine();
	       
				System.out.print("Ingresa edad: ");
	        		edad = leer.nextByte(); 
	    
	        	System.out.print("Ingresa estatura: ");
	        		esta = leer.nextFloat();
		Persona a = new Persona();
		
			a.setNombre(nombre);
			a.setEdad(edad);
			a.setEsta(esta);
		
		System.out.print(a);
	
	
	}
	

}
