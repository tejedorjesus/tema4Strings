0package string6;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		//*6. Leer una frase por teclado (m�ximo 80) y a continuaci�n escribir cuantas vocales,
		//consonantes y caracteres num�ricos posee.*//


		String frase;
		int cantidad;
		cantidad=0;
		int cantidadletras =0;
		int cantidadconsonantes=0;
		
		System.out.println("Escriba una frase");
		frase=teclado.nextLine();
		int k;

		for(k=0; k< frase.length(); k++){
			if(frase.charAt(k)== 'a'||frase.charAt(k)== 'e'||frase.charAt(k)== 'i'||frase.charAt(k)== 'o'||frase.charAt(k)== 'u'){
				cantidad ++;
			}// end if
		}// end for

		for(k=0; k< frase.length(); k++){
			if(frase.charAt(k)== 'A'||frase.charAt(k)== 'E'||frase.charAt(k)== 'I'||frase.charAt(k)== 'O'||frase.charAt(k)== 'U'){
				cantidad ++;

			}
		}//end for

		for(k=0; k< frase.length(); k++){
			if(frase.charAt(k) >=97 && frase.charAt(k)<= 122){
					cantidadletras ++;
			}// end if

		
			}//end for.

			
		



		System.out.println( "cantidad vocales"  + cantidad);
		System.out.println( "cantidad consonantes"  + (cantidadletras-cantidad));



	}
}