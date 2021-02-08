import java.util.Random;
import java.util.Scanner;



public class Ejercicio9App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduzca el tamaño del array: ");
		int t = sc.nextInt();
		int numeros[] =llenararray(t); 
		
		imprimirarray(numeros);
		imprimirsuma(numeros);

	}

	public static void imprimirarray(int numeros[]) {
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
			  int suma = numeros[i];
			  suma+=suma;
			  
		} 
	}
	public static void imprimirsuma(int numeros[]) {
		int suma=0;
		for (int i = 0; i < numeros.length; i++) {
			  suma += numeros[i];
			  
			  
		} System.out.println("y la suma es igual a: " +suma);
	}
	
	public static int[] llenararray (int t) {
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
