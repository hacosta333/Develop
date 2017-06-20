package poo;

import javax.swing.*;

import java.awt.Toolkit;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;

public class PruebaTemporizador2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reloj miReloj = new Reloj();
		
		miReloj.enMarcha(2000, true);
		
		JOptionPane.showMessageDialog(null, "Pulse aceptar para terminar");
		System.exit(0);
		
	}

}

class Reloj{
	
	public void enMarcha(final int intervalo, final boolean sonido){
		
		class dameLaHora2 implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				
				Date ahora = new Date();
				System.out.println("Te pongo la hora cada " + intervalo/1000 + " segundos " + ahora);
				
				if (sonido) {
					Toolkit.getDefaultToolkit().beep();
					System.out.println("beeeeep");
				}
				
			}
			
		}
		
		ActionListener oyente = new dameLaHora2();
		Timer miTemporizador = new Timer(intervalo, oyente);
		miTemporizador.start();
		
	}
	

	
	
}