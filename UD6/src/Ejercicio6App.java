import javax.swing.JOptionPane;

public class Ejercicio6App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String numero=JOptionPane.showInputDialog(null, "Introduce un número entero positivo: ");
		int n=Integer.parseInt(numero);
		int total=calculo(n);
		JOptionPane.showMessageDialog(null, "EL número de cifras es igual a: "+total);
		

	}
	public static int calculo (int n) {
		int resultado=0;
		 while (n!=0) {
			 
		 n=n/10;
		 resultado++;
		 
		 }
		
		return resultado;
	}

}
