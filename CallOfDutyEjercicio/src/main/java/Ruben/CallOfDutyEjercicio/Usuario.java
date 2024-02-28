package Ruben.CallOfDutyEjercicio;

import java.util.Arrays;

public class Usuario {
	private String nombre;
	private int espaciosMochila;
	private Equipamiento armaPrincipal;
	private Equipamiento armaSecundaria;
	//private ArrayList<Accesorio> accesorios;
	private Accesorio [] accesoriosUsuario;
	
	public Usuario (String nombre, int espaciosMochila, Equipamiento armaPrincipal, Equipamiento armaSecundaria, Accesorio[] accesoriosUsuario) {
		this.nombre = nombre;
		this.espaciosMochila = espaciosMochila;
		this.armaPrincipal = armaPrincipal;
		this.armaSecundaria = armaSecundaria;
		this.accesoriosUsuario = accesoriosUsuario;
	}
	
	public Usuario (String nombre) {
		this.nombre = nombre;
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
		return (Arma) armaPrincipal;
	}

	public void setArmaPrincipal(Equipamiento armasPrincipales) {
		this.armaPrincipal = armasPrincipales;
	}

	public Arma getArmaSecundaria() {
		return (Arma) armaSecundaria;
	}

	public void setArmaSecundaria(Equipamiento armasSecundarias) {
		this.armaSecundaria = armasSecundarias;
	}

	public Accesorio[] getAccesorios() {
		return accesoriosUsuario;
	}

	public void setAccesorios(Accesorio[] accesoriosUsuario) {
		this.accesoriosUsuario = accesoriosUsuario;
	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", espaciosMochila=" + espaciosMochila + ", armaPrincipal=" + armaPrincipal
				+ ", armaSecundaria=" + armaSecundaria + ", accesorios=" + Arrays.toString(accesoriosUsuario) + "]";
	}
	
	
	
	
}
