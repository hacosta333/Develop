package poo;

import java.util.*;

public class UsoEmpleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Empleado empleado1 = new Empleado("Henry Acosta", 5000000, 2017, 05, 22);
		Empleado empleado2 = new Empleado("Diana Hincapie", 8000000, 2012, 12, 01);
		Empleado empleado3 = new Empleado("Daniel Acosta", 1200000, 2010, 01, 15);
		
				
		empleado1.subirSueldo(10);
		empleado2.subirSueldo(20);
		empleado3.subirSueldo(11);
		

			System.out.println("Nombre: " + empleado1.dameNombre() 
			+ " Sueldo: " + empleado1.dameSueldo()
			+ " Fecha de ingreso: " + empleado1.dameFechaAlta());
			
			System.out.println("Nombre: " + empleado2.dameNombre() 
			+ " Sueldo: " + empleado2.dameSueldo()
			+ " Fecha de ingreso: " + empleado2.dameFechaAlta());
			
			System.out.println("Nombre: " + empleado3.dameNombre() 
			+ " Sueldo: " + empleado3.dameSueldo()
			+ " Fecha de ingreso: " + empleado3.dameFechaAlta());*/

			Empleado[] misEmpleados= new Empleado[4];
			
			misEmpleados[0] = new Empleado("Henry Acosta", 5000000, 2013, 11, 05);
			misEmpleados[1] = new Empleado("Diana Hincapie", 8000000, 2012, 12, 01);
			misEmpleados[2] = new Empleado("Daniel Acosta", 1200000, 2010, 01, 15);
			
			misEmpleados[3] = new Empleado("Antonio Fernandez");
			
			
			
			
			for (Empleado i: misEmpleados) {
				i.subirSueldo(5);
				
			}
			for (Empleado i: misEmpleados) {
				System.out.println("Nombre: " + i.dameNombre() 
				+ " Sueldo: " + i.dameSueldo()
				+ " Fecha de ingreso: " + i.dameFechaAlta());
			}
			
		
	}

}

class Empleado{
	
	public Empleado(String nom, double sue, int anio, int mes, int dia){
		nombre=nom;
		sueldo=sue;
		
		GregorianCalendar calendario = new GregorianCalendar(anio, mes-1, dia);
		altaContrato=calendario.getTime();
	}
	
	public Empleado(String nom){
		this(nom, 40000, 2000, 01, 01);
		
	}
	
	public String dameNombre(){//getter
		return nombre;
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
	
	private String nombre;
	private double sueldo;
	private Date altaContrato;
	//private int anio;
	//private int mes;
	//private int dia;
	
	
}