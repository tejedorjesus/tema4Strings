package string4;

import java.util.Scanner;

public class string4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1;
		int s2=0;
		
	
		System.out.println("Escribe una frase");
		s1 = sc.nextLine();
		while (s1.length() > 80){
			System.out.println("Escribe una frase menor de 80 caracteres");
			s1 = sc.nextLine();
		}
		System.out.println("desesea cambiar a minusculas o mayusculas" + " 1 = minusculas " + "  2 = mayusculas ");
		
		s2 = sc.nextInt();
		
		if(s2==1){
			
			System.out.println( s1.toLowerCase());
		}
			
		else if(s2==2){
			
			System.out.println( s1.toUpperCase());
		
	
		}
		
	}//main

}//Class





