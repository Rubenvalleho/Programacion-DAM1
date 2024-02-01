package Ruben.Tema5.ListaSimple2;

public class InitListaEjercicio implements Lista {
	
	private Nodo primerNodo;
	private int tamaño;

	//Implementar metodo main
	public static void main (String[] args) {
		Lista listaSimple = new Lista();
	}
	
	//Metodos a definir
	@Override
	public boolean isEmpty(Persona persona) {
		if (persona==primerNodo) {
			return true;
		}
		return false;
	}

	@Override
	public int getFirst() {
		
		return 0;
	}

	@Override
	public int getLast() {
		
		return 0;
	}

	@Override
	public void insertAtBegin(Persona info) {
		
		
	}

	@Override
	public void insertAtEnd(Persona info) {
		
		
	}

	@Override
	public void insertAtPosition(Persona info, int index) {
		
		
	}

	@Override
	public boolean containsInfo(Persona info) {
		
		return false;
	}

	@Override
	public Persona getElementAt(int index) {
		
		return null;
	}

	@Override
	public boolean removeByInfo(Persona info) {
		
		return false;
	}

	@Override
	public Persona removeAt(int index) {
		
		return null;
	}

	@Override
	public void print() {
		
		
	}

	@Override
	public boolean clearList() {
		
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
