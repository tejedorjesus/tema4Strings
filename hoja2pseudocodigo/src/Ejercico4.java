	
	import java.util.Scanner;
	
public class Ejercico4 {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
	//	4) Escribir un programa que una vez que lea un n�mero n por teclado calcule y escriba
	//sus divisores por la pantalla
		
		int n=0;
		int k=0;
		
		System.out.println("escriba un numero");
		n=teclado.nextInt();
		
		for(k=1; k<=n; k++){
		if(n%k==0){
			System.out.println("los divisores son " + k );
		}
		
		
		
		}
		
	}

}
