import java.util.Scanner;
public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	7. Escribe un programa que pida por teclado una palabra y muestre por pantalla cu�l es
		//la vocal que m�s veces contiene la palabra junto al n�mero de veces que la tiene.
		Scanner teclado = new Scanner(System.in);
		String s1;
 		int i,j,max=0,posicionLetra=0;
 		int conta[] = {0,0,0,0,0};
 		String vocales="aeiou";
 		System.out.println("Escribe una palabra");
 		s1 = teclado.nextLine();
 		for (i=0; i<s1.length(); i++){ //para cada letra se compara el string introducido con string vocales
 			for (j=0; j<vocales.length(); j++){
 				if (s1.charAt(i)==vocales.charAt(j)){ //si es vocal se suma en un array contador (en su posicion)
 					conta[j]++;
 				}
 				if (conta[j]>max){ //se guarda el valor maximo y su posicion en el string vocales (luego casting)
 					max=conta[j];
 					posicionLetra=vocales.charAt(j);
 				}
 			}
 		} 
 		System.out.println("La vocal que mas aparece es: " +(char)posicionLetra +" (aparece: " +max +" veces)");
 		for (i=0; i<vocales.length(); i++){
 			System.out.println("La vocal " +vocales.charAt(i) +" aparece: " +conta[i] +" veces");

		
		
 		}
		
		
	}
	
}
