package Ruben.Tema4.Ejercicios15Enero;

public class Ejercicio10_15Ene {

	public static void main(String[] args) {
		int [][] cuadroMagico = { {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1} };
		int [] arrayFilas = new int [cuadroMagico.length];
		int [] arrayColumnas = new int [cuadroMagico[0].length];
		int arrayDiagonal1 = 0;
		int arrayDiagonal2 = 0;
		boolean comprobarFilas = false;
		boolean comprobarColumnas = false;
		boolean comprobarDiagonales = false;
		boolean comprobarTodo = false;
		
		for (int i = 0; i < cuadroMagico.length; i++) {
			for (int e = 0; e < cuadroMagico[i].length; e++) {
				System.out.print("|" + cuadroMagico[i][e] + "|");
			}
			System.out.println("");
		}
		
		for (int i = 0; i < cuadroMagico.length; i++) {
			for (int e = 0; e < cuadroMagico[i].length; e++) {
				arrayFilas[i] += cuadroMagico [i][e]; 
			}
		}
		
		//Comparación de las posiciones
		for (int i = 0; i < arrayFilas.length - 1; i++) {
			if (arrayFilas[i]==arrayFilas[i+1]) {
				comprobarFilas = true;
			}
			else {
				comprobarFilas = false;
			}
		}
		
		for (int i = 0; i < cuadroMagico[0].length; i++) {
			for (int e = 0; e < cuadroMagico.length; e++) {
				arrayColumnas[i] += cuadroMagico [e][i];
			}
		}
		
		for (int i = 0; i < arrayColumnas.length - 1; i++) {
			if (arrayColumnas[i]==arrayColumnas[i+1]) {
				comprobarColumnas = true;
			}
			else {
				comprobarColumnas = false;
			}
		}
		
		
		//Calculo de la diagonal de izquierda a derecha
		for (int i = 0; i < cuadroMagico.length; i++) {
			arrayDiagonal1 += cuadroMagico[i][i];
		}
		
		//Calculo de la diagonal de derecha a izquierda
		for (int i = 0; i < cuadroMagico.length; i++) {
			arrayDiagonal2 += cuadroMagico[i][cuadroMagico.length -i -1];
		}
		
		if (arrayDiagonal1 == arrayDiagonal2) {
			comprobarDiagonales = true;
		}
		
		if (comprobarDiagonales && comprobarFilas && comprobarColumnas ) {
			for (int i = 0; i < 1; i++) {
				if (arrayFilas[i] == arrayColumnas[i]) {
					comprobarTodo = true; 
				}
				else {
					comprobarTodo = false;
				}
				if (comprobarTodo) {
					if (arrayColumnas[i] == arrayDiagonal1) {
						comprobarTodo = true;
					}
					else {
						comprobarTodo = false;
					}
				}
			}
		}
		System.out.println(arrayDiagonal2);
		System.out.println(arrayDiagonal1);
		System.out.println(comprobarFilas);
		
		if (comprobarTodo) {
			System.out.println("Es un cuadro mágico.");
		}
		else {
			System.out.println("No es un cuadro mágico");
		}
	}
}
