package Ruben.Tema3.TerceraParte;

public class MainPersona {

	public static void main(String[] args) {
		
		Persona persona1 = new Persona("Antonio", 24, 'H');
		
		persona1.esMayorDeEdad();
		
		Persona persona2 = new Persona("Rubén", 24, 'H', 66.0, 1.78);
		Persona persona3 = new Persona ("Carlos");
		
		persona2.comprobarSexo();
		persona2.calcularImc();
		System.out.println(persona3);
		
		System.out.println(persona2.equals(persona2));
		
		Profesor profesor1 = new Profesor("Carlos", 32, 'H', 83, 1.70, "Modulo3");
		
		System.out.println(profesor1);
	}

}
