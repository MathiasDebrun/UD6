import javax.swing.JOptionPane;

public class Ejercicio7App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String valor=JOptionPane.showInputDialog(null, "Introduzca el valor: ");    //Le pedimos el valor al usuario.
        double n= Integer.parseInt(valor);      //Convertimos el String a double.
         String moneda= JOptionPane.showInputDialog(null, "Introduzca a la moneda que quiere convertir: ");
         calculo(n,moneda); 					//Llamamos al método que hace la conversión, dándole como parámetros la entrada del usuario.
         
         
		
	}
	public static void calculo (double n, String Moneda) {                   	//Función que hace la conversión.
		switch (Moneda) {
		case "dolares":
			n=n*1.28611;
			JOptionPane.showMessageDialog(null, "Son " +n+ "dolares");
		break;
		case "yenes" :
			n=n*129.852;
			JOptionPane.showMessageDialog(null, "Son " +n+ "yenes");
		break;
		case "libras":
			n=n*0.86;
			JOptionPane.showMessageDialog(null, "Son " +n+ "libras");
		
		
		}
		
	}

}
