package Ruben.Alonso.DAM.Tema1;

import java.util.Scanner;

public class Ejercicio8David {
	public static void main(String[] args) {
		
		System.out.println("Escribe tres numeros y comprobaremos si estan ordenados");
		
		Scanner sc = new Scanner(System.in);
		double numero1= sc.nextDouble();
		double numero2=sc.nextDouble();
		double numero3=sc.nextDouble();
		
		boolean opcion1= (numero1<=numero2)&&(numero2<=numero3)&&(numero1<numero3); // 1 2 3
		boolean opcion2= (numero1<=numero2)&&(numero2>=numero3)&&(numero1<numero3); // 1 3 2
		boolean opcion3= (numero1>=numero2)&&(numero2<=numero3)&&(numero1<numero3); // 2 1 3
		boolean opcion4= (numero1<=numero2)&&(numero2>=numero3)&&(numero1>numero3); // 2 3 1 
		boolean opcion5= (numero1>=numero2)&&(numero2<=numero3)&&(numero1>numero3); // 3 1 2
		//boolean opcion6= (numero1>=numero2)&&(numero2>=numero3)&&(numero1>numero3);  3 2 1
		
		
		System.out.println(
				opcion1 ? "Los numeros estan en orden: " + numero1 + " " + numero2 + " " + numero3 : 
				opcion2 ? "Los numeros no estan ordenados, el orden sería: " + numero1 + " " + numero3 + " " + numero2 : 
				opcion3 ? "Los numeros no estan ordenados, el orden sería: " + numero2 + " " + numero1 + " " + numero3 : 
				opcion4 ? "Los numeros no estan ordenados, el orden sería: " + numero3 + " " + numero1 + " " + numero2 : 
				opcion5 ? "Los numeros no estan ordenados, el orden sería: " + numero2 + " " + numero3 + " " + numero1 : 
						  "Los numeros no estan ordenados, el orden sería: " + numero3 + " " + numero2 + " " + numero1);
		
		sc.close();
	}
}
