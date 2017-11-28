import java.util.Scanner;
public class ejercicio4vectores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// 4 Generar una matriz de 5x5 (numérica entera entre -100 y 100) e imprimir el valor mayor y el
		//menor y los lugares donde se encuentran

		final int f = 5;
		final int c = 5;
		int Array1 [][];
		Array1 = new int[f][c];
		int i=0,j=0, max=Array1[0][0], min=Array1[0][0], filaMin=0, filaMax=0, colMin=0, colMax=0;//se pieden declarar los maximos asi max=0;
		
		for (i=0; i<f; i++){
			for (j=0; j<c; j++){
				Array1[i][j]=(int)Math.floor(Math.random()*201-100);
				System.out.print(Array1[i][j] +" ");
				if (max < Array1[i][j]){
					max = Array1[i][j];
					filaMax = i;
					colMax = j;
				}
				if (min > Array1[i][j]){
					min = Array1[i][j];
					filaMin = i;
					colMin = j;
				}
			}
			System.out.println();
		}
		System.out.println("Num max: " +max +" en la posicion [" +(filaMax+1) +"], [" +(colMax+1)+"]");
		System.out.println("Num min: " +min +" en la posicion [" +(filaMin+1) +"], [" +(colMin+1)+"]");
	}//main

}//Class