package holamundo;

import javax.swing.*;

import java.text.NumberFormat;

public class entradaNumeros {

	public static void main(String[] args) {
		//double x=10000.0;
		//System.out.printf("%1.4f",x/3);
		
		String num1 = JOptionPane.showInputDialog("Introduce un numero");
		
		double num2= Double.parseDouble(num1);
		
		System.out.print("la raiz de " + num2 + " es ");
		System.out.printf("%1.8f",Math.sqrt(num2));
		
	}

}
