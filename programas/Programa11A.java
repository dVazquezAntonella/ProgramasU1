package programas;

import java.util.Scanner;

public class Programa11A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner Leer = new Scanner(System.in);
		
		int c=0, a=0,emp;
		   double isr=0;
		   System.out.println("Numero de empleados");
	   		 emp= Leer.nextInt();
	   		int[] valores = new int[emp];

	        for (int i = 0; i < emp; i++) {
	           do {
	          	 c++;
	          	 System.out.println("Sueldo trabajador "+c);
	          	 	valores[i]=Leer.nextInt();
	          	 	a+=valores[i];
	           }while(c<=emp);
	        }
	        int min = valores[0];
	        int max = valores[0];

	        for (int i = 1; i < emp; i++) {
	           if (valores[i] < min) {
	              min = valores[i];
	           } else if (valores[i] > max) {
	              max = valores[i];
	           }      }
	        System.out.println("El sueldo minimo es: " + min);
	        System.out.println("El sueldo maximo es: " + max);
	        System.out.println("El monto total es de: "+a);
	        System.out.println("El monto con el ISR es de: "+(isr=a*.67));
	      }
	

}
