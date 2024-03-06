package Ruben.Tema5.Pilas;

public class Nodo {
	
	private Integer info;
	private Nodo sig;
	
	public Nodo(Integer info) {
		this.info = info;
	}
	public Integer getInfo() {
		return info;
	}
	public void setInfo(Integer info) {
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
