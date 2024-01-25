package Ruben.Alonso.DAM.Tema1;

public class MayorEntreDosValores {
	
	public static void main (String[] args) {
		
	/* 
	1. Pedir por pantalla al usuario que introduzca dos valores (A y B)
	2.  Meter cada uno de esos dos valores en una variable distinta 
	A = primer valor
	B = segundo valor
	3. Calcular cual es el mayor de las dos variables
	Si A es > B escribe “A es mayor”
	Si A==B escribe “Son iguales”
	Si A es < B escribe “B es mayor”
	4. Sacar el resultado escrito por pantalla
	 */
	int A,B; //Aquí estamos definiendo las variables
	A=3;
	B=3;
	
	if (A>B) {
		System.out.println("A es mayor.");
		} else if (B>A) {
			System.out.println("B es mayor.");
		} else 
			System.out.println("Son iguales.");
	} 
}