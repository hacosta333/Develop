package holamundo;

import java.util.*;

public class UsoTallas {

	//enum Talla {MINI, MEDIANO, GRANDE, MUYGRANDE};
	
	enum Talla{
		
		MINI("S"), MEDIANO("M"), GRANDE("L"), MUYGRANDE("XL");
		
		private Talla(String abreviatura){
			this.abreviatura=abreviatura;
				
		}
		
		public String dameAbreviatura(){
			return abreviatura;
			
		}
		
		private String abreviatura;
		
	}
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escribe una talla: MINI MEDIANO GRANDE MUYGRANDE");
		
		String entradaDatos = entrada.next().toUpperCase();
		
		Talla laTalla = Enum.valueOf(Talla.class, entradaDatos);
		
		System.out.println("Talla= " + laTalla);
		
		System.out.println("La abreviatura es: " + laTalla.dameAbreviatura());
		
	}

}
