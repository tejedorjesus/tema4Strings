import java.util.Scanner;
public class Ejercicio34 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//34.-Hacer un programa que lea las calificaciones de un alumno en 10 asignaturas, las
		//almacene en un vector y calcule e imprima su media.
		
		
		int i,conta=0;
		int arrayNotas[] = new int[10];

		for (i=0; i<arrayNotas.length; i++){
			arrayNotas[i]=(int)Math.floor(Math.random()*11);////(int)Math.floor(Math.random()*(maximo-minimo+1)+(minimo));
			System.out.printf("%3d", (int)arrayNotas[i]);                                      //(10-0+1)+(0)
			conta= conta + arrayNotas[i];                                                      //11
		}
		System.out.println("\nLa media es: " +(float)conta/10); //salto de linea
		if (((float)conta/10)>5){
			System.out.print(" (Aprobado)");
		}else{
			System.out.print(" (Suspenso)");
		
	}

}
        
		
		
		
		
		
	
	
}
