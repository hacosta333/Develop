package poo;

import javax.activation.MimetypesFileTypeMap;
import javax.swing.JOptionPane;
import javax.swing.Timer;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class PruebaTemporizador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		dameLaHora hora = new dameLaHora();
		Timer miTemporizador = new Timer(1000,hora);
		
		miTemporizador.start();
		
		JOptionPane.showMessageDialog(null,"Pulse Aceptar para detener");
		System.exit(0);
	}

}

class dameLaHora implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		Date ahora = new Date();
		System.out.println("Te pongo la hora cada 5 segundos " + ahora);
		Toolkit.getDefaultToolkit().beep();
		
	}
	
}