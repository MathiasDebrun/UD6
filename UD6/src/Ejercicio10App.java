import java.util.Random;
import java.util.Scanner;

public class Ejercicio10App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
				Scanner sc=new Scanner(System.in);
				System.out.println("Introduzca el tamaño del array: ");    //Le pedimos al usuario el tamaño del array.
				int t = sc.nextInt();                                      //Tomamos la entrada del teclado.
				int numeros[] =llenararray(t); 							   //Llenamos el array con lo que nos devuelve la función.
				imprimirarray(numeros);									   //Imprimimos el resultado con la función.
	}
	public static void imprimirarray(int numeros[]) {                      //Función que imprime el array.
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
			  int suma = numeros[i];
			  suma+=suma;
			  
		} 
	}
	public static int[] llenararray (int t) {                             //Función que llena el array con números aleatorios entre el 1 y el 100.
		int numeros[]=new int[t];
		int i=0;
		
		Random rdm= new Random();
		while(i<numeros.length) {
			int n=rdm.nextInt(100);
			for (int contador=2;contador<=n;contador++) {
			if(n%contador!=0){
				 numeros[i]=n;
				 
			 }}
			
			i++;
				}
			
		return numeros;
	}










}
	
