import javax.swing.JOptionPane; 
import java.util.ArrayList;
import java.util.Iterator;


public class Ejercicio5App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String numero=JOptionPane.showInputDialog(null, "Introduzca el número a convertir: ");  //Le pedimos al usuario el número.
		int n= Integer.parseInt(numero);         //Convertimos el String a Int para poder trabajar con él.
		
		String binario= new String(calculo(n));   //Le asigamos al String el resultado del método.
		
		imprimirarray(binario);
		
		

	}
	public static void imprimirarray (String binario) { 
				JOptionPane.showMessageDialog(null, "El número convertido a binario es: " +binario);  //Método para imprimir el resultado.
			}
		    
			
		
	public static String calculo(int n) {         //Función que calcula el número convertido a binario.
		
		
		int i;
		String binario= "";
		while (n>0){
			if (n%2==0) {
				binario= "0" +binario;
			} else {
				binario= "1" +binario;
			}
			
			n=n/2;
			
			
			
		}return binario;
		
		
	}

}
