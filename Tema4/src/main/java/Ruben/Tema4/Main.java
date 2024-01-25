package Ruben.Tema4;

public class Main {

	public static void main(String[] args) {
		
		AlumnoController gestor = new AlumnoController();
		
		Alumno alumno1 = new Alumno ("Pepe", 18);
		Alumno alumno2 = new Alumno ("Antonio", 19);
		
		gestor.addAlumnos(alumno1);
		gestor.addAlumnos(alumno2);
		
		gestor.printAlumnos();
		
	}

}
