
import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		String s1;
		int i;
		int mayusculas;
		int minusculas;
		int contamayus =0;
		int contaminus=0;
		
		//2. Dada una frase de no más de 80 caracteres hacer un programa que busque cuántas mayúsculas
		//y minúsculas tiene y lo imprima//
			

		System.out.println("Escribe una frase:");
		s1=teclado.nextLine();

		while (s1.length() > 80){
			System.out.println("Escribe una frase de menos de 80 caracteres:");
			s1=teclado.nextLine();
		
		}
		for(i=0; i< s1.length(); i++){
			if(s1.charAt(i)>=65 && s1.charAt(i)<=90){
				contamayus++;
			}//end if
			if(s1.charAt(i)>=97 && s1.charAt(i)<=122){
				contaminus++;
			}
			
			
			
		}
		System.out.println(" tiene " + contaminus + " minusculas y "  +contamayus +  " mayusculas");
		
	}
}