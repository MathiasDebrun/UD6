import javax.swing.JOptionPane;

public class Ejercicio1App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
	    String dato=JOptionPane.showInputDialog(null, "¿De qué figura quiere calcular el área?");
	    
	    switch (dato) {
	    case "circulo":
	     	String radio=JOptionPane.showInputDialog(null, "Indique el radio: ");
	     	int r= Integer.parseInt(radio);
	     	double totalc= calcularcirculo(r);
	     	JOptionPane.showMessageDialog(null, "El área del círculo es: " +totalc );
	    break;
	    case "triangulo":
	    	String base=JOptionPane.showInputDialog(null, "Indique la base: ");
	    	String altura=JOptionPane.showInputDialog(null, "Indique la altura: ");
	    	int b= Integer.parseInt(base);
	    	int a= Integer.parseInt(altura);
	    	double totalt= calculartriangulo(a,b);
	    	JOptionPane.showMessageDialog(null, "El área del triángulo es: " +totalt);
	    	
	    break;
	    case "rectangulo":
	    	String lado1=JOptionPane.showInputDialog(null, "Indique un lado: ");
	    	String lado2=JOptionPane.showInputDialog(null, "Indique el otro lado: ");
	    	int l1= Integer.parseInt(lado1);
	    	int l2= Integer.parseInt(lado2);
	    	double totalr= calcularrectangulo(l1,l2);
	    	JOptionPane.showMessageDialog(null, "El área del rectángulo es: " +totalr);
	    break;
	     	
	    }
	    
} 
	
	public static double calcularcirculo(int r) {
		double areacirculo= r*Math.PI*Math.PI;
		return areacirculo;
	    	
	    }
	public static double calculartriangulo(int a, int b) {
		double areatriangulo= a*b/2;
		return areatriangulo;
		
	}
	public static double calcularrectangulo(int l1, int l2) {
		double arearectangulo= l1*l2;
		return arearectangulo;
	}
}
