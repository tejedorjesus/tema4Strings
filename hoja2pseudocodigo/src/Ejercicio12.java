import java.util.Scanner;
public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		//12) Un n�mero se dice que es perfecto cuando la suma de sus divisores excluido �l es
		//igual a dicho n�mero. Hacer un programa que lea un n�mero y nos diga si es � no
		//perfecto
		int n=0;
		int contadiv=0;
		int k=0;
		int suma=0;
		
		
		
		System.out.println("intro num");
		n=teclado.nextInt();
		
		for(k=1; k<=n-1; k++){
			if(n%k==0){
				suma=suma +k;
				
			}
			
		}
		
		if(suma==n){
		System.out.println(" es perfecto co");
		}else{
			System.out.println("no es perfecto");
		}
		
	}

}
