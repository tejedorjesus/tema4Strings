package Ejercicio8;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*8.-Dados dos números p y q que leeremos por teclado y que deben ser positivos, hacer
		un programa que nos diga cual de los dos tiene más divisores, con un mensaje que diga
		“p tiene mas divisores que q” ó viceversa.
		*/

		int  p=0;
		int q=0;
		int div=0;
		int contadivisoresP=0;
		int contadivisoresQ=0;
		
		
		Scanner teclado = new Scanner(System.in);

		System.out.println("introduzca un numero");
		p=teclado.nextInt();
		
		if (p < 0){
			p=-p;
		}
		System.out.println("introduzca un numero");
		q=teclado.nextInt();
		
		if (q < 0){
			q=-q;
		}
		
		for (div=1; div<p-1; div++){
			if(p % div==0){
				contadivisoresP = contadivisoresP + 1;
				
			}
		}
		
		for (div=1; div<q-1; div++){
			if(q % div==0){
				contadivisoresQ = contadivisoresQ + 1;
			}
		}
		
		if(contadivisoresP > contadivisoresQ){
		System.out.println(p + " tiene mas divisores que " + q);
		}
		else{ 
			System.out.println(q + " tiene mas divisores que " + p);
			
		
		}
	
	}

}
