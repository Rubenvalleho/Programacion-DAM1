package Ruben.Tema5.ListaSimple2;

public class ListaSimple implements Lista {

	private Nodo primero;
	private int tama;
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
	public int getFirst() {
		Nodo aux=primero;
		if (aux!=null) {
			return 1;
		}else {
			return Integer.MIN_VALUE;
		}
		
		
	}

	@Override
	public int getLast() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void insertAtBegin(Persona info) {
		/*Nodo aux = primero;
		Nodo anterior;
		if (primero!=null) {
			while (aux==null) {
				aux=primero.getSig();
				anterior=primero;
			}
			
		}*/
		
	}

	@Override
	public void insertAtEnd(Persona info) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertAtPosition(Persona info, int index) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean containsInfo(Persona info) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Persona getElementAt(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeByInfo(Persona info) {
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
		System.out.println(lista.getFirst());
		
		//lista.insertAtBegin(new Persona("David",22));
		
	}

}
