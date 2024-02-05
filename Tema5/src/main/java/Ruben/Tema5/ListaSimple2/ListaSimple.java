package Ruben.Tema5.ListaSimple2;

public class ListaSimple implements Lista {

	private Nodo primero;
	private int tamaño;
	//metodo main
	
	//Metodos a redefinir
	@Override
	public boolean isEmpty() {
		
		if (primero==null) {
			return true;
		}
		else {
			return false;
		}
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
		
		for (int i = 0; i < index; i++) {
			aux = aux.getSig();
			if (i == index) {
				aux.setSig(nuevo);
			}
		}
		
	}

	@Override
	public boolean containsInfo(Persona persona) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Persona getElementAt(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeByInfo(Persona persona) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Persona removeAt(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean clearList() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
	public static void main(String[] args) {
		ListaSimple lista = new ListaSimple();
		Persona persona1 = new Persona ("Ruben", 24);
		Persona persona2 = new Persona("Antonio", 25);
		
		lista.insertAtBegin(persona1);
		lista.insertAtEnd(persona2);
		//lista.insertAtPosition(persona2, 2);
		
		System.out.println(lista.isEmpty());
		System.out.println(lista.getFirst());
		System.out.println(lista.getLast());
		//lista.insertAtBegin(new Persona("David",22));
		
	}

}
