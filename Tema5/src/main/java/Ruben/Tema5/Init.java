package Ruben.Tema5;

public class Init {

	public static void main(String[] args) {
		//Generar una clase lista, y usar todos los metodos creados anteriormente
		
		Lista lista = new Lista();
		System.out.println("¿Está vacía? " + lista.isEmpty());
		lista.add("Info");
		lista.add("Hola");
		lista.add("Adios");
		lista.print();
		System.out.println("El tamaño de la lista es: " + lista.size());
		System.out.println("¿Está vacía? "+lista.isEmpty());
	}

}
