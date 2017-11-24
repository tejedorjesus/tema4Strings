import java.util.Iterator;
import java.util.Scanner;
public class Ejercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*14.-Dado un numero n imprimir la lista de todos los numero primos hasta dicho numero
		n.
		*/
		Scanner teclado = new Scanner(System.in);
		
		int n=0;
		int pp=0;
		int contadiv;
		int div=0;
		
		System.out.println("introduzca un numero");
		n=teclado.nextInt();
		
		
		for (pp = 2; pp <n-1; pp++) {
			contadiv=0;
			for(div=2; div<pp; div++){
				if(pp%div==0){
					contadiv++;
				}// end if
				
			}//end for
			if(contadiv==0){
			System.out.println(pp);
			}
			
		}
		
		
	}

}
