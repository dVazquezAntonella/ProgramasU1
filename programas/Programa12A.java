package programas;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Programa12A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		
		int c=0,m=0;
		String R;
		do{
			System.out.println("Precio(entre 0 y 400)");
	     float pre= leer.nextFloat();		
			if(pre<201){
				c++;
				}
			if(pre>199 & pre<401){
				m++;
			}
			
			System.out.println("¿Desea registar mas productos? ");
			R= leer.next();
		}while(R.equals("S"));
		
		
		
		
		System.out.println("La cantidad de ventas menores a 200 fue: "+c);
		System.out.println("La cantidad de ventas mayores a 200 fue: "+m);
		
	}
}