
package prueba;

import java.util.Scanner;
public class prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		// TODO Auto-generated method stub
		//ejercicio 7 programa que de una frase nos diga mayusculas minusculas y numeros que tiene*/


		int contamayus=0;

		int contaminus=0;

		int contanum=0;
		int k;

		String s1;

		System.out.println( "teclee una frase");
		s1=teclado.nextLine();

		while (s1.length() > 80){

			System.out.println( "teclee una frase menor de 80 caracteres");
			s1=teclado.nextLine();
		}//end while

		for(k=0; k<=s1.length(); k++);{
		if(s1.charAt(k)>=65 && s1.charAt(k)<=90){
			contamayus ++;
		}//end if
		if(s1.charAt(k)>=97 && s1.charAt(k)<=122){
			contaminus ++;
		}//end if
		if(s1.charAt(k)>=48 && s1.charAt(k)<=57){
			contanum ++;
		}
	}
		



		System.out.println( "la frase tiene " + contamayus + " mayusculas " + contaminus + "minusculas " + " y " + contanum + " numeros");



	}

}
