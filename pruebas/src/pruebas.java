import java.util.Scanner;

public class pruebas {

	public static void main(String[] args) {
		/*14.-Dado un numero n imprimir la lista de todos los numero primos hasta dicho numero
		n.
		*/
		Scanner teclado = new Scanner(System.in);	
		
		int n=0;
		int pp=0;
		int div=0;
		int contadiv=0;
		
		
		System.out.println("intorduzca un numero");
		
		n=teclado.nextInt();
		for( pp = 2;pp<n; pp++){
			
			contadiv=0;
			
			for(div=2; div< pp; div++){
				if (pp%div==0){
					contadiv++;
				}
				
			}
			if (contadiv==0){
				System.out.println(pp);
			}
		}
				
				
					
		
		
			
		
		

		
		
		
		
		

}
}