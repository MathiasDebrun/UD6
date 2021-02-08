import javax.swing.JOptionPane;

public class Ejercicio7App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String valor=JOptionPane.showInputDialog(null, "Introduzca el valor: ");
        double n= Integer.parseInt(valor);
         String moneda= JOptionPane.showInputDialog(null, "Introduzca a la moneda que quiere convertir: ");
         calculo(n,moneda);
         
         
		
	}
	public static void calculo (double n, String Moneda) {
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
