package ejercicio5;

import java.util.Scanner;


public class main {

	/*5.-Hacer un programa que lea un número n y nos escriba en la pantalla mediante un
	mensaje si es ó no primo (NOTA: Número primo es aquél que es divisible solo por si
	mismo y por, la unidad)
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n , k , conta;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduzca un numero");
		n = teclado.nextInt();
		if ( n < 0){
			n = -n;
		}
		conta = 0;
		for (k=2; k<n-1;k++){
			if (n % 2 ==0){
				
	
			conta = conta + 1;
			
			
			
			
		}
	}
	if (conta ==0){
	
		System.out.println("El numero "+n + " es primo");
	
			
		}
		
	else{ 
		System.out.println("El numero "+n + " no es primo");
		
			
		
		
		}
	}

}