package programas;

import java.util.Scanner;

public class Programa05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte cal;
		@SuppressWarnings("resource")
		Scanner leer = new Scanner(System.in);
			System.out.println("Ingresa una calificación: ");
				cal = leer.nextByte(); 
		
		if(cal>=80) {
			System.out.println("Aprobado");
					}
		else
		{
			System.out.println("Reprobado");	
		}
	}
	}


