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

			Jefatura jefe1 = new Jefatura("Dagoberto", 8000000, 2015, 01, 27);
			
			Empleado[] misEmpleados= new Empleado[6];
			
			misEmpleados[0] = new Empleado("Henry Acosta", 5000000, 2013, 11, 05);
			misEmpleados[1] = new Empleado("Diana Hincapie", 8000000, 2012, 12, 01);
			misEmpleados[2] = new Empleado("Daniel Acosta", 1200000, 2010, 01, 15);
			misEmpleados[3] = new Empleado("Antonio Fernandez");
			misEmpleados[4] = jefe1; //polimorfismo en accion. Principio de sustitucion.
			misEmpleados[5] = new Jefatura("Marisol", 9000000, 1999, 05, 26);//polimorfismo en accion. Principio de sustitucion.
			
			Jefatura jefe2= (Jefatura)misEmpleados[5];
			jefe2.estableceIncentivo(50000);
			
			jefe1.estableceIncentivo(200000);
			
			for (Empleado i: misEmpleados) {
				i.subirSueldo(5);
				
			}
			for (Empleado i: misEmpleados) {
				System.out.println("Nombre: " + i.dameNombre() 
				+ " Sueldo: " + i.dameSueldo() //Enlazado dinamico para el Empleado en la posicion 4. llama al dameSueldo de Jefatura.
				+ " Fecha de ingreso: " + i.dameFechaAlta());
			}
			
			
			
			
			
			System.out.println("El sueldo de " + jefe1.dameNombre() +"  con incentivo es $"+ jefe1.dameSueldo());
		
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

class Jefatura extends Empleado{
	
	public Jefatura(String nom, double sue, int anio,int mes, int dia){
		super(nom,sue,anio,mes,dia);
		
	}
	
	public void estableceIncentivo(double b){
		incentivo=b;
	}
	
	public double dameSueldo(){
		
		double sueldoJefe=super.dameSueldo();
		
		return sueldoJefe + incentivo;
	}
	
	private double incentivo;
}