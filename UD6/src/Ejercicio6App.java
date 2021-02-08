import javax.swing.JOptionPane;

public class Ejercicio6App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String numero=JOptionPane.showInputDialog(null, "Introduce un número entero positivo: ");   //Le pedimos el número al usuario.
		int n=Integer.parseInt(numero);      //Convertimos el String a int para poder llevarlo al método.
		int total=calculo(n);               //Le asignamos el lo que nos devuelve la función al integer "total".
		JOptionPane.showMessageDialog(null, "EL número de cifras es igual a: "+total);    //Le mostramos al usuario el resultado;
		

	}
	public static int calculo (int n) {  //Función que calcula el número de cifras.
		int resultado=0;
		 while (n!=0) {
			 
		 n=n/10;
		 resultado++;
		 
		 }
		
		return resultado;
	}

}
