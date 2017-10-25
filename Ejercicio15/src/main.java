import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		/*15.- Realizar un programa que elija mediante un menú un tipo de figura:
		- Triángulo
		- Cuadrado
		- Rectángulo
		Una vez elegida la opción, nos tiene que pedir en cada caso los datos necesarios para
		calcular su área y mostrarla.
		 */

		int base;
		int altura;
		double area;
		int opcion;

		Scanner teclado = new Scanner(System.in);

		System.out.println("calculo area de:");

		System.out.println("1 triangulo");

		System.out.println("2 cuadrado:");

		System.out.println("3 rectangulo");

		System.out.println("0 salir");

		opcion=teclado.nextInt();

		while(opcion != 0){

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
