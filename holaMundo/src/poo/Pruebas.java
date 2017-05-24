package poo;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleados empleado = new Empleados("Henry",1);
		
		System.out.println(empleado.dimeTrabajador());
		
		empleado.cambiarSeccion("Sistemas");
		
		System.out.println(empleado.dimeTrabajador());
	}
	
}

class Empleados{
	
	public Empleados(String nom, int Id){//Setter
		Nombre = nom;
		Seccion = "Administracion";
		this.Id = Id;
	}
	
	public void cambiaNombre(String nombre){
		
	}
	
	public void cambiarSeccion(String seccion){//Getter
		this.Seccion = seccion;
	}
	
	public String dimeTrabajador(){
		return "La seccion del empleado " + Nombre + " es " + Seccion + " y el ID es " + Id;
	}
	
	private final String Nombre;
	private String Seccion;
	private int Id;
	
}
