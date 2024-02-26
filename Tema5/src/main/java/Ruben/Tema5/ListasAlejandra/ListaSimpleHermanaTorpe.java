package Ruben.Tema5.ListasAlejandra;

/**
 * @author Fran
 * 
 *         Esta lista simplemente es menos eficiente. No tiene control de tamaño
 *         en un atributo y no está refactorizada.
 * 
 */
public class ListaSimpleHermanaTorpe implements Lista {

	private Nodo primero;

	public ListaSimpleHermanaTorpe() {
		primero = null;
	}

	@Override
	public boolean isEmpty() {
		return primero == null;
	}

	@Override
	public Persona getFirst() {
		Persona persona = null;
		if (!isEmpty()) {
			persona = primero.getInfo();
		}
		return persona;
	}

	@Override
	public Persona getLast() {
		if (!isEmpty()) {
			Nodo aux = primero;
			while (aux.getSig() != null) {
				aux = aux.getSig();
			}
			return aux.getInfo();
		}
		return null;
	}

	@Override
	public void insertAtBegin(Persona info) {
		Nodo nuevo = new Nodo(info);
		if (isEmpty()) {
			primero = nuevo;
		} else {
			nuevo.setSig(primero);
			primero = nuevo;
		}
	}

	@Override
	public void insertAtEnd(Persona info) {
		if (isEmpty()) {
			insertAtBegin(info);
		} else {
			Nodo nuevo = new Nodo(info);
			Nodo aux = this.primero;
			while (aux.getSig() != null) {
				aux = aux.getSig();
			}

			aux.setSig(nuevo);
		}
	}

	@Override
	public void insertAtPosition(Persona info, int index) {
		if (index >= 0 && index <= size()) {
			Nodo nuevo = new Nodo(info);
			// Opciones
			// Inserto al ppio
			// Inserto al final
			// Inserto en una posición concreta
			if (index == 0) {
				insertAtBegin(info);
			} else if (index == size()) {
				insertAtEnd(info);
			} else {
				// Recorro la lista hasta la posición indicada -1
				if (!isEmpty()) {
					Nodo aux = primero;
					for (int i = 1; i < index; i++) {
						aux = aux.getSig();
					}

					nuevo.setSig(aux.getSig());
					aux.setSig(nuevo);
				} else {
					insertAtBegin(info);
				}
			}
		}
	}

	@Override
	public boolean containsInfo(Persona info) {
		if (!isEmpty()) {
			Nodo aux = primero;
			while (aux != null) {
				if (aux.getInfo().equals(info)) {
					return true;
				}
				aux = aux.getSig();
			}
		}
		return false;
	}

	@Override
	public Persona getElementAt(int index) {
		if (!isEmpty() && index >= 0 && index < size()) {
			Nodo aux = primero;
			for (int i = 0; i < index; i++) {
				aux = aux.getSig();
			}
			return aux.getInfo();
		}
		return null;
	}

	@Override
	public boolean removeByInfo(Persona info) {
		if (!isEmpty()) {
			if (primero.getInfo().equals(info)) {
				Nodo borrar = primero;
				primero = primero.getSig();
				borrar.setSig(null);
				// Opcional
				borrar = null;
				return true;
			} else {
				Nodo ant = primero;
				Nodo borrar = primero.getSig();

				while (borrar != null) {
					if (borrar.getInfo().equals(info)) {
						ant.setSig(borrar.getSig());
						borrar.setSig(null);
						// Opcional
						borrar = null;
						return true;
					}

					borrar = borrar.getSig();
					ant = ant.getSig();
				}
			}
		}
		return false;
	}

	@Override
	public Persona removeAt(int index) {
		if (!isEmpty() && index >= 0 && index < size()) {
			if (index == 0) {
				Nodo borrar = primero;
				primero = primero.getSig();
				borrar.setSig(null);
				Persona info = borrar.getInfo();
				// Opcional
				borrar = null;
				return info;
			} else {
				Nodo ant = primero;
				Nodo borrar = primero.getSig();

				for (int i = 1; i < index; i++) {
					borrar = borrar.getSig();
					ant = ant.getSig();
				}

				if (index != size() - 1) {
					ant.setSig(borrar.getSig());
					borrar.setSig(null);
				} else {
					ant.setSig(null);
				}

				Persona info = borrar.getInfo();
				// Opcional
				borrar = null;
				return info;
			}
		}
		return null;
	}

	@Override
	public void print() {
		if (isEmpty()) {
			System.out.println("La lista está vacía!!");
		} else {
			Nodo aux = primero;

			while (aux.getSig() != null) {
				System.out.println(aux.getInfo());
				aux = aux.getSig();
			}
			System.out.println(aux.getInfo());
		}

		System.out.println();
	}


	@Override
	public boolean clearList() { // Versión menos simplificada
		if (!isEmpty()) {
			System.out.println("Borrado...");			
			while (size() != 0) {
				removeAt(0);
			}
			System.out.println("Fin del borrado!!");
		}
		return isEmpty();
	}

	@Override
	public int size() {
		int contador = 0;
		Nodo aux = primero;

		// Recorrido
		while (aux != null) {
			contador++;
			aux = aux.getSig();
		}
		return contador;
	}

}
