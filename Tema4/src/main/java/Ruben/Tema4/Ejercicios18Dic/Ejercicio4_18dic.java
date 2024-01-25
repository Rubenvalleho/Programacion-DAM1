package Ruben.Tema4.Ejercicios18Dic;

public class Ejercicio4_18dic {

	public static void main(String[] args) {
		String [] [] agenda = new String [4] [2];
		agenda [0] [0] = "Pepito";
		agenda [0] [1] = "Calle Heras";
		agenda [1] [0] = "Antonio";
		agenda [1] [1] = "Calle hola";
		agenda [2] [0] = "Luis";
		agenda [2] [1] = "Calle adios";
		agenda [3] [0] = "José";
		
		for (int i = 0; i<agenda.length; i++) {
			for (int e = 0; e<agenda[i].length; e++) {
				System.out.print(agenda[i][e]);
				System.out.print("| ");
			}
		}
		
		
		
		
		/*System.out.println("En la agenda hay " + agenda.length + " filas y " + agenda[3].length + " columnas");
		System.out.println(agenda[2][0]);*/

	}

}
