import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;
public class prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2. Dada una frase de no más de 80 caracteres hacer un programa que busque cuántas mayúsculas
				//y minúsculas tiene y lo imprima//
				Scanner teclado = new Scanner(System.in);
				
				
				String frase;
				int i=0;
				int contav=0;
				int contac=0;
				
				
				System.out.println(" escribe una frase por teclado ");
				frase=teclado.nextLine();
				
				for(i=0;i<frase.length();i++){
					
			if(frase.charAt(i)== 'a' || frase.charAt(i)== 'e' || frase.charAt(i)== 'i' || frase.charAt(i)== 'o' ||frase.charAt(i)== 'u' ||frase.charAt(i)== 'A' || frase.charAt(i)== 'E' || frase.charAt(i)== 'I' || frase.charAt(i)== 'O' ||frase.charAt(i)== 'U'){
				contav ++;
				}
				
				}
				
				
				
				for(i=0;i<frase.length();i++){
					
					if(frase.charAt(i)>=96 && frase.charAt(i)<=123);{
					contac  ++;
				}
				}
				System.out.print("la frase tiene  " + contav + " vocales");
					System.out.print("la frase tiene  " + (contac-contav) + " consonantes");
	

	
	
}
}