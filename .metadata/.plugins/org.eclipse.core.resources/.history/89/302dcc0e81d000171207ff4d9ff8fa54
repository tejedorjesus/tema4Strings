import java.util.Scanner;
public class pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//41.-Se dispone de una tabla de 5 páginas, 10 filas y 20 columnas, que se refieren al centro, al
		//curso y al número de alumnos de un colegio respectivamente. Imprimir la nota media por curso
		//y la nota media máxima y su centro de pertenencia

		Scanner teclado = new Scanner(System.in);	


		int tabla [][][]=new int [5][10][20];
		int centro;
		int curso;
		int alumno;
		int suma=0;
		int media=0;
		int mediamax=0;

		for(centro=0; centro<5; centro++){
			System.out.println();
			System.out.println("-----------------------------------------------");

			for(curso=0;curso<10; curso ++){
				System.out.println();
				for(alumno=0; alumno<20; alumno++){


					tabla[centro][curso][alumno]=(int)Math.floor(Math.random()*11);
					System.out.printf("%3d",tabla[centro][curso][alumno]);

				}

			}

		}
		System.out.println();
		System.out.println("-----------------------------------------------");
		System.out.println("-----------------------------------------------");

		for(centro=0; centro<5; centro++){
			for(curso=0;curso<10; curso ++){
				for(alumno=0; alumno<20; alumno++){
					suma= suma+ tabla[centro][curso][alumno];
					media= (suma/20);
					if (mediamax<media);
					mediamax=media;


				}
			}
		}
	}

}
