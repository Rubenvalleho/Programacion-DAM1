package Ruben.Alonso.DAM.Tema1;

public class Cosecha {

	public static void main(String[] args) {
		
		int CantidadDeVino=25;
		final int BuenaCosecha=25 ;
		
		if (CantidadDeVino>BuenaCosecha) {
			System.out.println("Has tenido una buena cosecha");
		}
		else if (CantidadDeVino==BuenaCosecha) {
			System.out.println("Cuidadito");
		}
		else {
			System.out.println("Has tenido una mala cosecha");
		}
	}

}

