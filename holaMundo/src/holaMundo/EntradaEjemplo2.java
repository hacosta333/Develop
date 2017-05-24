package holaMundo;

import javax.swing.*;

public class EntradaEjemplo2 {

	public static void main(String[] args) {
		
		String nombreUsuario = JOptionPane.showInputDialog("Introduce tu nombre por favor.");
		
		String edad = JOptionPane.showInputDialog("Introduce tu edad por favor.");
		
		int edadUsuario = Integer.parseInt(edad);
		
		edadUsuario++;
		
		System.out.println("Hola " + nombreUsuario + 
		" El año que viene tendrás " + edadUsuario + 
		" años");
		
		

	}

}
