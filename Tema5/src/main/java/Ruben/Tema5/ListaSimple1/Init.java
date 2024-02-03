package Ruben.Tema5.ListaSimple1;

public class Init {

	public static void main(String[] args) {
		Lista lista = new Lista();
		System.out.println("ESTA VACIA??? \n"+lista.isEmpty());
		lista.add("primer elemento de la lista");
		lista.add("segundo elemento de la lista");
		lista.add("tercer elemento de la lista");
		lista.add(new String("ultimo elento de la lista"));
		lista.print();
		System.out.println("El tamaño de la lista es: "+lista.size());
		System.out.println("La lista esta vacía?? \n"+lista.isEmpty());
		
		lista.remove(2);
		
		lista.print();

	}

}
