
import java.util.Scanner;

public class main {
	

/*9.-Escribir un programa que lea una secuencia de datos numéricos de longitud
indefinida de manera que cuando el número sea el cero cesará la entrada de dicha
secuencia. El programa debe imprimirnos la media de todos, el mayor y el menor.
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int max;
		int min;
		int suma=0;
		int contador=0;
		int n;
		
		
		
		
		
		Scanner teclado = new Scanner(System.in);

		System.out.println("introduzca un numero");
		
		n = teclado.nextInt();
		min = n;
		max = n;
		while(n != 0){
			contador = contador +1;
			suma = suma + n;
			if(n > max){
				max = n;
			}else{
				if(n < min){
					min = n;
				}
			}	
			System.out.println("introduzca un numero");
			n = teclado.nextInt();
			
			}
		System.out.println("la suma es " + suma + " la media es " + suma / contador );
		System.out.println("el mayor es " + max + " el menor es " + min );
	
	}

}
