import java.util.Scanner;
public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//9) Escribir un programa que lea una secuencia de datos num�ricos de longitud
		//indefinida de manera que cuando el n�mero sea el cero cesar� la entrada de dicha
		//secuencia. El programa debe imprimirnos la media de todos, el mayor y el menor.
		Scanner teclado = new Scanner(System.in);



		int n=0;
		int k=0;
		int media=0;
		int suma=0;
		int maximo=0;
		int minimo;
		int conta=0;

		System.out.println("intro un numero");
		n=teclado.nextInt();
		
		minimo=n;

		while(n!=0){
			conta ++;
			suma=suma +n;
			
			if ( maximo< n){
				maximo=n;
			}
			if ( minimo>n){
				minimo=n;
			}

		
		System.out.println("intro otro num hasta cero");
		n=teclado.nextInt();

		}

		media = suma/conta;


		System.out.println(" el maximo es  " + maximo  + "  el minimo es    "  + minimo + " y la media es " + media  );

	}
}
