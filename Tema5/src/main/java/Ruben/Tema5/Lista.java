package Ruben.Tema5;

public class Lista {
	
	private Nodo primero;
	private int tam = 0;

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
