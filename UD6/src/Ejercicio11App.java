import java.util.Random;
import java.util.Scanner;

public class Ejercicio11App {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduzca el tamaño de los arrays: ");         //Le pedimos al usuario el tamaño del array.
		int t = sc.nextInt();											    
		int numeros1[] =llenararray(t);										//Llenamos el array con el resultado de la función.
		int numeros2[]= (int[]) numeros1.clone();							//Clonamos el primer array y le asigamos los valores al segundo
		int resultado[]= multiplicararrays(numeros1,numeros2,t);			//Llamamos a la función que los multiplica.
		imprimirarray(resultado);
		
	
		// TODO Auto-generated method stub
      
	}
	public static void imprimirarray(int resultado[]) {
		for (int i = 0; i < resultado.length; i++) {
			System.out.println(resultado[i]);
			 
			  
		} 
	}
	
	
	public static int[] llenararray (int t) {
		int numeros[]=new int[t];
		int i=0;
		Random rdm= new Random();
		while(i<numeros.length) {
			int n=rdm.nextInt(100);
			numeros[i]=n;
			i++;
		}
		return numeros;
	}
	 public static int[] multiplicararrays (int[] numeros1, int []numeros2, int t) {
		 int resultado[]= new int[t];
		 for (int i=0; i<numeros1.length;i++) {
			resultado[i]= numeros1[i]*numeros2[i]; 
		
	 } return resultado;
	 }
}
