package string4;

import java.util.Scanner;

public class string4 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String frase;
		Scanner teclado = new Scanner(System.in);
		System.out.println("escriba una frase");
		frase=teclado.nextLine();
		if(frase==frase.toLowerCase()){
			System.out.println( frase.toUpperCase());

		}else{
			System.out.println( frase.toLowerCase());

		}



	}


}



