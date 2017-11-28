import java.util.Scanner;
public class Ejercicio6vectores {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	
	
	
	//6. Generar una matriz de 10x10, asignarles número reales aleatorios a cada elemento entre -5 y 5.
	//Calcular e imprimir la suma de cada una de sus filas y de cada una de sus columnas junto con la
	//matriz.
	
	
	int sumafilas=0;
	int sumacolumnas=0;
	
	int Array1[][];
	Array1=new int [10][10];
	int Array2[];

	int filas=0;
	int columnas=0;
	
	for(filas=0; filas<10; filas++){
		for(columnas=0; columnas<10; columnas++){
		Array1[filas][columnas]=(int)Math.floor(Math.random()*11-5);
		System.out.printf("%3d", Array1[filas][columnas]);
		
	
		}
		
		System.out.println();
		
		
	}
	
	System.out.println( "\t\t\t\t\t\t suma filas");
	
	for(filas=0; filas<10; filas++){
		for(columnas=0; columnas<10; columnas++){
		sumafilas += Array1[filas][columnas];
		System.out.printf("%3d", Array1[filas][columnas]);
	
	
	}
		System.out.print( "   " +sumafilas);
		System.out.println();
	}
	for(filas=0; filas<10; filas++){
		for(columnas=0; columnas<10; columnas++){
		sumacolumnas += Array1[columnas][filas];

		}
		System.out.printf("%3d", sumacolumnas);
	}
		
	}
}

