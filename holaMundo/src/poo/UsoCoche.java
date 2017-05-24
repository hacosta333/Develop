package poo;

import javax.swing.*;

public class UsoCoche {

	public static void main(String[] args) {
		
		Coche Renault = new Coche(); //instanciar una clase
		
		System.out.println(Renault.largoCoche());
		
		Renault.asignarColor();
		
		System.out.println(Renault.colorCoche());
		
		Renault.configuraClimatizador(JOptionPane.showInputDialog("Desea Climatizador?"));
		
		System.out.println(Renault.dimeClimatizador());
		
		Renault.configuraAsientos(JOptionPane.showInputDialog("Desea asientos de cuero?"));
		
		System.out.println(Renault.dimeAsientos());
		
		System.out.println(Renault.dimePesoCoche());
		
		System.out.println(Renault.precioCoche());

	}

}
