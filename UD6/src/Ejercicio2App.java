import java.util.Random;

import javax.swing.JOptionPane;

public class Ejercicio2App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cantidad = JOptionPane.showInputDialog(null,
				"Introduce cuántos números aleatorios quieres que se generen: ");       //Pedimos al usuario cuántos números aleatorios quiere que se genere.
		int c = Integer.parseInt(cantidad);
		String limite1= JOptionPane.showInputDialog(null, "Introduce el límite inferior: ");   //Le pedimos los límites.
		String limite2= JOptionPane.showInputDialog(null, "Introduce el límite superior: ");
		int c1= Integer.parseInt(limite1);             //Convertimos los String a int para poder pasarlos como parámetros a nuestra clase.
		int c2= Integer.parseInt(limite2);
		int num[]= rellenarArray(c,c1,c2);               // Invocamos la clase que rellena el array de números aleatorios.
		imprimirArray(num);                     	     //Invocamos la clase que muestra el resultado en pantalla.
		
	
		
	}
	public static int[] rellenarArray(int c, int c1, int c2) {
		int num[]=new int[c];                      //Generamos el array.
		Random rdm=new Random();
		for (int i=0; i<num.length;i++) {
			int n=rdm.nextInt(c2-c1+1)+c1;      //Llenamos el array con números aleatorios, dentro del límite establecido.
			num[i]=n;
			
		}
		return num;
	}
	public static void imprimirArray (int num[]) {
		for (int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
	}
}