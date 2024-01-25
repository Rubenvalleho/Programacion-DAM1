package Ruben.Tema3.Redondear;

public class Redondear {
	private float numero;
	
	public Redondear (float numero) {
		this.numero=numero;
	}
	public void metodoRedondear (float numero) {
		numero = Math.round(numero);
		System.out.println(numero);
	}
	@Override
	public String toString () {
		return "El numero es " + numero;
	}
}
