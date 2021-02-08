import java.util.Random;
import java.util.Scanner;



public class Ejercicio9App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduzca el tamaño del array: ");       //Le pedimos al usuario que indique qué tamaño de array quiere.
		int t = sc.nextInt();
		int numeros[] =llenararray(t);                                  //Llenamos el array con el resultado de la función.
		
		imprimirarray(numeros);										 //Imprimimos el array.
		imprimirsuma(numeros);										 //Imprimimos el resultado de la suma de los componentes del array.

	}

	public static void imprimirarray(int numeros[]) {			     //Función que imprime el array.
		for (int i = 0; i < numeros.length; i++) {               
			System.out.println(numeros[i]);
			 
			  
		} 
	}
	public static void imprimirsuma(int numeros[]) {				//Función que imprime la suma de los componentes del array.
		int suma=0;
		for (int i = 0; i < numeros.length; i++) {
			  suma += numeros[i];
			  
			  
		} System.out.println("y la suma es igual a: " +suma);
	}
	
	public static int[] llenararray (int t) {               		//Función que llena el array con números aleatorios del 1 al 9.
		int numeros[]=new int[t];
		int i=0;
		Random rdm= new Random();
		while(i<numeros.length) {
			int n=rdm.nextInt(9);
			numeros[i]=n;
			i++;
		}
		return numeros;
	}
}
