package Ruben.Tema5.Listas;

public class Lista {
	
	private Nodo primero;
	private int tam = 0;
	
	//Metodo para añadir objetos a la lista
	public void add(String info) {
		Nodo nuevo = new Nodo(info);
		
		if (primero == null) {
			primero = nuevo;
		}
		else {
			Nodo aux = primero;
			
			while (aux.getSig() != null) {
				aux = aux.getSig();
			}
			
			aux.setSig(nuevo);
		}
		tam++;
	}
	
	//Metodo para eliminar objetos de la lista
	public void remove (int index) {
		Nodo borrar = null;
		
		if ((!isEmpty())&&(index<=tam)&&(index>=0)) {
			if (index==0) {
				borrar = primero;
				primero = primero.getSig();
			}
			else {
				borrar = primero.getSig();
				Nodo anteriorNodo = primero;
				
				for (int i = 1; i < index; i++) {
					borrar = borrar.getSig();
					anteriorNodo = anteriorNodo.getSig();
				}
				if (index == tam-1) {
					anteriorNodo.setSig(null);
					anteriorNodo.setInfo(borrar.getInfo());
				}
				else {
					anteriorNodo.setSig(borrar.getSig());
					borrar.setSig(null);
					tam--;
				}
			}
		}
	}
	
	public void print() {
		Nodo aux = primero;
		
		while(aux != null) {
			System.out.println(aux.getInfo());
			aux = aux.getSig();
		}
	}
	
	public int size() {
		Nodo aux = primero;
		int contador = 0;
		
		while(aux != null) {
			contador++;
			aux = aux.getSig();
		}
		
		return contador;
		//return tam;
	}
	
	public boolean isEmpty() {
		if (primero==null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/*public boolean isEmpty() {
		return tam == 0;
	}*/
	
	/*public boolean isEmpty() {
		return primero==null;
	}*/

}
