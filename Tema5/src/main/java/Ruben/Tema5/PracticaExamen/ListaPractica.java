package Ruben.Tema5.PracticaExamen;

import Ruben.Tema5.ListaSimpleGenericos.ListaGenericos;

public class ListaPractica<T> implements ListaGenericos<T> {
	private Nodo<T> primero;
	int tamaño;

	public ListaPractica() {
		primero = null;
		tamaño = 0;
	}

	@Override
	public void print() {
		if (isEmpty()) {
			System.out.println("La lista está vacia");
		} else {
			Nodo<T> aux = primero;
			while (aux != null) {
				System.out.println(aux.getInfo());
				aux = aux.getSig();
			}
		}

	}

	@Override
	public boolean clearList() {
		primero.setSig(null);
		return primero.getSig() == null;
	}

	@Override
	public int size() {

		return tamaño;
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

		if (index < tamaño && index > 0) {
			if (index == tamaño) {
				insertAtEnd(info);
			} else {
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
		boolean resultado = false;
		Nodo<T> aux = primero;
		if (!isEmpty()) {
			while (aux != null) {
				if (aux.getInfo().equals(info)) {
					resultado = true;
					break;
				}
				aux = aux.getSig();
			}
		}

		return resultado;
	}

	@Override
	public boolean removeByInfo(T info) {
		Nodo<T> aux = primero.getSig();
		Nodo<T> anterior = primero;

		if (!isEmpty()) {
			while (aux != null) {
				if (aux.getInfo().equals(info)) {
					anterior.setSig(aux.getSig());
					aux = null;
					break;
				}
				aux = aux.getSig();
				anterior = anterior.getSig();
			}
			tamaño--;
		}
		return anterior.getSig() != null;
	}

	public void borrarNodo(Nodo<T> borrar) {
		borrar.setSig(null);
		tamaño--;
	}

	@Override
	public boolean isEmpty() {
		if (primero != null) {
			return false;
		}
		return true;
	}

	@Override
	public T getFirst() {
		if (!isEmpty()) {
			return primero.getInfo();
		}
		return null;
	}

	@Override
	public T getLast() {
		Nodo<T> aux = primero;
		if (!isEmpty()) {
			while (aux.getSig() != null) {
				aux.getSig();
			}
			return aux.getInfo();
		}
		return null;
		
	}

	@Override
	public T getElementAt(int index) {
		Nodo<T> aux = primero;
		
		if (!isEmpty()) {
			for (int i = 0; i < index; i++) {
				aux.getSig();
			}
			return aux.getInfo();
		}
		

		return null;
	}

	@Override
	public void removeAt(int index) {
		Nodo<T> aux = primero.getSig();
		Nodo<T> anterior = primero;
		
		if (!isEmpty()) {
			if (index == 0) {
				primero = primero.getSig();
			}
			else {
				for (int i = 1; i < index; i++) {
					aux = aux.getSig();
					anterior = anterior.getSig();
				}
				anterior.setSig(aux.getSig());
			}
			
			aux = null;
			tamaño--;
		}
		
	}

}
