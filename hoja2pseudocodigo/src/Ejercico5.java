import java.util.Scanner;
public class Ejercico5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
				
				//Hacer un programa que lea un n�mero n y nos escriba en la pantalla mediante un
				//mensaje si es � no primo (NOTA: N�mero primo es aqu�l que es divisible solo por
				//si mismo y por, la unidad)
		
		int n=0;
		int k=0;
		int conta=0;
		System.out.println("intro num");
		n=teclado.nextInt();
		
		
		for (k=2; k<n;k++){
			if (n%k==0){
				conta++;
			}
		}
			if(conta==0){
				System.out.println("el num " + n + "  es primo");
			}else{
				System.out.println("el num " + n + "  no es primo");
			}
		
		

	}
	}

