
	
	import java.util.Scanner;
public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//2) Calcular la suma de los cuadrados de los números pares comprendidos entre 1 y n
//	donde n es una variable que se leerá del exterior por el teclado.
		
		
		Scanner teclado = new Scanner(System.in);
		int n=0;
		int sumacuad=0;
		System.out.println(" intro num");
		
		
		n=teclado.nextInt();
		
		for(n=0; n<n; n++);
		if (n%2==0){
			sumacuad= sumacuad+ (n*n);
			
		}
		System.out.println(sumacuad);
		
	}

}
