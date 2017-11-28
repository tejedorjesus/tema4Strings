import java.util.Scanner;

public class ejercicio3vectores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 //Leer un vector de 20 enteros. Encontrar el mayor y el menor de ellos y los lugares donde se
		 //encuentran.
		
		
		
		
	
		int [] valores= new int [20];
		int maximo= 0;
		int minimo = 0;
		int posimin = valores [0];
		int posimax =valores [0];
		
			
	
		
		System.out.println("introduce 20 numeros");
		for(int i=0; i<4; i++){
			valores[i]=(int)Math.floor(Math.random()*21-10);
			System.out.println(valores[i]);
			
	
		
			 
			
				
			 if(valores[i]>maximo){
				 maximo=valores[i];
				 posimax= i;
			 }//end if
			
			 if(valores[i]<minimo){
				 minimo=valores[i];
				 posimin= i;
			 
	
			 }//end if
			
		 }//end for
		 System.out.println();
		 System.out.println( "el maximo es " + maximo +  " la posiscion maxima es " + (posimax +1) );
		 System.out.println(  "  el minimo es " + minimo +  " la posicion minima es " + (posimin +1) );
	
	}

}
