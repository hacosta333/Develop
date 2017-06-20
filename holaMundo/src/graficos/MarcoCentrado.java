package graficos;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class MarcoCentrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ElMarco miMarco = new ElMarco();
		miMarco.setVisible(true);
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miMarco.setTitle("Marco Centrado");
	}

}

class ElMarco extends JFrame{
	
	public ElMarco(){
		Toolkit pantalla=Toolkit.getDefaultToolkit();
		Dimension tamanoPantalla= pantalla.getScreenSize();
		int alturaPantalla = tamanoPantalla.height;
		int anchoPantalla = tamanoPantalla.width;
		
		setSize(anchoPantalla/2,alturaPantalla/2);
		setLocation(anchoPantalla/4, alturaPantalla/4);
		
		Image miIcono= pantalla.getImage("/home/hacostaj/eclipse/java-neon/eclipse/icon.xpm");
		setIconImage(miIcono);
	}

}