package ejercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*2.-Calcular la suma de los cuadrados de los n�meros pares comprendidos entre 1 y n
		donde n es una variable que se leer� del exterior por el teclado.*/

		int N, k, suma;

		Scanner teclado = new Scanner(System.in);
		System.out.println("intoduzca un numero por favor");
		N = teclado.nextInt();
		if (N < 0) { 
			N = -N;
		}//if
		suma = 0;
		for (k = 1; k <= N; k++){
			if (k % 2 == 0){
				suma = suma + k*k;
			}//if
		}//for
		System.out.println("El suma es:");
		System.out.println(suma);

	}//main

}//class