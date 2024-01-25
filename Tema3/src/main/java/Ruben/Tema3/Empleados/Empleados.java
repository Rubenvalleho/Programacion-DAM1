package Ruben.Tema3.Empleados;

public class Empleados {
	public final String nombre;
	public String seccion;
	private int id;
	//Constructor normal
	public Empleados (String nombre, String seccion, int id) {
		this.nombre = nombre;
		this.seccion = seccion;
		this.id = id;
	}
	
	//Constructor seccion administracion
	public Empleados (String nombre, int id) {
		this.nombre = nombre;
		this.seccion = "Administracion";
		this.id = id;
	}
	
	//Get y set sin usar la palabra get ni set
	public String nombreEmpleado () {
		return nombre;
	}
	/*public void ponerNombre (String nombre) {
		this.nombre = nombre; 
	}*/
	
	public String seccionEmpleado () {
		return seccion;
	}	
	public void ponerSeccion (String seccion) {
		this.seccion = seccion;
	}
	
	public void infoEmpleado() {
		System.out.println("El nombre del empleado es: " + nombre + "\nLa seccion del empleado es:" + seccion + "\nSu ID es: " + id);
	}
}
