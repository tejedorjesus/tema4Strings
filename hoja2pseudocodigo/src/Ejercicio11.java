import java.util.Scanner;
public class Ejercicio11{
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		//Se define el factorial de un número n como:
		//	n*(n-1)*(n-2)*.......*3*2*1. Hacer un programa que lea un número n
		//	filtrando que sea mayor que cero y calcule su factorial
		
		int n =0;
		int k =0;
		int multiplicacion=1;
		  System.out.println("int num");
		  n=teclado.nextInt();
		  
		  while(n< 0){
			  
			  System.out.println("int num");
			  n=teclado.nextInt();
			  
				  
			  
		  }
	for (k=1; k<=n-1; k++){
		  multiplicacion=multiplicacion*k;
	}
		   System.out.println(n * multiplicacion);
		  
		
		
		
	
		
	}

}
