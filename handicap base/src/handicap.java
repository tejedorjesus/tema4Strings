
import java.util.Scanner;

public class handicap {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner teclado = new Scanner(System.in);
			
			int hand=0;
			int opcion;
			int golpes=0;
			
			
			System.out.println("introduzca su handicap");
			hand=teclado.nextInt();
			

		

			System.out.println("¿En que hoyo se encuentra?");

			System.out.println("1 ");

			System.out.println("2 ");

			System.out.println("3 ");
			
			System.out.println("4 ");
			
			System.out.println("5 ");

			System.out.println("6 ");

			System.out.println("7 ");

			System.out.println("8 ");
			
			System.out.println("9 ");

			System.out.println("10 ");

			System.out.println("11 ");

			System.out.println("12 ");
			
			System.out.println("13 ");

			System.out.println("14 ");

			System.out.println("15 ");

			System.out.println("16 ");
			
			System.out.println("17 ");

			System.out.println("18 ");
			
			switch(opcion){
			case 0:

				break;

			case 1:

				System.out.println("base del triangulo:");
				base=teclado.nextInt();
				System.out.println("altura del triangulo:");
				altura=teclado.nextInt();
				area = base * altura / 2;
				System.out.println("area del triangulo: " + area );
				break;

			case 2:
				System.out.println("base del cuadrado:");
				base=teclado.nextInt();
				area = base * base;
				System.out.println("area del cuadrado: " + area );
				break;

			case 3:
				System.out.println("base del rectangulo:");
				base=teclado.nextInt();
				System.out.println("altura del rectangulo:");
				altura=teclado.nextInt();
				area = base * altura / 2;
				System.out.println("area del rectangulo: " + area );
				break;

			default:
				System.out.println("algo has hecho mal:");
			}
			System.out.println("pulsa 0 para salir del programa:");
			opcion=teclado.nextInt();
		}
			


	}

}
