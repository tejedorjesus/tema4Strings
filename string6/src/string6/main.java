package string6;
import java.util.Scanner;
public class main {






	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		
		String frase;
		int cantidad;
		cantidad=0;
		System.out.println("Escriba una frase");
		frase=teclado.nextLine();
		int k = 0;
		for(k=0; k<= frase.length(); k++){
			
		if(frase.charAt(k)== 'a'){
			cantidad ++;
			 System.out.print( cantidad );
		}
		}
}
}