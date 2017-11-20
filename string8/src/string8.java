

import java.util.Scanner;
public class string8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//Scanner teclado = new Scanner(System.in);	
		//Leer una frase filtrándola a que todos sus caracteres sean mayúsculas, una vez filtrada y
		//dado un numero entre 1 y 10 haga un cifrado de la frase (denominado cifrado CESAR) del
		//modo siguiente , si el numero por ejemplo es 3, transforme la frase de manera que cada
		//carácter se transforme en 3 códigos ASCII mas es decir :
		//Frase inicial PROGRAMACION resultado SURJUDPDFLRQ.
		//Desarrollar los programas de codificar y descodificar mediante dos funciones.//
		
		String frase1;
		String frase2;
		String frase3;
		String frase4;


		int desplazamiento;
		int i;
		int j;
		frase2 = "";
		frase4 = "";
		String mayus= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String minus= "abcdefghijklmnopqrstuwxyz";


		System.out.println( "teclee una frase");
		frase1=teclado.nextLine();
		System.out.println( "teclee la clave");
		desplazamiento=teclado.nextInt();

		for(i=0; i <frase1.length(); i++){
			for(j=0; j < minus.length(); j++){
				if (frase1.charAt(i)== minus.charAt(j)){
					if (j + desplazamiento >= minus.length()){
						frase2 += minus.charAt((j + desplazamiento) % minus.length());
					}//end if
					else{
						frase2 += minus.charAt(j + desplazamiento);
					}

				}

				else if(frase1.charAt(i)== mayus.charAt(j)){
					if (j+ desplazamiento >= mayus.length()){
						frase2 += mayus.charAt((j + desplazamiento) % mayus.length());
					}//end if
					else{
						frase2 += mayus.charAt(j + desplazamiento);
					}
				}

			}

		}
		System.out.println( frase1);
		System.out.println( frase2);
		
		System.out.println("introduzca el mensaje cifrado para desencriptarlo");
		System.out.println("");
		frase3=teclado.nextLine();
		
		for(i=0; i <frase3.length(); i++){
			for(j=0; j < minus.length(); j++){
				if (frase3.charAt(i)== minus.charAt(j)){
					if (j - desplazamiento >= minus.length()){
						frase4 += minus.charAt((j - desplazamiento) % minus.length());
					}//end if
					else{
						frase4 += minus.charAt(j - desplazamiento);
					}

				}

				else if(frase3.charAt(i)== mayus.charAt(j)){
					if (j- desplazamiento >= mayus.length()){
						frase4 += mayus.charAt((j - desplazamiento) % mayus.length());
					}//end if
					else{
						frase4 += mayus.charAt(j - desplazamiento);
					}
				}

			}

		}
		
		
		System.out.println( frase4);
		
		
	}//end class


}//end main
