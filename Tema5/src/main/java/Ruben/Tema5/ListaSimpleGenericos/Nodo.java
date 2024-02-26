package Ruben.Tema5.ListaSimpleGenericos;

public class Nodo <T>{

	private  T info;
	private Nodo<T> sig;

	public Nodo(T info) {
		this.info = info;
		this.sig = null;
	}

	public T getInfo() {
		return info;
	}

	public void setInfo(T info) {
		this.info = info;
	}

	public Nodo<T> getSig() {
		return sig;
	}

	public void setSig(Nodo sig) {
		this.sig = sig;
	}

	@Override
	public String toString() {
		return "Nodo [info=" + info + ", sig=" + sig + "]";
	}

}
