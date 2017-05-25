package poo;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleados empleado = new Empleados("Henry");
		Empleados empleado2 = new Empleados("Daniel");
		Empleados empleado3 = new Empleados("Diana");
		Empleados empleado4 = new Empleados("Maria");
		
		//System.out.println(empleado.dimeTrabajador());
		
		empleado.cambiarSeccion("Sistemas");
		
		System.out.println(empleado.dimeTrabajador()  + "\n" +
						   empleado2.dimeTrabajador() + "\n" +
						   empleado3.dimeTrabajador() + "\n" +
						   empleado4.dimeTrabajador());
		
		
		System.out.println(Empleados.siguienteId());
		
	}
	
}

class Empleados{
	
	public Empleados(String nom){//Setter
		Nombre = nom;
		Seccion = "Administracion";
		Id = IdSiguiente;
		IdSiguiente++;
		
	}
	
	public Empleados(String nom, int sue){//Setter
		Nombre = nom;
		Seccion = "Administracion";
		Id = IdSiguiente;
		IdSiguiente++;
		
	}
	
	
	
	public void cambiaNombre(String nombre){
		
	}
	
	public void cambiarSeccion(String seccion){//Getter
		this.Seccion = seccion;
	}
	
	public String dimeTrabajador(){
		return "La seccion del empleado " + Nombre + " es " + Seccion + " y el ID es " + Id;
	}
	
	public static String siguienteId(){
		return "El siguiente ID es " + IdSiguiente;
	}
	
	private final String Nombre;
	private String Seccion;
	private int Id;
	private static int IdSiguiente = 1;
}
