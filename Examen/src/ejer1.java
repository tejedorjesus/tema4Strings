
public class ejer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	




		int i=0;
		int j=0;
		int conta=0;

		String [] respuestasa1 = {"a","a","b","b","c","c","d","d","a","d"};// genero un array con respuestas a b c d para luego mezclarlas con un math random
		String [] respuestasa2 = {"a","a","b","b","c","c","d","d","a","d"};
		String [] respuestasa3 = {"a","a","b","b","c","c","d","d","a","d"};
		String [] respuestasa4 = {"a","a","b","b","c","c","d","d","a","d"};
		String [] respuestasa5 = {"a","a","b","b","c","c","d","d","a","d"};
		String [] respuestasCo = {"b","d","a","c","b","c","a","c","b","d"};// Vector con las soluciones que quiero compararlo con cada uno de los alumnos
		
        System.out.println(" solucion : B  D  A  C  B  C  A  C  B  D ");
        System.out.print("                                                Aciertos");
        System.out.print("          Fallos");
        System.out.print("          Calificacion");
        System.out.println();
		System.out.print("Alumno  1:");
		conta=0;
		for (i = 0; i < respuestasa1.length; i++) {
			int numramdon=(int)Math.floor(Math.random()*10);  
			System.out.printf("%3s",respuestasa1[numramdon]);// recorro las respuestas con las soluciones para ver cuantas coinciden
			for(j=0; j<respuestasCo.length; j++ ){
				if(respuestasa1==respuestasCo){
					conta++; // cada vez que coinciden aumento el conta
				}
		}
			}
	 System.out.println(conta);
	 // el contador no funciona bien una vez que hubiera tenido el contador ya solo hubiera tenido que  restar para saber los 
	 //fallos y multiplicar por 0,3 pero no lo consigo
		
	 // la instruccion hubiera sido aciertos = contador
	 // fallos = 10 - contadoor
	 // calificacion = acieros - falladas *0,3
	 
	 
	 
		System.out.println();
		System.out.print("Alumno  2:");
		for (i = 0; i < respuestasa2.length; i++) {
			int numramdon=(int)Math.floor(Math.random()*10);  
			System.out.printf("%3s",respuestasa2[numramdon]);
			
		
				
		}	
				
		
		
		System.out.println();
		System.out.print("Alumno  3:");
		for (i = 0; i < respuestasa3.length; i++) {
			int numramdon=(int)Math.floor(Math.random()*10);  
			System.out.printf("%3s",respuestasa3[numramdon]);
			
	}	System.out.println();
		System.out.print("Alumno  4:");
		for (i = 0; i < respuestasa4.length; i++) {
			int numramdon=(int)Math.floor(Math.random()*10);  
			System.out.printf("%3s",respuestasa4[numramdon]);
			
}	System.out.println();
		System.out.print("Alumno  5:");
		for (i = 0; i < respuestasa5.length; i++) {
			int numramdon=(int)Math.floor(Math.random()*10);  
			System.out.printf("%3s",respuestasa5[numramdon]);
}
	}
	
	
	
	
}
