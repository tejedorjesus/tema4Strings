package string3;

import java.util.Scanner;

public class string3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String frase;
		String palabra;
		Scanner teclado = new Scanner(System.in);
		System.out.println("escriba una frase");
		frase=teclado.nextLine();
		System.out.println("escriba una palabra de la frase");
		palabra=teclado.nextLine();

		if (frase.contains(palabra)){
			frase.indexOf(palabra);
			System.out.println("la palabra ocupa la posicion" + frase.substring(0));
		}
	}




}


