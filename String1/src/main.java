

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		//1. Leer una frase de máximo 80 caracteres y escribirla progresivamente es decir si la frase es:
		//“ciervo”, el programa debe imprimir//
		Scanner teclado = new Scanner(System.in);

		String s1;
		int i;


		System.out.println("Escribe una frase:");
		s1=teclado.nextLine();

		while (s1.length() > 80){
			System.out.println("Escribe una frase de menos de 80 caracteres:");
			s1=teclado.nextLine();
		}
		for(i=0;i<s1.length();i++){
			System.out.println(s1.substring(0,i+1));
			
		}
	
		
	}
}
