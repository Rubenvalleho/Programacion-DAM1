package Ruben.Tema4.Ejercicios15Enero;

import java.util.Random;


// Comprobar si un array de 5x5 es un cuadro mágico. Se considera un cuadro mágico aquel en el que las filas,
// las columnas y las diagonales suman igual.
public class Array5x5 {

	public static void main(String[] args) {
		
		
		int [] [] array = new int [5] [5];
		int [] filas = new int [array.length];
		int [] columnas = new int [array[0].length];
		int [] diagonales = new int [2];
		Random rand = new Random();
		int posicion=0;
		int fila=0;
		int columna=0;
		int diagonal=0;
		int diagonalInv=0;
		int posInversa=array.length-1;
		boolean comprobar=false;
		
		
		for (int i=0; i<array.length; i++) {					//bucle para rellenar el array (numeros de 1-10)
			for (int j=0; j<array[0].length; j++)  {
				array[i][j]=rand.nextInt(10)+1;
			}
		}
	
		
		while (posicion<array.length) {
			for (int z=0; z<array.length; z++) {
				fila+=array[posicion][z];					//acumula la suma de filas
				columna+=array[z][posicion];				//acumula la suma de columnas
				diagonal+=array[z][z];					//acumula la suma de la diagonal (izquierda-derecha)
				diagonalInv+=array[posInversa][z];		//acumula la suma de la diagonal (derecha-izquierda)
				
				if (posInversa>0) {
					posInversa--;
				}
				
				System.out.print(" |"+array[posicion][z]+"|");	//muestra el array en un 5x5
				
			}
			System.out.print(" = "+fila);						//muestra la suma de filas
			filas[posicion]=fila;
			columnas[posicion]=columna;
			if (posicion<1) {
				diagonales[posicion]=diagonal;
				diagonales[posicion+1]=diagonalInv;
			}
			System.out.println("");
			
			posicion++;
			fila=0;
			columna=0;
		}
		
		
		for (int q=0; q<columnas.length; q++) {					// bucle para mostrar el array "columnas"
			System.out.print(" "+columnas[q]+" ");
		}
		
		System.out.println("\nDiagonales= "+diagonales[0]+" "+diagonales[1]);
		
		for (int w=0; w<filas.length - 1; w++) {
			if (filas[0]==filas[w] && filas [0]==columnas[w] && filas[0]==diagonales[0] && filas[0]==diagonales[1]) {
				comprobar=true;
			}
		}
		
		if (comprobar) {
			System.out.println("Este Array es un Cuadro Magico");
		}
		else {
			System.out.println("Este Array No es un Cuadro Magico");
		}
		
	}

}
