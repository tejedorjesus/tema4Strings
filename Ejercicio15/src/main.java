import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		// TODO Auto-generated method stub
		//Crear un array unidimensional de 20 elementos con nombres de personas. Visualizar los
		//elementos de la lista debiendo ir cada uno en una fila distinta


		String [] nombres = new String [3];
		
		int i=0;
		System.out.println("intro el  nombre");
		
	
		
		for(i=0; i<nombres.length; i++){
			nombres[i] = teclado.nextLine();
			System.out.println("intro el  nombre");
		
		
		
		}
		for(i=0; i<nombres.length; i++){
		System.out.println( nombres[i]);
		}
	}
}