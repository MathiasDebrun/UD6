import java.util.Scanner;

public class Ejercicio8App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int numeros[]=llenararray(0);        //Llamamos a la función que llena el array.
		imprimirarray(numeros);				 //Llamamos a la función que imprime el array al usuario.
		
		
	} 
	public static void imprimirarray (int numeros[]) {       //Función que imprime el array.
		for (int i=0;i<numeros.length;i++) {
			System.out.println(numeros[i]);
		}
		
	} public static int[] llenararray (int a) {				//Función que llena el array
		int numeros[]=new int[10];
		int i=0;
		while(i<numeros.length) {
			System.out.println("Introduzca el numero nº: "+i); //Le vamos pidiendo al usuario los números en su respectivo orden.
			int n=new Scanner(System.in).nextInt();
			numeros[i]=n;
			i++;
		}
		return numeros;
	}

}
