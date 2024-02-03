package Ruben.Tema5.ListaSimple2;

public class Nodo {
	
	private Persona persona;
	private Nodo sig;
	
	public Nodo(Persona persona) {
		this.persona = persona;
	}
	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	public Nodo getSig() {
		return sig;
	}
	public void setSig(Nodo sig) {
		this.sig = sig;
	}
	@Override
	public String toString() {
		return "Nodo [Persona=" + persona + ", sig=" + sig + "]";
	}


}
