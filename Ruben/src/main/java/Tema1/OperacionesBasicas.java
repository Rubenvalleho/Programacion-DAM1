package Ruben.Alonso.DAM.Tema1;

public class OperacionesBasicas {

	public static void main(String[] args) {
		// Definir operador 1 y 2, y resultado de diferentes operaciones.
		double operador1=0;
		double operador2=0;
		
		final double suma=operador1+operador2;
		final double resta=operador1-operador2;
		final double división=operador1/operador2;
		final double multiplicación=operador1*operador2;
		final double porcentaje=operador1%operador2;
		
		System.out.println("El resultado de la suma es: " + suma);
		System.out.println("El resultado de la resta es: " + resta);
		System.out.println("El resultado de la división es: " + división);
		System.out.println("El resultado de la multiplicación es: " + multiplicación);
		System.out.println("El resultado del porcentaje es: " + porcentaje+"%");
	}

}
