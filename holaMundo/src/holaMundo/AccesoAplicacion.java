package holaMundo;

import javax.swing.*;

public class AccesoAplicacion {

	public static void main(String[] args) {
		
		String clave="henry";
		
		String pass="";
		
		while (clave.equals(pass)==false) {
			pass=JOptionPane.showInputDialog("Ingrese la contraseña");
			
			if (clave.equals(pass)==false) {
				System.out.println("Contraseña incorrecta");
			}else{
				System.out.println("Contraseña exitosa");
			}
			
		}

	}

}
