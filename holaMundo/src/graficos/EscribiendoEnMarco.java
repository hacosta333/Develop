package graficos;

import javax.swing.*;
import java.awt.*;

public class EscribiendoEnMarco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoConTexto MTexto = new MarcoConTexto();
		MTexto.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class MarcoConTexto extends JFrame{
	
	public MarcoConTexto(){
		
		setVisible(true);
		setSize(600,450);
		setLocation(500, 200);
		setTitle("Escribiendo en el Marco");
		
		Lamina lamina1 = new Lamina();
		
		add(lamina1);
	}
	
}

class Lamina extends JPanel{
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawString("Estamos aprendiendo swing", 100, 100);
	}
	
}