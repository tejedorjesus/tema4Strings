import java.util.Scanner;
public class Ejercico3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//3) Leer un número n que debe filtrarse entre 1 y 100 y a continuación calcular y
	//escribir la tabla de multiplicar de ese número con el siguiente formato:
		//TABLA DE MULTIPLICAR DE 8
		//8 * 1 = 8
		//8 * 2 = 16
		Scanner teclado = new Scanner(System.in);
		
		
		int n=0;
		int k=0;
		
		System.out.println("itroduzca numero");
		n=teclado.nextInt();
		
		for (k=0; k<n; k++){
		
		System.out.println(n + "x" + k + "=" +  (n * k));
		}
		
	}

}
