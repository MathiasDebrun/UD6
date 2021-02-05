import java.util.Random;

import javax.swing.JOptionPane;

public class Ejercicio2App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cantidad = JOptionPane.showInputDialog(null,
				"Introduce cuántos números aleatorios quieres que se generen: ");
		int c = Integer.parseInt(cantidad);
		int num[]= rellenarArray(c);
		imprimirArray(num);
		
	
		
	}
	public static int[] rellenarArray(int c) {
		int num[]=new int[c];
		for (int i=0; i<num.length;i++) {
			num[i]=c;
			
		}
		return num;
	}
	public static void imprimirArray (int lista[]) {
		for (int i=0;i<lista.length;i++) {
			JOptionPane.showMessageDialog(null, lista[i]);
		}
	}
}