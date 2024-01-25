package Ruben.Tema4;

public class AlumnoController {
	private final int tamañoArray = 30;
	public Alumno arrayAlumnos [];
	
	public AlumnoController() {
		this.arrayAlumnos = new Alumno[tamañoArray];
	}
	
	public void addAlumnos(Alumno alumno) {
		int contador=0;
		
		while (arrayAlumnos[contador]!=null) {
			contador++;
		}
		arrayAlumnos[contador] = alumno;
	}
	
	public void addAlumnos(Alumno alumno, int posicion) {
		arrayAlumnos [posicion] = alumno;
	}
	
	public void printAlumnos() {
		for (int i=0; i<arrayAlumnos.length-1; i++) {
			if (arrayAlumnos[i]!=null) {
				System.out.println(i + " " + arrayAlumnos[i].getNombre() + " " + arrayAlumnos[i].getEdad());
			}
			else {
				System.out.println("Campo vacío");
			}
		}
	}
	
	

}
