import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio12App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduzca el tamaño de la lista: ");   //Le pedimos al usuario el tamaño de la lista
		int t = sc.nextInt();
		System.out.println("Introduzca en qué terminación quiere que acaben los números mostrados: ");		//Le pedimos al usuario en qué numero quiere que terminen los numeros mostrados
		int t1= sc.nextInt();
		ArrayList<Integer> lista= new ArrayList<>(llenararray(t,t1));      //LLenamos el array con el resultado de la función
		imprimirarray(lista);											   //Imprimimos el array.
		
		
		
	}
	public static void imprimirarray(ArrayList<Integer> lista) {
		 Iterator<Integer> it= lista.iterator();                        //Sé que se imprime el resultado varias veces pero no he encontrado manera de solucionarlo y tampoco veo el error porque tampoco hay relación entre cuántas veces se muestra el resultado y el número de resultados.
		 int num;
		 while (it.hasNext()) {
			 num= it.next();
			System.out.println(lista);
		 } 
			  
		
	}
	public static ArrayList<Integer> llenararray (int t, int t1) {
		int numeros[]=new int[t];
		int i=0;
		Random rdm= new Random();
		ArrayList<Integer> lista= new ArrayList<>(); 
		while(i<numeros.length) {
			int n=rdm.nextInt(300);
			int x=n%10;
			numeros[i]=n;
			if (x==t1) {
				lista.add(n);
				
				}
			i++;
		}
		return lista;
	}
}
