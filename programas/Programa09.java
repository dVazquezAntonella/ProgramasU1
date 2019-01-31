package programas;

import java.util.Scanner;

public class Programa09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		int opc;
		double cant, res;
		
		Scanner leer=new Scanner(System.in);
		
		
		  
		  System.out.println("Opcion 1: Pulgadas a centimetros");
		  System.out.println("Opcion 2: Pies de centímetros");
		  System.out.println("Opcion 3: Pies a pulgadas");
		  System.out.println("  ");
		  System.out.println("Elija la opcion que desea convertir: ");
		  opc =leer.nextInt();
		  System.out.println("  ");
		System.out.println("Cantidad que desea convertir: ");
		 cant = leer.nextDouble();
		 res=0;
		  
		  switch (opc){
		  case 1:res= (cant)*(2.54);
		  break;
		  case 2: res=(cant)*(30.48);
		  break;
		  case 3: res=(cant)*(12);
		  break;
				  
		  default: System.out.println("Opcion no valida");
		  }
		  
		  System.out.println("El resultado final de la opcion " + opc + " es: "+ res);
		
	}

}
