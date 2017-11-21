import java.util.Scanner;
public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2. Escribe un programa que pida por teclado una cadena y una letra, de manera que
		//elimine las 3 primeras ocurrencias de la letra que encuentre en la cadena y lo muestre
		//por pantalla.
		
		 Scanner teclado = new Scanner(System.in);
		 String s1;
			int i, conta=0;
			char letra;
			System.out.println("Escribe una frase");
			s1 = teclado.nextLine();
			System.out.println("Escribe una letra");
			letra = teclado.next().charAt(0); //pedir char por teclado
			for (i=0; i<s1.length(); i++){
				if(s1.charAt(i)==letra){
					if(conta==0 || conta==1 || conta==2){
						//Si es las primeras 3 no lo imprime
					}
					else{
						System.out.print(s1.charAt(i));
					}
					conta++;
				}else{
					System.out.print(s1.charAt(i));
				}
			}
		}//main
	}//Class