import java.util.Scanner;
public class ejercicio3 {

	
		
	

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				Scanner teclado = new Scanner(System.in);


				String frase;
				int i=0;
				System.out.println("Introduzca una frase o plabrabra y mezclelo con algun numero para realizar la suma");
				frase=teclado.nextLine();
				int suma=0;

				for(i=0; i<frase.length(); i++){// hago un for para recorrer el string
					if(frase.charAt(i)>=48 && frase.charAt(i)<=57){// busco los numeros del string ayudandome del codigo ascii

						suma= suma + (frase.charAt(i)-48);// voy sumando ,los numeros una vez los tengo controlados y les resto 
						                                 // 48 puesto que charAt(i) me devuelve los valores en la tabla ascii
						





					}

				}
				System.out.println( " la suma de los numeros que has introducido dentro de la frase es " +suma);
			}

		}

	


