package holaMundo;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class UsoArrays2 {

	public static void main(String[] args) {
		
		int[] matriz = new int[500];
		
		for (int i = 0; i < matriz.length; i++) {
			matriz[i] = (int)(Math.random()*100);
			System.out.print(matriz[i] + " ");
			
		}
		
	}

}
