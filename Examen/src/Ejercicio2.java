import java.util.Scanner;   
public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);

	


		
		
				
				
				
				String palabra;
				int i=0;//inicio variable y la pongo a cero
				System.out.println("introduzca una palabra");
				
				palabra=teclado.nextLine();
				for(i=0; i<palabra.length(); i++){//recorro la longitud del string
					
				System.out.print(palabra.charAt(i));//imprimo dos veces para que salga impreso como se pedia en el ejercicio
				System.out.print(palabra.charAt(i));
				
				
				}
			}

		}
