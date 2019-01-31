package programas;

import java.util.Scanner;

public class Programa11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opc;
	   double cant, res;
	   String R;
		
		Scanner  Leer = new Scanner(System.in);
		
		System.out.println("1.-Pulgadas a Centimetros");
		System.out.println("2.-Pies a Centimetros");
		System.out.println("3.-Pies a Pulgadas");
		System.out.println("4.-Finalizar");
		System.out.println("");
		do {
		System.out.println("Elija una opcion");
		opc = Leer.nextInt();
		System.out.println("Cantidad");
		cant = Leer.nextDouble();
		
		res=0;
		switch(opc) {
		case 1:
			
			res=cant*2.54;
			
			break;
		case 2:
			
			res=cant*30.48;
			
			break;
		case 3:
			res=cant*12;
			break;
		
		default:System.out.println("Usted salio");
		}
		System.out.println("La respuesta es: "+res);
		System.out.println("¿Desea calcular otro valor?");
		R = Leer.next();
		}while(R.equals("S"));
	}

		}
