package programas;
import java.util.Scanner;

public class Programa07 {
	
	public static void main(String[]args) {
		Scanner leer=new Scanner(System.in);
			double total, res;
		
		System.out.println("Grados fahrenheit: ");
			res = leer.nextFloat();
				total=(res-32)/1.8;
				
		System.out.println("Grados en centígrados: "+ total);
	}

}
