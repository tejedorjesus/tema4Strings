import java.util.*;
public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//10) Dado un numero n que filtraremos a que sea positivo, escribir un programa que nos
	//diga cu�l es el numero primo m�s cercano a �l por debajo.
		
		Scanner teclado = new Scanner(System.in);
		int n=0;
		int k=0;
		int conta=0;
		System.out.println("intro num");
		n=teclado.nextInt();
		
		
		for (k=0; k<n;k++){
			if ((n-k)%k==0){
				conta ++;
				
				System.out.println(k);
			}
		}
		

		
	}

}
