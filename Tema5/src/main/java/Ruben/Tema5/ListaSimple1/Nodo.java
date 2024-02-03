package Ruben.Tema5.ListaSimple1;

public class Nodo {
	
	private String info;
	private Nodo sig;
	
	public Nodo(String info) {
		this.info = info;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public Nodo getSig() {
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
