import javax.swing.JOptionPane;

public class Ejercicio4App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String numero = JOptionPane.showInputDialog(null, "Introduzca un número: "); //Le pedimos al usuario el número de entrada
		int n = Integer.parseInt(numero);         //Convertimos el String a Int así podemos trabajar con él
		double resultado = calculo(n);            //Llamamos a la función que calcula el factorial del número ingresado
		JOptionPane.showMessageDialog(null, "El resultado es igual a: " + resultado);  //Mostramos al usuario el resultado de la operación

	}

	public static double calculo(int n) {            //Función que calcula el factorial.
		int x = n;
		double resultado = 0;

		while (x > 1) {                             //Ponemos esta condición para ponerle el límite, dado que si multiplicara por 0, todo daría 0.
			x--;
			n = n * x;
			resultado = n;

		}
		return resultado;

	}
}
