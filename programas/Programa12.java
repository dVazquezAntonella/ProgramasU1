package programas;

import java.util.Scanner;

public class Programa12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Num,n=0;
		String res;
		Double Cal, acu=0.0,pro=0.0;
		Scanner Leer = new Scanner(System.in);
		
		
		System.out.println("¿Cuantas calificaciones desea ingresar?");
		Num = Leer.nextInt();
		
		do{
			n++;
			System.out.println("Ingrese Calificacion");
			Cal=Leer.nextDouble();
			acu=acu+Cal;
		}while(n<Num);
		
		pro=acu/n;
		
		System.out.print("Su calificacion es: "+pro +" ");
		
		if(pro<50){
			System.out.println("Suspenso");
		}
		   if(pro>51 & pro<70){
			System.out.println("Aprobado");
		}
		if(pro>71 & pro<90){
			System.out.println("Notable");
		}
		if(pro>91 & pro<100){
			System.out.println("Sobresaliente");
			}
		if(pro==100){
			System.out.println("Matricula de honor");
		}
	}

}
