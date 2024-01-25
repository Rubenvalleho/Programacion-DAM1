package Ruben.Tema3.Empleados;

public class MainEmpleados {

	public static void main(String[] args) {
		int id = 1;
		Empleados empleado1 = new Empleados ("Rubén","Empleo",id++);
		
		System.out.println(empleado1.nombreEmpleado());
		empleado1.infoEmpleado();
		
		Empleados empleado2 = new Empleados ("Antonio", "Empleo", id++);
		empleado2.infoEmpleado();
	}

}
