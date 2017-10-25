import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*11.-Se define el factorial de un número n como:
		n*(n-1)*(n-2)*.......*3*2*1. Hacer un programa que lea un número n
		filtrando que sea mayor que cero y calcule su factorial
		*/
		int n;
		int factorial;
		int k;
		
		Scanner teclado = new Scanner(System.in);

		System.out.println("introduzca un numero");
		n=teclado.nextInt();
		 while( n <= 0){
			 System.out.println("introduzca un numero");
			 n=teclado.nextInt();
		 }
		  factorial = 1;
		  for(k=n; k>0; k--){
			  factorial = factorial * k;
		  }
		  System.out.println("el factorial de n es " + factorial);
	}

}
