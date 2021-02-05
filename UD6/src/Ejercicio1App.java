import javax.swing.JOptionPane;

public class Ejercicio1App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String dato = JOptionPane.showInputDialog(null, "¿De qué figura quiere calcular el área?"); // Pedimos al
																									// usuario qué area
																									// quiere calcular

		switch (dato) {
		case "circulo":
			String radio = JOptionPane.showInputDialog(null, "Indique el radio: "); // Al ser el caso de un círculo
																					// únicamente pedimos el radio
			int r = Integer.parseInt(radio);
			double totalc = calcularcirculo(r); // Invocamos la función que calcula el área y le asignamos ese valor a
												// una variable
			JOptionPane.showMessageDialog(null, "El área del círculo es: " + totalc); // Devolvemos la variable a la que
																						// le asignamos lo que nos
																						// devuelve la función
			break;
		case "triangulo":
			String base = JOptionPane.showInputDialog(null, "Indique la base: "); // Pedimos la base del triángulo
			String altura = JOptionPane.showInputDialog(null, "Indique la altura: "); // Pedimos la altura del triángulo
			int b = Integer.parseInt(base);
			int a = Integer.parseInt(altura);
			double totalt = calculartriangulo(a, b);     //Invocamos la función que calcula el área y le asignamos ese valor a
			// una variable 
			JOptionPane.showMessageDialog(null, "El área del triángulo es: " + totalt); //Devolvemos la variable a la que
																						// le asignamos lo que nos
																						// devuelve la función

			break;
		case "rectangulo":
			String lado1 = JOptionPane.showInputDialog(null, "Indique un lado: ");
			String lado2 = JOptionPane.showInputDialog(null, "Indique el otro lado: ");
			int l1 = Integer.parseInt(lado1);
			int l2 = Integer.parseInt(lado2);
			double totalr = calcularrectangulo(l1, l2); //Invocamos la función que calcula el área y le asignamos ese valor a
			// una variable
			JOptionPane.showMessageDialog(null, "El área del rectángulo es: " + totalr); //Devolvemos la variable a la que
																						// le asignamos lo que nos
																						// devuelve la función
			break;

		}

	}

	public static double calcularcirculo(int r) {                       	//Función que calcula el área del círculo
		double areacirculo = r * Math.PI * Math.PI;
		return areacirculo;

	}

	public static double calculartriangulo(int a, int b) {                 //Función que calcula el área del triángulo
		double areatriangulo = a * b / 2;
		return areatriangulo;

	}

	public static double calcularrectangulo(int l1, int l2) {			  //Función que calcula el área del rectángulo
		double arearectangulo = l1 * l2;
		return arearectangulo;
	}
}
