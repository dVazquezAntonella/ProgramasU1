package programas;
import java.util.Scanner;

public class Programa06 {

	public static void main(String[] args) {
		Scanner leer =new Scanner(System.in);
		System.out.println("Escribe un n�mero");
		
			int n=leer.nextInt();
			
		if(n%2==0) {
			System.out.println("El n�mero "+ n +" es par");
		}
		else {
			System.out.println("El n�mero "+ n +" es impar");
		}
	}
}
