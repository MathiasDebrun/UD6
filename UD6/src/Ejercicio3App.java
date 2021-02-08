import javax.swing.JOptionPane;

public class Ejercicio3App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String numero = JOptionPane.showInputDialog("Introduce un número"); //Le pedimos un número al usuario
		int n = Integer.parseInt(numero);       //Convertimos el número de entrada de formato string a formato int, así podemos trabajar con él
		boolean resultado = esprimo(n);        //Le asignamos el valor de la salida de la función esprimo() para luego poder compararlo.
		if (resultado == true) {
			JOptionPane.showMessageDialog(null, "El número es primo"); 

		} else {
			JOptionPane.showMessageDialog(null, "El numero no es primo");
		}
	}

	public static boolean esprimo(int n) {     //Función que recibe el int que convertimos de la entrada del usuario y devuelve un boolean indicando si el número es primo.
       if(n==1 || n==4) { 					   //Le indicamos a la función que devuelva estos valores en específico dado que con el método el resultado sería que son primos, cuando en realidad no lo son
    	   return false;
       }
		for (int i=2; i<n/2; i++) {       
			
			if (n%i == 0)
				return false;
		}
		
		return true;
	}
}
