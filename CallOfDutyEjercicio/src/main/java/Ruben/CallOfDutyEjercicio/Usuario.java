package Ruben.CallOfDutyEjercicio;

public class Usuario {
	private String nombre;
	private int espaciosMochila;
	private Arma armaPrincipal;
	private Arma armaSecundaria;
	//private ArrayList<Accesorio> accesorios;
	private Accesorio [] accesorios;
	
	public Usuario (String nombre, int espaciosMochila, Arma armaPrincipal, Arma armaSecundaria, Accesorio[] accesorios) {
		this.nombre = nombre;
		this.espaciosMochila = espaciosMochila;
		this.armaPrincipal = armaPrincipal;
		this.armaSecundaria = armaSecundaria;
		this.accesorios = accesorios;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEspaciosMochila() {
		return espaciosMochila;
	}

	public void setEspaciosMochila(int espaciosMochila) {
		this.espaciosMochila = espaciosMochila;
	}

	public Arma getArmaPrincipal() {
		return armaPrincipal;
	}

	public void setArmaPrincipal(Arma armaPrincipal) {
		this.armaPrincipal = armaPrincipal;
	}

	public Arma getArmaSecundaria() {
		return armaSecundaria;
	}

	public void setArmaSecundaria(Arma armaSecundaria) {
		this.armaSecundaria = armaSecundaria;
	}

	public Accesorio[] getAccesorios() {
		return accesorios;
	}

	public void setAccesorios(Accesorio[] accesorios) {
		this.accesorios = accesorios;
	}
	
	
	
}
