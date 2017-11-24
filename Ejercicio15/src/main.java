import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		// TODO Auto-generated method stub
		//2. Dada una frase de no más de 80 caracteres hacer un programa que busque cuántas
		//mayúsculas y minúsculas tiene y lo imprima
		
		
		String frase;
		frase=teclado.nextLine();
		int k=0;
		int contamayus=0;
		int contaminus=0;
		
		for(k=0;k<frase.length(); k++){
			
			if(frase.charAt(k)>64 && frase.charAt(k)<91){
				contamayus++;
			}//end if
			if(frase.charAt(k)>96 && frase.charAt(k)<123){
				contaminus++;
			
			}//end if
			
			
			
		}
		System.out.println("la frase tiene " + contaminus + "minusculas " + contamayus + " mayusculas " );
	}
	
}