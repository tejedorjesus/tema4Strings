import java.util.Scanner;
public class Ejercicio37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//37.-Generar una matriz de 4 filas y 5 columnas con n�meros aleatorios entre 1 y 100, y hacer
		//su matriz transpuesta.

		
		
		int Array1[][];
		Array1 = new int [4][5];
		 
		int f=0;
		int c =0;
		
		for(f=0; f<4; f++){
			for(c=0; c<5; c++){
				
			Array1[f][c]=(int)Math.floor(Math.random()*11);
			
			System.out.printf("%3d",Array1[f][c]);
			
			}
			System.out.println();
		}
		
		System.out.println();
		
			for(c=0; c<5; c++){
				for (f=0; f<4; f++){
				System.out.printf("%3d",Array1[f][c]);
				
			}
				System.out.println();
		}
		
	}
	}


