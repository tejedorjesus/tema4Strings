import java.util.Scanner;
public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		//6) Hacer un programa que lea un a serie de n�meros por teclado de manera que cuando
		//	el n�mero le�do sea el cero ya no se introduzcan m�s, el programa debe calcular y
		//escribir la suma de los n�meros de la serie que son m�ltiplos de 5 y cu�ntos se han
		//introducido en total



		int n=0;
		int k=0;
		int conta=0;
		int suma=0;

		System.out.println("intro un numero");
		n=teclado.nextInt();

		while(n!=0){
			if(n%5==0){

				suma=suma +n;
			
			}
			System.out.println("intro otro num hasta cero");
			n=teclado.nextInt();
			conta ++;
			
				

		}
System.out.println(" se ha intro " + conta + "  y la sumea es   "  +suma );

	}
}
