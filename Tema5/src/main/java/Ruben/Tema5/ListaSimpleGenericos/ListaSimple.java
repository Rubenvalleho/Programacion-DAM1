package Ruben.Tema5.ListaSimpleGenericos;

public class ListaSimple<T> implements ListaGenericos<T> {

	private Nodo<T> primero;
	private int tam;

	public ListaSimple() {
		primero = null;
		tam = 0;
	}

	@Override
	public boolean isEmpty() {
		return primero == null;
	}

	@Override
	public T getFirst() {
		T T = null;
		if (!isEmpty()) {
			T = primero.getInfo();
		}
		return T;
	}

	@Override
	public T getLast() {
		T T = null;
		if (!isEmpty()) {
			Nodo<T> aux = primero;
			while (aux.getSig() != null) {
				aux = aux.getSig();
			}
			T = aux.getInfo();
		}
		return T;
	}

	@Override
	public void insertAtBegin(T info) {
		Nodo<T> nuevo = new Nodo<T>(info);
		if (!isEmpty()) {
			nuevo.setSig(primero);
		}
		primero = nuevo;
		tam++;
	}

	@Override
	public void insertAtEnd(T info) {
		Nodo<T> nuevo = new Nodo<T>(info);
		if (isEmpty()) {
			primero = nuevo;
		} else {
			Nodo<T> aux = this.primero;
			while (aux.getSig() != null) {
				aux = aux.getSig();
			}

			aux.setSig(nuevo);
		}
		tam++;
	}

	@Override
	public void insertAtPosition(T info, int index) {
		if (index >= 0 && index <= tam) {
			Nodo<T> nuevo = new Nodo<T>(info);
			// Opciones
			// Inserto al ppio
			// Inserto al final
			// Inserto en una posición concreta
			if (index == 0) {
				nuevo.setSig(primero);
				primero = nuevo;
			} else {
				Nodo<T> aux = primero;
				if (index == tam) {
					while (aux.getSig() != null) {
						aux = aux.getSig();
					}
				} else {
					// Recorro la lista hasta la posición indicada -1
					for (int i = 1; i < index; i++) {
						aux = aux.getSig();
					}
					nuevo.setSig(aux.getSig());
				}
				aux.setSig(nuevo);
			}
			tam++;
		}
	}

	public void insertAtPosition2(T info, int index) {
		if (index >= 0 && index <= tam) {
			Nodo<T> nuevo = new Nodo<T>(info);
			// Opciones
			// Inserto al ppio
			// Inserto en otras posiciones
			if (index == 0) {
				nuevo.setSig(primero);
				primero = nuevo;
			} else {
				Nodo<T> aux = primero;
				for (int i = 1; i < index; i++) {
					aux = aux.getSig();
				}
				nuevo.setSig(aux.getSig());
				aux.setSig(nuevo);
			}
			tam++;
		}
	}

	@Override
	public boolean containsInfo(T info) {
		boolean resultado = false;
		if (!isEmpty()) {
			Nodo<T> aux = primero;
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
	public T getElementAt(int index) {
		T T = null;
		if (!isEmpty() && index >= 0 && index < tam) {
			Nodo<T> aux = primero;
			for (int i = 0; i < index; i++) {
				aux = aux.getSig();
			}
			T = aux.getInfo();
		}
		return T;
	}

	@Override
	public boolean removeByInfo(T info) {
		boolean resultado = false;
		if (!isEmpty()) {
			if (primero.getInfo().equals(info)) {
				Nodo<T> borrar = primero;
				primero = primero.getSig();
				deleteNodo(borrar);
				resultado = true;
			} else {
				Nodo<T> ant = primero;
				Nodo<T> borrar = primero.getSig();

				while (borrar != null) {
					if (borrar.getInfo().equals(info)) {
						ant.setSig(borrar.getSig());
						deleteNodo(borrar);
						resultado = true;
						break;
					}
					borrar = borrar.getSig();
					ant = ant.getSig();
				}
			}
		}
		return resultado;
	}

	private void deleteNodo(Nodo<T> borrar) {
		borrar.setSig(null);
		tam--;
	}

	@Override
	public T removeAt(int index) {
		T info = null;
		if (index >= 0 && index < tam) {
			Nodo<T> borrar = null;
			if (index == 0) {
				borrar = primero;
				primero = primero.getSig();
				borrar.setSig(null);
			} else {
				Nodo<T> ant = primero;
				borrar = primero.getSig();

				for (int i = 1; i < index; i++) {
					borrar = borrar.getSig();
					ant = ant.getSig();
				}

				if (index != tam - 1) {
					ant.setSig(borrar.getSig());
					borrar.setSig(null);
				} else {
					ant.setSig(null);
				}

			}
			info = borrar.getInfo();
			tam--;
		}
		return info;
	}

	@Override
	public void print() {
		if (isEmpty()) {
			System.out.println("La lista está vacía!!");
		} else {
			Nodo<T> aux = primero;

			while (aux != null) {
				System.out.println(aux.getInfo());
				aux = aux.getSig();
			}
		}

		System.out.println();
	}

	@Override
	public boolean clearList() { // Versión ultra simplificada
		primero = null;
		tam = 0;
		return isEmpty();
	}

	public boolean clearList2() { // Versión recursiva
		if (isEmpty()) { // Caso base - > lista vacía
			return true;
		}
		removeAt(0);
		return clearList2();
	}

	@Override
	public int size() {
		return tam;
	}

}
