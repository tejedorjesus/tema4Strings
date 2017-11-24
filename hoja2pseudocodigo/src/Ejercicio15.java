import java.util.Scanner;
public class Ejercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		//15) Realizar un programa que elija mediante un menú un tipo de figura:
		//	 Triángulo
		// Cuadrado
		//	 Rectángulo
		//	Una vez elegida la opción, nos tiene que pedir en cada caso los datos necesarios para
	//	calcular su área y mostrarla
		
		
		
		
		int opcion;
		int b=0;
		int a=0;
		int areat= (b*a)/2;
		int areac= b*b;
		int arear= (b*a)/2;
		
		System.out.println(" 1tri 2cua o 3rect");
		opcion=teclado.nextInt();
		
		
		switch (opcion){
		case 1:
		
		System.out.println("base del triangulo:");
		b=teclado.nextInt();
		System.out.println("altura del triangulo:");
		a=teclado.nextInt();
		areat = b * a / 2;
		System.out.println("area del triangulo: " + areat );
			
			break;
		case 2:  
			
			System.out.println("base del cuadrado:");
			b=teclado.nextInt();
			System.out.println("altura del cuadrado:");
			a=teclado.nextInt();
			areac = b * b ;
			System.out.println("area del cuadrado: " + areac );
				
				break;
		case 3:
			
			System.out.println("base del rectangulo:");
			b=teclado.nextInt();
			System.out.println("altura del rectangulo:");
			a=teclado.nextInt();
			arear = b * a / 2;
			System.out.println("area del rectasngulo: " + arear );
				
				break;
		case 0:
			break;
		default:
			System.out.println("la has cagado");
			break;
		}
		
		
	}

}
