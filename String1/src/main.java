

import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		String s1;
		int i;


		System.out.println("Escribe una frase:");
		s1=teclado.nextLine();

		while (s1.length() > 80){
			System.out.println("Escribe una frase de menos de 80 caracteres:");
			s1=teclado.nextLine();
		}
		for (i=0 ; i<s1.length(); i++){
			System.out.println(s1.substring(0,i+1));
		}
	}
}
