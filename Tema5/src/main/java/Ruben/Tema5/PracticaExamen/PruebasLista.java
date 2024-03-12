package Ruben.Tema5.PracticaExamen;

public class PruebasLista {

	public static void main(String[] args) {
		ListaPractica<Integer> lista = new ListaPractica<>();
		
		lista.insertAtBegin(1);
		lista.insertAtBegin(3);
		lista.insertAtBegin(4);
		lista.insertAtEnd(5);
		lista.insertAtPosition(10, 2);
		
		System.out.println(lista.containsInfo(10));
		lista.removeAt(4);
		
		System.out.println("\nTamaño de la lista: "+lista.size());
		lista.print();

	}

}
