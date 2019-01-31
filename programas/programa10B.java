package programas;

import java.text.DecimalFormat;
import java.util.Scanner;

public class programa10B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer =new Scanner(System.in);
		DecimalFormat formateador = new DecimalFormat("###,###.##");
		byte s;
		
		double t=0.0,c=0.0, p=-1;
		
		System.out.println("Ingrese un número del 0 al 76");
		System.out.println("Ningún valor por encima del indicado es invalido.");
		
		do{
			System.out.println("Ingrese un número");
				s=leer.nextByte();
				c=c+s;
				p++;
		}while(s<=76);
			
		c=c-s;
		t=c/p;
		
		System.out.println("La suma total es: "+c);
		System.out.print("El promedio es: "+formateador.format(c/p));

	}

}
