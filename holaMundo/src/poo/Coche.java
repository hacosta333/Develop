package poo;

public class Coche {
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int pesoPlataforma;
	
	String color;
	int pesoTotal;
	int asientos;
	boolean asientosCuero;
	boolean climatizador;
	
	public Coche(){
		ruedas=4;
		largo=200;
		ancho=100;
		motor=1800;
		pesoPlataforma=500;
	}
	public String largoCoche(){ //Getter
		return "El largo del carro es: " + largo;
	}
	public String ruedasCoche(){ //Getter
		return "El coche tiene: " + ruedas + " ruedas";
	}
	
	public void asignarColor(){ //Setter
		color = "azul";
	}
	public String colorCoche(){
		return "El color del coche es " + color;
	}
	public void configuraClimatizador(String climatizador){
		if (climatizador.equalsIgnoreCase("si")){
			this.climatizador=true;
		}else{
			this.climatizador=false;
		}
	}
	public void configuraAsientos(String asientos){
		if (asientos.equalsIgnoreCase("si")){
			this.asientosCuero=true;
		}else{
			this.asientosCuero=false;
		}
	}
public String dimeAsientos(){
		
		if (asientosCuero==true){
			return "El coche Tiene asientos de cuero";
		}else{
			return "El coche no tiene asientos de cuero";
		}
	}
	public String dimeClimatizador(){
		
		if (climatizador==true){
			return "El coche incorpora climatizador";
		}else{
			return "El coche lleva AC";
		}
	}
	public String dimePesoCoche(){
		int pesoCarroceria=500;
		pesoTotal = pesoPlataforma + pesoCarroceria;
		if(asientosCuero==true){
			pesoTotal = pesoTotal + 50;
		}
		if(climatizador==true){
			pesoTotal= pesoTotal + 20;
		}
		
		return "El peso del coche es " + pesoTotal;
	}
	public int precioCoche(){
		int precioFinal = 10000;
		if(asientosCuero==true){
			precioFinal+=2000;
		}
		if(climatizador==true){
			precioFinal+=1500;
		}
		return precioFinal;
	}
}
