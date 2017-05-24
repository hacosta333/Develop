package holaMundo;

public class UsoArrays {

	public static void main(String[] args) {
		
		
		int[] matriz = new int[5];
		
		for (int i = 0; i < matriz.length; i++) {
			matriz[i] = (int)(Math.random()*100);
			System.out.println("El valor en la posicion " + i + " es " + matriz[i]);
		}

	}

}
