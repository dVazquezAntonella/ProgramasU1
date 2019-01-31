package programas;

import java.util.Scanner;

public class Programa03 {
	public String nombre;
	public int edad;
	public double estatura;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
	       System.out.println("Ingresa nombre: ");
	       String nombre;
	       nombre = leer.nextLine();
	       System.out.print("Ingresa edad: ");
	       int edad;
	       edad = leer.nextInt(); 
	    System.out.print("Ingresa estatura: ");
	      double estatura;
	      estatura = leer.nextDouble();
	       System.out.println("Tu nombre es: "+nombre);
	       System.out.println("Tu edad es: "+edad);
	       System.out.println("Tu estatura es: "+estatura);
	}

}
