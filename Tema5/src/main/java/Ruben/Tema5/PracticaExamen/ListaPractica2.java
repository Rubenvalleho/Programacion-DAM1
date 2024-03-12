package Ruben.Tema5.PracticaExamen;

import Ruben.Tema5.ListaSimpleGenericos.ListaGenericos;

public class ListaPractica2<T> implements ListaGenericos<T> {
	private Nodo<T> primero;
	private int tamaño;

	public ListaPractica2() {
		primero = null;
		tamaño = 0;
	}

	@Override
	public boolean isEmpty() {
		if (primero == null) {
			return true;
		}
		return false;
	}

	@Override
	public T getFirst() {
		Nodo<T> aux = primero;
		if (aux != null) {
			return aux.getInfo();
		}
		return null;
	}

	@Override
	public T getLast() {
		Nodo<T> aux = primero;
		if (!isEmpty()) {
			while (aux.getSig() != null) {
				aux = aux.getSig();
			}
			return aux.getInfo();
		}
		return null;
	}

	@Override
	public void insertAtBegin(T info) {
		Nodo<T> nuevo = new Nodo<>(info);
		if (!isEmpty()) {
			nuevo.setSig(primero);
		}
		primero = nuevo;
		tamaño++;

	}

	@Override
	public void insertAtEnd(T info) {
		Nodo<T> nuevo = new Nodo<>(info);
		Nodo<T> aux = primero;

		if (isEmpty()) {
			primero = nuevo;
		} else {
			while (aux.getSig() != null) {
				aux = aux.getSig();
			}
			aux.setSig(nuevo);
		}
		tamaño++;

	}

	@Override
	public void insertAtPosition(T info, int index) {
		Nodo<T> nuevo = new Nodo<>(info);
		Nodo<T> aux = primero;
		Nodo<T> anterior = primero;
		
		if (index<=tamaño && index>=0) {
			if (index==0) {
				insertAtBegin(info);
			}
			if (index==tamaño) {
				insertAtEnd(info);
			}
			else {
				for (int i = 1; i < index; i++) {
					aux = aux.getSig();
				}
				nuevo.setSig(aux.getSig());
				aux.setSig(nuevo);
			}
			
			tamaño++;
		}
		
	}

	@Override
	public boolean containsInfo(T info) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T getElementAt(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeByInfo(T info) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void removeAt(int index) {
		// TODO Auto-generated method stub

	}

	@Override
	public void print() {
		Nodo<T> aux = primero;
		if (!isEmpty()) {
			while(aux != null) {
				System.out.println(aux.getInfo());
				aux = aux.getSig();
			}
		}

	}

	@Override
	public boolean clearList() {
		if (isEmpty()) {
			System.out.println("La lista está vacía");
		}
		else {
			primero = null;
		}
		return primero == null;
	}

	@Override
	public int size() {
		return tamaño;
	}

	
	public static void main (String [] args) {
		ListaPractica2<Integer> practica2 = new ListaPractica2<>();
		
		practica2.insertAtBegin(4);
		practica2.insertAtBegin(3);
		practica2.insertAtBegin(2);
		practica2.insertAtBegin(1);
		practica2.insertAtPosition(10, 2);
		
		System.out.println(practica2.isEmpty());
		//System.out.println(practica2.getFirst());
		practica2.print();
		//System.out.println(practica2.size());
	}
}
