package string5;

import java.util.Scanner;

public class string5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String frase;

		int k;

		Scanner teclado = new Scanner(System.in);
		System.out.println("escriba una frase");   
		frase=teclado.nextLine();


		for(k=0;k<frase.length();k+=2){


			System.out.print( "las impares son");
				System.out.print( frase.charAt(k));

			}
		}
		



	}











