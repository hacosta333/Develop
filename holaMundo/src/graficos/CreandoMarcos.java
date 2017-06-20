package graficos;

import java.awt.Frame;
import java.awt.Toolkit;

import javax.swing.*;

public class CreandoMarcos {

	public static void main(String[] args) {
		
		Marco miMarco = new Marco();
		miMarco.setTitle("La ventana");
		//miMarco.setLocation(600, 300);
		miMarco.setVisible(true);
		
		
		
	}

}

class Marco extends JFrame{
	
	public Marco(){
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(600, 300, 550, 300);
		//setResizable(true);
			
		
	}
}
