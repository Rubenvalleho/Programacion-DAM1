package Ruben.Tema5.ListasAlejandra;

public class InitListaEjercicio {

	public static void main(String[] args) {
		
		Lista lista = new ListaSimple();
		Lista listaTorpe = new ListaSimpleHermanaTorpe();
		

		System.out.println("Metemos a 5 personas");
		lista.insertAtBegin(new Persona("Rubén", 24));
		lista.insertAtEnd(new Persona("Antonio", 22));
		lista.insertAtEnd(new Persona("Pepe", 40));
		lista.insertAtEnd(new Persona("Fernando", 33));
		lista.insertAtEnd(new Persona("Vicente", 26));
		lista.print();
		
		System.out.println("");
		System.out.println("Insertamos al final");
		lista.insertAtEnd(new Persona("Ultimo", 00));
		lista.print();
		
		System.out.println("");
		System.out.println("Insertamos al principio");
		lista.insertAtBegin(new Persona("Raul", 20));
		lista.print();
		
		System.out.println("");
		System.out.println("Control de las posiciones concretas");
		System.out.println("Insertamos en el 0");
		lista.insertAtPosition(new Persona("José", 26), 0);
		lista.print();
		
		System.out.println("");
		System.out.println("Insertarmos en el 3");
		lista.insertAtPosition(new Persona("Gabriel", 32), 3);
		lista.print();
		
		System.out.println("");
		System.out.println("Recorrer la lista");
		System.out.println("");
		for (int i = 0; i < lista.size(); i++) {
			System.out.println("La posicion " + i + " es: " + lista.getElementAt(i));
		}
		
		System.out.println("El elemento de la posicion 5 es: " + lista.getElementAt(5));
		System.out.println("");
		System.out.println("El elemento de la posicion 3 es: " + lista.getElementAt(3));
		System.out.println("");
		System.out.println("El elemento de la ultima posicion es: " + lista.getLast());
		
		System.out.println("");
		System.out.println("Borrado");
		System.out.println("");
		lista.print();
		System.out.println("\nBorrado de la ultima posicion");
		lista.removeByInfo(lista.getLast());
		lista.print();
		System.out.println("\nBorrado de la primera posicion");
		lista.removeByInfo(lista.getFirst());
		lista.print();
		System.out.println("\nBorrado de un elemento que no existe");
		lista.removeByInfo(null);
		
		System.out.println("\nBorrado de la posicion 0");
		lista.removeAt(0);
		lista.print();
		
		System.out.println("\nAñado 3 personas a la lista");
		lista.insertAtEnd(new Persona("Persona3", 35));
		lista.insertAtEnd(new Persona("Persona4", 60));
		lista.insertAtEnd(new Persona("Persona5", 73));
		lista.print();
		
		System.out.println("\nBorrar lista");
		lista.clearList();
		lista.print();
		
	}

}
