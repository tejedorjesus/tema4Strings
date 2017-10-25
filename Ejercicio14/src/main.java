

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		
	
		/*14.-Dado un numero n imprimir la lista de todos los numero primos hasta dicho numero
		n.
		*/
		
		int num;
		int divisor;
		int contadiv;
		int pp;
		
	
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escribe un numero: ");
		num=teclado.nextInt();
		
		while (num <= 0){
			System.out.println("Escribe un numero pero mayor que cero: ");
			num=teclado.nextInt();
		}
	
		for( pp=1; pp <= num; pp++){
			
			contadiv = 0;
	
					for(divisor=2; divisor <= pp-1; divisor++){
						if( pp % divisor==0){
							contadiv = contadiv + 1;
						}	
					}
		
	
				if(contadiv==0){
				
					System.out.println("hemos encontrado un primo " +pp);
				
		
		}
	
		}
				
		
	}
}