package Ruben.Tema5.ListaSimple2;

public class ListaHermanaTorpe implements Lista{

	private Nodo primero;
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
	}

	@Override
	public void insertAtPosition(Persona persona, int index) {
		Nodo nuevo = new Nodo (persona);
		Nodo aux = primero.getSig();
		Nodo anterior = primero;
		
		if (index==0) {
			insertAtBegin(persona);
		}
		else {
			for (int i = 1; i < index; i++) {
				aux = aux.getSig();
				anterior = anterior.getSig();
			}
			
			anterior.setSig(nuevo);
			
			if (aux!=null) {
				nuevo.setSig(aux);
			}
		}
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
			
		} else {
			for (int i = 1; i <= index; i++) {
				aux = aux.getSig();
			}
			return aux.getPersona();
		}
		
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
		
		return false;
	}

	@Override
	public void removeAt(int index) {
		
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
		if (!isEmpty()) {
			primero = null;
			return isEmpty();
		}
		return !isEmpty();
	}

	@Override
	public int size() {
		int contador = 0;
		Nodo aux = primero;
		
		while (aux != null) {
			aux = aux.getSig();
			contador++;
		}
		
		return contador;
	}
	
	
	public static void main (String [] args) {
		
		
	}
}
