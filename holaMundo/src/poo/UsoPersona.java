package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class UsoPersona {

	public static void main(String[] args) {
		
		
		Persona[] personas = new Persona[2];
		
		personas[0] = new Empleado2("Luis Conde", 50000, 2009, 02, 25);
		personas[1] = new Alumno("Henry Acosta", "Ing. Sistemas");
		
		for(Persona p : personas){
		System.out.println(p.dameNombre() + p.dameDescripcion());
		}
	}

}

abstract class Persona{
	public Persona(String nom){
		nombre = nom;
	}
	
	public String dameNombre(){
		return nombre;
		
	}
	
	public abstract String dameDescripcion();
	
	private String nombre;
}

class Empleado2 extends Persona{
	
	
	public Empleado2(String nom, double sue, int anio, int mes, int dia){
		super(nom);

		sueldo=sue;
		
		GregorianCalendar calendario = new GregorianCalendar(anio, mes-1, dia);
		altaContrato=calendario.getTime();
	}
	
	public double dameSueldo(){//Getter
		return sueldo;
	}
	
	public Date dameFechaAlta(){//Getter
		return altaContrato;
	}
	
	public void subirSueldo(double porcentaje){//Setter
		sueldo*=(1+(porcentaje/100));
	}
	
	public String dameDescripcion(){
		return ". Este empleado tiene un sueldo de " + sueldo;
	}
	
	private double sueldo;
	private Date altaContrato;
	//private int anio;
	//private int mes;
	//private int dia;
		
}

class Alumno extends Persona{
	
	public Alumno(String nom, String car){
		super(nom);
		carrera = car;
	}
	
	public String dameDescripcion(){
		return ". Este Alumno esta estudiando la carrera: " + carrera;
	}
	
	private String carrera;
}


