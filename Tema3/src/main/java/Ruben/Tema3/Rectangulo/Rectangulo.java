package Ruben.Tema3.Rectangulo;

public class Rectangulo {
	int altura;
	int longitud;
	
	public Rectangulo (int altura, int longitud) {
		this.altura = altura;
		this.longitud = longitud;
	}
	public int getAltura() {
		return altura;
	}
	public int getLongitud() {
		return longitud;
	}
	
	public static void visualizarRectangulo(int altura, int longitud) {
		for (int o=0; o<longitud; o++) {
			for (int i=0; i<altura; i++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}
