package string3;

import java.util.Scanner;

public class string3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String frase;
		String palabra;
		int posicion=0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("escriba una frase");
		frase=teclado.nextLine();
		System.out.println("escriba una palabra de la frase");
		palabra=teclado.nextLine();
		
		posicion=frase.indexOf(palabra);
		if (posicion !=0){
			System.out.println("la palabra ocupa la posicion " + posicion);
		}else{
			System.out.println("la palabra ocupa la posicion " + " 0 ");
		}
	}



}


