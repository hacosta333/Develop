package holaMundo;

import java.util.*;

public class AdivinaNumero {

	public static void main(String[] args) {
		
		int aleatorio= (int)(Math.round(Math.random()*100));
		
		System.out.println(aleatorio);
				
		Scanner entrada = new Scanner(System.in);
		
		int numero = 0;
		
		int intentos = 0;
		
		do {
			intentos++;
			System.out.println("Introduce un numero por favor");
			
			numero = entrada.nextInt();
			
			if (aleatorio < numero) {
				System.out.println("Mas bajo");
			}else if(aleatorio > numero){
				System.out.println("Mas alto");
			}
			
		}while (numero != aleatorio);
		System.out.println("Exitoooo a los " + intentos + " intentos");
	}

}
