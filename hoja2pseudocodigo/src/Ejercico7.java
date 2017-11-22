import java.util.Scanner;
public class Ejercico7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//7) Hacer un programa que vaya leyendo números por el teclado hasta que lea el cero
	//que indicará fin de entrada de datos, el programa debe calcular y escribir la suma de
	///los introducidos en lugar par y los introducidos en lugar impar, es decir los
	//introducidos primero, tercero, quinto … etc. y la suma de los introducidos el
	//segundo, cuarto, sexto ... etc.
	
		Scanner teclado = new Scanner(System.in);

		int n=0;
		int k=0;
		int conta=0;
		int sumapar=0;
		int sumaimpar=0;

		System.out.println("intro un numero");
		n=teclado.nextInt();

		while(n!=0){
			if(n%2==0){

				sumapar=sumapar +n;
			
			}
			if(n%2!=0){

				sumaimpar=sumaimpar +n;
			
			}
			System.out.println("intro otro num hasta cero");
			n=teclado.nextInt();
			conta ++;
			
				

		}
System.out.println(" la suma de pares  " + sumapar + "  y la suma de impares    "  +sumaimpar );

	}
}

