import java.util.Scanner;
public class prueba2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
<<<<<<< HEAD

		final int F = 10;
		final int C = 10;
		int Array1 [][];
		Array1 = new int[F][C];
		int i,j, sumaF=0, sumaC=0;
		for (i=0; i<F; i++){
			for (j=0; j<C; j++){
				Array1[i][j]=(int)Math.floor(Math.random()*11-5);
				//System.out.print(Array1[i][j] +"["+i+"]" +"["+j+"]");
				System.out.printf("%3d", Array1[i][j]);
			}
			System.out.println();
		}
		System.out.println("\t\t\t\t\t\t\tsuma de filas");
		for (i=0; i<F; i++){
			for (j=0; j<C; j++){
				sumaF+=Array1[i][j];
				System.out.printf("%5d", Array1[i][j]);  //5caracteres de espacio y d es int.
			}
			System.out.printf("%5d\n", sumaF);
			//System.out.println("Suma fila #" +(i+1) +": " +sumaF); //suma de filas
		}
		System.out.println("");
		for (i=0; i<F; i++){  
			for (j=0; j<C; j++){
				sumaC+=Array1[j][i]; //si es cuadrada recorrer primero las columnas en el for externo
			}
			//System.out.println("Suma columna #" +(i+1) +": " +sumaC); //suma de columnas
			System.out.printf("%5d", sumaC);
			
		}
		System.out.print("\t <---suma columnas");	
	}//main
}
        
=======
		Scanner sc = new Scanner(System.in);
		//Crear un array unidimensional de 20 elementos con nombres de personas. Visualizar los
		//elementos de la lista debiendo ir cada uno en una fila distinta



          String [] nombres = new String[3];
          int i=0;
          
          int conta=0;
   
          System.out.println("introduce el primer nombre");
     	 
          for(i=0; i<nombres.length;i++){
        	
        	  nombres[i] = sc.next();
        	  if(conta!=0){
            	  System.out.println("introduce otro nombre");  
        	  }
        	  conta=conta+1;

        	 
              
        	  
        	  
          
          
          }
          System.out.println();
          for(i=0; i<nombres.length;i++){
        	  System.out.println (nombres[i]);
        	  
          }

	}
}
>>>>>>> 2f1884a310763abb5e5c3a3786028bef93d368d6
