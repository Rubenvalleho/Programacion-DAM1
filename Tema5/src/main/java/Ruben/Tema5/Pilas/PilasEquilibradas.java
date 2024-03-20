package Ruben.Tema5.Pilas;

import java.util.Stack;

public class PilasEquilibradas {
	
	private final static String PATT_SIGNOS_APERTURA="\\[|\\(|\\{";

	private final static String PATT_SIGNOS_CIERRE="\\]|\\)|\\}";

	 
	 final static String EXPRESION1 = "(1{ {2(5)}5}[3]2)";

	 final static String EXPRESION2 = "(1{{-1[3+6]2{(}))";

	 final static String EXPRESION3 = "(1{)}5}[3]2)";

	 final static String EXPRESION4 = "(1{ {2(5)}5}[3]2)";
	 
	 public Stack<Character> comprobarPila = new Stack<>();
	 
	 public static char[] dividirString(String str) {
		char[] cambio = str.toCharArray();
		
		return cambio;
	 }
	 
	 public void comprobarEquilibrio(char[] arrayCaracteres) {
		 /*for (char caracter : arrayCaracteres) {
			 comprobarPila.add(caracter);
		 }*/
		 
		 for (int i = 0; i < arrayCaracteres.length; i++) {
			if (Character.toString(arrayCaracteres[i]).matches(PATT_SIGNOS_APERTURA)) {
				comprobarPila.push(arrayCaracteres[i]);
			} else if (Character.toString(arrayCaracteres[i]).matches(PATT_SIGNOS_CIERRE)) {
				comprobarPila.push(arrayCaracteres[i]);
			}
		 }
		 
		 for (int i = 0; i < comprobarPila.size(); i++) {
			 System.out.println(comprobarPila.peek());
			 comprobarPila.pop();
		 }
	 }
	 
	 
	 

	public static void main(String[] args) {
		
		final String PATT_SIGNOS_APERTURA="\\[|\\(|\\{";

		final String PATT_SIGNOS_CIERRE="\\]|\\)|\\}";

		 
		 final String EXPRESION1 = "(1{ {2(5)}5}[3]2)";

		 final String EXPRESION2 = "(1{{-1[3+6]2{(}))";

		 final String EXPRESION3 = "(1{)}5}[3]2)";

		 final String EXPRESION4 = "(1{ {2(5)}5}[3]2)";
		 
		 
		 //Comparar un array para ver si está balanceado
		 
		 PilasEquilibradas pilas = new PilasEquilibradas();
		 
		 pilas.comprobarEquilibrio(dividirString(EXPRESION1));
		;
	}

}
