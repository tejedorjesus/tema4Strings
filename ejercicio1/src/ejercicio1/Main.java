package ejercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*1.-Escribir un programa que calcule e imprima la SUMA de los números impares
		comprendidos entre a y b que deben leerse por teclado y filtrarse para que a<=b*/
		
		int numero1, k;
		int numero2;
		int suma;
	
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese primer valor");
		numero1 = teclado.nextInt();
		System.out.println("Ingrese segundo valor");
		numero2 = teclado.nextInt();
		while (numero1>numero2){
			System.out.println("Ingrese un valor mayor que" +numero1);
			numero2 = teclado.nextInt();
		}//while
		suma = 0;
		for (k = numero1 + 1; k < numero2; k++) {
			if (k % 2 != 0){
				suma = suma + k ;
			}//if
		}//for

		System.out.println("El resultado es:" + suma);
		
	}//main

}//class