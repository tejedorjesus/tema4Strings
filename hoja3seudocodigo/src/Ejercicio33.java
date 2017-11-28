import java.util.Scanner;
public class Ejercicio33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//Crear un array unidimensional de 20 elementos con nombres de personas. Visualizar los
		//elementos de la lista debiendo ir cada uno en una fila distinta



          String [] nombres = new String[3];
          int i=0;
          
          int conta=0;
   
          System.out.println("introduce el primer nombre");
     	 
          for(i=0; i<nombres.length;i++){
        	
        	  nombres[i] = sc.next();
        	
            	  System.out.println("introduce otro nombre");  
        	  }
        	

	
              
        	  
        	  
          
          
          

          
          for(i=0; i<nombres.length;i++){
        	  System.out.println (nombres[i]);
        	  
          }

	}
}