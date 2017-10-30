import java.util.Scanner;
public class string9 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//*Escribir un programa que lea códigos de personas de 8 caracteres de modo que los cuatro
		//primeros sean numéricos y contenidos entre 1990-1995 (un año), el quinto carácter sea solo
		//(H ó M) sexo, el sexto un numero que representa el curso 1 ó 2 y los caracteres séptimo y
		//octavo pueden tener cualquier valor.Ddeben rechazarse los códigos que no cumplan estas condiciones, 
		//la finalización de entrada de códigos se produce cuando se introduce el código
		//“00000000”. Al final el programa debe sacar un informe indicando cuántos hombres y
		//mujeres hay matriculados en primero y segundo y cuántos códigos correctos han sido
		//leídos.*//
		
		
		


			

		

			
			
				String s1;
				int i, contaH1=0, contaH2=0, contaM1=0,contaM2=0, contaMal=0, contaBien=0;
				Scanner teclado = new Scanner(System.in);
				System.out.println( "teclee una frase");
				s1=teclado.nextLine();
				
				System.out.println("Escribe: 199_(H o M)(1 o 2)(caracter libre)(caracter libre)");
				s1 = teclado.nextLine();
				while (!s1.equals("00000000")){
					while (s1.length() != 8) {
						contaMal++;
						System.out.println("Introduce bien el codigo (longitud)");
						s1 = teclado.nextLine();	
					}
					while (s1.startsWith("199")==false){ 
						contaMal++;
						System.out.println("Introduce bien el codigo (Empieza por 199)");
						s1 = teclado.nextLine();	
					}
					while (s1.charAt(3)<=48 && s1.charAt(3)>=53){ //(mientras no este entre 0 y 5 entra al bucle) --->-> NO VA
						contaMal++;
						System.out.println("Introduce bien el codigo (199X)");
						s1 = teclado.nextLine();	
					}
					while (s1.charAt(4)!='H' && s1.charAt(4)!='M'){
						contaMal++;
						System.out.println("Introduce bien el codigo (H o M)");
						s1 = teclado.nextLine();	
					}
					while (s1.charAt(5)!='1' && s1.charAt(5)!='2'){
						contaMal++;
						System.out.println("Introduce bien el codigo (1 o 2)");
						s1 = teclado.nextLine();	
					}
					if (s1.charAt(5)=='1'){
						if (s1.charAt(4)=='H'){
							contaH1++;
						}else{
							contaM1++;
						}
					}else if (s1.charAt(5)=='2'){
						if (s1.charAt(4)=='H'){
							contaH2++;
						}else{
							contaM2++;
						}
					}
					contaBien++;
					System.out.println("Introduce otro codigo");
					s1 = teclado.nextLine();
				}

				System.out.println(contaBien+" codigos han sido introducidos correctamente");
				System.out.println(contaMal+" codigos han sido introducidos mal");
				System.out.println("Hay " +contaH1 +" hombres en primero y " +contaH2 +" en segundo ");
				System.out.println("Hay " +contaM1 +" mujeres en primero y " +contaM2 +" en segundo ");

			}//main

		}//Class