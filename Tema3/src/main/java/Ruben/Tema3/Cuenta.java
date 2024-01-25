package Ruben.Tema3;

import java.util.Scanner;

public class Cuenta {
	private String titular;
	private double cantidad;
	
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getCantidad() {
		return cantidad;
	}
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	
	//Constructor de las dos a la vez
	public Cuenta(String titular, double cantidad) {
		this.titular = titular;
		this.cantidad = cantidad;
	}
	
	//Constructores de cada atributo invidual
	public Cuenta (String titular) {
		this.titular = titular;
	}
	public Cuenta (double cantidad) {
		this.cantidad = cantidad;
	}
	
	//Metodo para ingresar dinero usando escaner en el main
	public void ingresar (double cantidad) {
		if (cantidad<=0) {
			System.out.println("No puedes meter una cantidad menor que 0");
		}
		else {this.cantidad+=cantidad;}
	}
	public void retirar (double cantidad) {
		if (cantidad>this.cantidad) {
			System.out.println("No puedes retirar más dinero del que tienes");
		}
		else {this.cantidad-=cantidad;}
	}
	@Override //Sobreescribe
	public String toString() {
		return "Cuenta:\n Titular: " + titular + "\n Cantidad: " + cantidad;
	}
	
}
