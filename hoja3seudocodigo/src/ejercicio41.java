import java.util.Scanner;
public class ejercicio41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//41.-Se dispone de una tabla de 5 p�ginas, 10 filas y 20 columnas, que se refieren al centro, al
		//curso y al n�mero de alumnos de un colegio respectivamente. Imprimir la nota media por curso
		//y la nota media m�xima y su centro de pertenencia


		int  Array1 [][][];
		Array1 = new int [5][10][20];
		int i =0;
		int k=0;
		int j=0;


		for(j=0; j<5; j++){
			System.out.println();
			System.out.println("----------------------------------------------------------------------");
			for(i=0; i<10; i++){
				System.out.println();
				for(k=0; k<20; k++){
					Array1[j][i][k]=(int)Math.floor(Math.random()*11);////(int)Math.floor(Math.random()*(maximo-minimo+1)+(minimo));
					System.out.printf("%3d", (int)Array1[j][i][k]);                                      //(10-0+1)+(0)
				}
			}
		}
		System.out.println("\n----------------------------------------------------------------------");
	}

}
