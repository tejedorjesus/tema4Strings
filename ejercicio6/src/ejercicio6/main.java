package ejercicio6;

import java.util.Scanner;

public class main {
	
	/*6.-Hacer un programa que lea una serie de n�meros por teclado de manera que cuando
	el n�mero le�do sea el cero ya no se introduzcan m�s, el programa debe calcular y
	escribir la suma de los n�meros de la serie que son m�ltiplos de 5 y cu�ntos se han
	introducido en total
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int num, suma, contador;
	contador = 0;
	suma = 0;
	Scanner teclado = new Scanner(System.in);

	System.out.println("introduzca un numero");
	
	num = teclado.nextInt();
	
	while( num != 0){
	
	contador = contador +1;
	
	if (num % 5==0){
		suma = suma + num;
	}
	System.out.println("introduzca un numero");
    num = teclado.nextInt();
}

     
     

     System.out.println("se han introducido " + contador + " numeros");
     System.out.println("la suma de los que son multiplos de 5 es:" + suma);

	
	

	
	
	

	}
}
