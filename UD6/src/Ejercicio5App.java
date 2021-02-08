import javax.swing.JOptionPane; 
import java.util.ArrayList;


public class Ejercicio5App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String numero=JOptionPane.showInputDialog(null, "Introduzca el número a convertir: ");
		int n= Integer.parseInt(numero);
		
		ArrayList<String> binario= new ArrayList<String>();
		calculo(n);
		JOptionPane.showMessageDialog(null,binario );
		

	}
	public static ArrayList<String> calculo(int n) {
		int x=0;
		int binar=0;
		ArrayList<String> binario= new ArrayList<String>();
		while (n>1){
			x=n%2;
			n=n/2;
			 binar=binar+x;
			String bin= String.valueOf(binar);
			binario.add(bin);
			
		}
		
		return binario;
	}

}
