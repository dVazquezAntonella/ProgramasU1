package programas;
import java.util.Scanner;

public class Programa06 {

	public static void main(String[] args) {
		Scanner leer =new Scanner(System.in);
		System.out.println("Escribe un número");
		
			int n=leer.nextInt();
			
		if(n%2==0) {
			System.out.println("El número "+ n +" es par");
		}
		else {
			System.out.println("El número "+ n +" es impar");
		}
	}
}
