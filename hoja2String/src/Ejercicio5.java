import java.util.Scanner;
public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	5. Escribe un programa que pida una palabra por teclado e intercambie la última y la
//		primera letra.

		 Scanner teclado = new Scanner(System.in);
		 
		 String palabra;
		 
		 System.out.println("introduzca una palabra");
		 palabra = teclado.nextLine();
		
		  		char ultimo = palabra.charAt(palabra.length()-1);
		  		char primero = palabra.charAt(0);
		  		
		  		System.out.print( ultimo );
		  		System.out.print( palabra.substring(1,palabra.length()-1));
		  		
		  		System.out.print( primero );
		 
		 
		 
		 
	}

}
