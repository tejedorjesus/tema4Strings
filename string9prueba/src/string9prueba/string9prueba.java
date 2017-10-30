


package string9prueba;
import java.util.Scanner;
public class string9prueba {
	public static void main(String[] args) {

		
		int año=0;
		int sexo =0;
		int codigo1=0;
		int codigo2=0;
		int curso=0;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("introduzca un año");
		año = teclado.nextInt();	
		
		while(año < 1990 || año > 1995 ){
			
			
			System.out.println("introduzca un año valido");
			año = teclado.nextInt();
		
		
		}//end while
		
		System.out.println("introduzca su sexo H pulse(1)o Mujer pulse(2) ");
		
		sexo = teclado.nextInt();
		
		while(sexo < 1 || sexo >2 ){	
			System.out.println("introduzca (1) o (2)");
			sexo = teclado.nextInt();
					
		
		}// end while
		System.out.println("introduzca su curso  pulse(1) o pulse(2) ");
		
		curso = teclado.nextInt();
		
		while(curso < 1 || curso >2 ){	
			System.out.println("introduzca (1) o (2)");
			curso = teclado.nextInt();
		
		
		}// end while
		System.out.println("introduzca un codigo de 1 digito del 1 al 9");
		codigo1 = teclado.nextInt();
		while(codigo1 < 0 || codigo1 > 9 ){
			System.out.println("introduzca un codigo correcto");
			codigo1 = teclado.nextInt();
			
		}
		System.out.println("introduzca un codigo de 1 digito del 1 al 9");
		codigo2 = teclado.nextInt();
		while(codigo2 < 0 || codigo2 > 9 ){
			System.out.println("introduzca un codigo correcto");
			codigo2 = teclado.nextInt();
		}//end while
		System.out.println("la informacion almacenada es " + año + sexo + curso + codigo1 + codigo2);
	}//end class
	
	
}//end main
