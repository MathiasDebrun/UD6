import java.util.Scanner;

public class Ejercicio8App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int numeros[]=llenararray(0);
		imprimirarray(numeros);
		
		
	} 
	public static void imprimirarray (int numeros[]) {
		for (int i=0;i<numeros.length;i++) {
			System.out.println(numeros[i]);
		}
		
	} public static int[] llenararray (int a) {
		int numeros[]=new int[10];
		int i=0;
		while(i<numeros.length) {
			System.out.println("Introduzca el numero nº: "+i);
			int n=new Scanner(System.in).nextInt();
			numeros[i]=n;
			i++;
		}
		return numeros;
	}

}
