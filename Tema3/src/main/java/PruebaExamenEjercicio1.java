import java.util.Scanner;

public class PruebaExamenEjercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double numero;
		double promediototal = 0;
		double promedio5 = 0;
		double promedio4 = 0;
		int cont4 = 0;
		int cont5 = 0;
		System.out.println("Este programa pide 20 notas consecutivas para hacer su promedio (Entre el 1 y el 7)");
		
		for (int i = 1; i<=20; i++ ) {
			System.out.println("Introduce la nota numero " + i + ":");
			numero = sc.nextDouble();
			promediototal+=numero;
			System.out.println(i);
			
			if (numero<1 || numero>7) {
				System.out.println("No es un numero valido");
				i--;
			}
			else if (numero>=5) {
				cont5++;
				promedio5+=numero;
				
			}
			else if (numero<5) {
				cont4++;
				promedio4+=numero;
				
			}
		}
		promediototal=promediototal/20;
		promedio5=promedio5/cont5;
		promedio4=promedio4/cont4;
		System.out.println("El promedio de las notas totales es " + promediototal);
		System.out.println("El promedio de las notas mayores de 5 es " + promedio5);
		System.out.println("El promedio de las notas mayores de 4 es " + promedio4);

	}

}
