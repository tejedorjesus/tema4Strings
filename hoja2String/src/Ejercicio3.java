import java.util.Scanner;
public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3. Escribe un programa que pida por teclado una palabra y diga si es un palíndromo
		//o no. Una palabra es un palíndromo si se lee igual de izquierda a derecha que de
		//derecha a izquierda.
		
		
		
		Scanner teclado = new Scanner(System.in);
		String palabra;
		 System.out.println("escriba una palabra");
			palabra = teclado.nextLine();
		StringBuilder builder=new StringBuilder(palabra);
		String PalabraInvertida=builder.reverse().toString();
		
		
		if (palabra.equals(PalabraInvertida)){
				
			System.out.println( "palindromo");
	}else{
	System.out.println(" No es palindromo");
			

		
			
		
		
		

			
	}
		
		
		
	}
	

}
