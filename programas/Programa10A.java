package programas;

import java.util.Scanner;

public class Programa10A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int n=0;
   double pre,sum=0,incre=0,total=0;
   String Res;
  
   
   Scanner leer=new Scanner(System.in);
   
   do {
	   System.out.println("Precio");
	   pre = leer.nextDouble();
	   //sum=sum+pre;
	   sum+=pre;
	   n++;
	   System.out.println("¿Desea registar algun producto?(S/N) ");
	   Res = leer.next();
	   }while (Res.equals("S"));
    
   if(sum>=1500){
	   incre=sum*.11;
   }else{
	   incre=sum*.10;
	   
   }
   total=sum+incre;
   
   System.out.println("Usted ingreso: " + n);
   System.out.println("La suma de su compra fue: " + sum);
   System.out.println("Su incremento es: " + incre);
   System.out.println("Su resultado final es: " + total);
	}
	
}
