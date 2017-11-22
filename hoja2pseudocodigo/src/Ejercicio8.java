import java.util.Scanner;
public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//8) Dados dos números p y q que leeremos por teclado y que deben ser positivos, hacer
	//un programa que nos diga cual de los dos tiene más divisores, con un mensaje que
	//diga “p tiene mas divisores que q” ó viceversa.
		Scanner teclado = new Scanner(System.in);
		
		
		int p =0;
		int q=0;
		int k=0;
		int contap=0;
		int contaq=0;
		
		
		
		System.out.println("introduzca el primer numero");
		p=teclado.nextInt();
		System.out.println("introduzca el segundo numero");
		q=teclado.nextInt();
		
		for(k=1; k<=p; k++){
			if (p%k==0){
				contap++;
			}
		}
		for(k=1; k<=q; k++){
			if (q%k==0){
				contaq++;
			}
		}
		if(contap >contaq){
			System.out.println( p + "tine mas divisores que " + q);
		}
		if(contaq >contap){
			System.out.println( q + "tine mas divisores que " + p);
		}
		
	}

}
