package string5;

import java.util.Scanner;

public class string5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Leer una frase por teclado (m�ximo 80 car) y construir otras dos cadenas de forma que una
		//contenga los caracteres en posici�n par y la otra los caracteres en posici�n impar.
		String frase;

		int k;
       int i;
		Scanner teclado = new Scanner(System.in);
		System.out.println("escriba una frase");   
	
		frase=teclado.nextLine();


		for(k=0;k<frase.length();k+=2){

				System.out.print( frase.charAt(k));
				
		}System.out.println();
		for(i=1;i<frase.length();i+=2){
			
			System.out.print( frase.charAt(i));
		}
	
			
		
		
		
		
			}
		}
		



	











