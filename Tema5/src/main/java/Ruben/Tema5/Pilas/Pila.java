package Ruben.Tema5.Pilas;

public class Pila {
	private Nodo cima;
	private int tam;
	
	//size
	public int size() {
		return tam;
	}
	
	//isEmpty
	public boolean isEmpty() {
		return cima==null;
	}
	
	//push (meter)
	public void push(Integer info) {
		Nodo nuevo = new Nodo(info);
		if (!isEmpty()) {
			nuevo.setSig(cima);
			
		}
		cima=nuevo;
		tam++;
	}
	
	//pop (sacar)
	public Integer pop() {
		if (isEmpty()) {
			Nodo borrar = cima;
			cima=cima.getSig();
			borrar.setSig(null);
			return borrar.getInfo();
		} else {
			return null;
		}
	}
	
	//peak devolver cima pero no borrarla
	public Integer peak() {
		
	}
	
	//print
	public void print() {
		
	}
}