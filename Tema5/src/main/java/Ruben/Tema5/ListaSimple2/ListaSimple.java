package Ruben.Tema5.ListaSimple2;

public class ListaSimple implements Lista {

	private Nodo primero;
	private int tamaño = 0;
	//metodo main
	
	//Metodos a redefinir
	@Override
	public boolean isEmpty() {
		if (tamaño == 0) {
			return true;
		}
		return false;
	}

	@Override
	public Persona getFirst() {
		Nodo aux=primero;
		if (aux!=null) {
			return aux.getPersona();
		}
		else {
			return null;
		}
		
		
	}

	@Override
	public Persona getLast() {
		Persona persona = null;
		Nodo aux = primero;
		
		if (aux!=null) {
			while (aux.getSig()!=null) {
				aux = aux.getSig();
			}
			return aux.getPersona();
		}
		else {
			return persona;
		}
	}

	@Override
	public void insertAtBegin(Persona persona) {
		Nodo nuevo = new Nodo(persona);
		if (!isEmpty()) {
			nuevo.setSig(primero);;
		}
		primero = nuevo;
		tamaño++;
	}

	@Override
	public void insertAtEnd(Persona persona) {
		Nodo nuevo = new Nodo (persona);
		
		if (primero==null) {
			primero = nuevo;
		}
		else if (primero.getSig()==null) {
			primero.setSig(nuevo);
		}
		else {
			Nodo aux = primero;
			while (aux!=null) {
				aux = aux.getSig();
				if (aux.getSig()==null) {
					aux.setSig(nuevo);
				}
			}
		}
		tamaño++;
	}

	@Override
	public void insertAtPosition(Persona persona, int index) {
		Nodo nuevo = new Nodo (persona);
		Nodo aux = primero;
		
		if (index==0) {
			
			insertAtBegin(persona);
			
		} else {
			
			for (int i = 1; i < index; i++) {
				aux = aux.getSig();
			}
			nuevo.setSig(aux.getSig());
			aux.setSig(nuevo);
			
		}
		tamaño++;
	}

	@Override
	public boolean containsInfo(Persona persona) {
		Nodo comprueba = new Nodo (persona);
		Nodo aux = primero;
		
		while (aux!=null) {
			if (aux.getPersona().equals(persona)) {
				return true;
			}
			aux = aux.getSig();
		}
		return false;
	}

	@Override
	public Persona getElementAt(int index) {
		Nodo aux = primero;
		
		if (index==0) {
			return aux.getPersona();
		}
		else if (index < tamaño) {
			for (int i = 1; i <= index; i++) {
				aux = aux.getSig();
			}
			return aux.getPersona();
		}
		
		return null;
	}

	@Override
	public boolean removeByInfo(Persona persona) {
		Nodo aux = primero.getSig();
		Nodo anterior = primero;
		
		if (persona == anterior.getPersona()){
			primero = aux;
		}
		
		else {
			while (aux!=null) {
			
				if (aux.getPersona().equals(persona)) {
					anterior.setSig(aux.getSig());
					aux = null;
					return true;
				}
				aux = aux.getSig();
				anterior = anterior.getSig();
			}
		}
		tamaño--;
		return false;
	}

	@Override
	public void removeAt(int index) {
		Nodo anterior = primero;
		if (index==0) {
			primero = null;
		}
		else {
			for (int i = 0; i < index; i++) {
				anterior = anterior.getSig();
			}
			anterior.setSig(null);
		}
	}

	@Override
	public void print() {
		Nodo aux = primero;
		
		if (primero==null) {
			System.out.println("La lista está vacía");
		}
		
		else {
			while (aux != null) {
			System.out.println(aux.getPersona());
			aux = aux.getSig();
			}
		}
		
	}

	@Override
	public boolean clearList() {
		primero = null;
		return isEmpty();
	}

	@Override
	public int size() {
		return tamaño;
	}
	
	
	
	
	public static void main(String[] args) {
		ListaSimple lista = new ListaSimple();
		Persona persona1 = new Persona ("Ruben", 24);
		Persona persona2 = new Persona("Antonio", 25);
		Persona persona3 = new Persona ("Toto", 33);
		
		lista.insertAtBegin(persona1);
		lista.insertAtEnd(persona2);
		//lista.insertAtEnd(persona3);
		lista.insertAtPosition(persona3, 1);
		
		System.out.println(lista.isEmpty());
		System.out.println(lista.getFirst());
		System.out.println(lista.getLast());
		System.out.println(lista.containsInfo(persona3));
		System.out.println(lista.size());
		lista.print();
		System.out.println(lista.getElementAt(2));
		
		System.out.println(lista.removeByInfo(persona1));
		lista.print();
		
		//lista.removeAt(0);
		lista.print();
		
		//System.out.println(lista.clearList());
		//lista.print();
		
		
		//lista.insertAtBegin(new Persona("David",22));
		
		
		
	}

}
