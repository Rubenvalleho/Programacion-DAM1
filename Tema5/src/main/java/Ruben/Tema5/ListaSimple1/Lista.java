package Ruben.Tema5.ListaSimple1;

public class Lista {

	private Nodo primero;
	private int tam;
	
	//Metodos add, print, size e isEmpty.
	
	public void add(String info) {
		//Creacion de elementos
		Nodo nuevo = new Nodo(info);
		//Antes de añadir ... vemos si esta vacia
		if (primero == null) { //La lista esta completamente vacia
			primero = nuevo;
		}
		else {
			Nodo aux = primero;
			
			//Recorrido
			while (aux.getSig() != null) { //voy a seguir recorriendo la lista
				aux = aux.getSig();		   //nos movemos gracias a las referencias siguientes que tiene cada elemento de la lista
			}
			
			//Asignacion
			aux.setSig(nuevo);			   //Set del nuevo elemento de la lista
		}
		tam++;
	}
	
	public void print() {
		Nodo aux = primero; //iterador aux ...
		
		//Recorrido
		while (aux != null) {
			System.out.println(aux.getInfo());	//Imprimimos la informacion del elemento
			aux = aux.getSig();					//nos movemos gracias a las referencias siguientes que tiene cada elemento de la lista
		}
	}
	
	/*public int size() {
		return tam;
	}*/
	
	public int size() {
		Nodo aux = primero;
		int contador = 1;
		
		//Recorrido
		while (aux.getSig() != null) {
			contador++;
			aux = aux.getSig();
		}
		return contador;
	}
	
	public boolean isEmpty() {
		if (primero==null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//Metodo remove
	public void remove(int index) {
		
		Nodo aBorrar = primero;
		
		//primer elemento
		if ((!isEmpty()) && (index<=tam) && (index>=0)) {
			
			if (index==0) {				//primer elemento se borra
				aBorrar = primero;
				primero = primero.getSig();
			}else {						//recorro hasta llegar al index dado
				aBorrar=primero.getSig();
				Nodo anterior = primero;
				
				for (int i=1; i<index; i++) {
					aBorrar=aBorrar.getSig();
					anterior=anterior.getSig();
				}
				if (index == tam-1) {	//Si el que queremos borrar es el ultimo
					anterior.setSig(null);
				}else { 				//Borrar el del medio
					anterior.setSig(aBorrar.getSig());
					aBorrar.setSig(null);
				}
			}
		}
	}
	
	
	
	/*public boolean isEmpty() {
		return tam ==0;
	}*/
	
	/*public boolean isEmpty() {
		return primero==null;
	}*/
	
	//clase lista, sacamos por pantalla si esta vacia la lista y que use el metodo isEmpty. Si esta vacia añadimos 3 elementos e imprimimos la lista y mostramos el tamaño de nuevo ("El tamaño de la lista es: "). Volvemos a preguntar si la lista esta vacia.
}
