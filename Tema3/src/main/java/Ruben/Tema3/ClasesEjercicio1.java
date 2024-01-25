package Ruben.Tema3;

import java.util.Scanner;

public class ClasesEjercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		Cuenta cuenta1 = new Cuenta("María Jose", 2000);
		cuenta1.ingresar(300);
		System.out.println(cuenta1);
		
		/*System.out.println("Dime que cantidad quieres añadirle a tu cuenta ");
		int añadir = sc.nextInt();
		cuenta1.ingresar(añadir);
		System.out.println(cuenta1);*/
		
		Cuenta cuenta2 = new Cuenta("Jose Carlos", 3000);
		cuenta2.retirar(3100);
		System.out.println(cuenta2);
		
		Cuenta cuenta3,cuenta4,cuenta5;
		
		cuenta3 = new Cuenta ("Rubén");
		cuenta4 = new Cuenta ("Antonio");
		cuenta5 = new Cuenta ("Alvaro", 4000);
		
		System.out.println(cuenta3.getTitular());
		
		//Prueba Avion
		
		Avion avion1 = new Avion();
		avion1.despegar(200,30000);
		System.out.println(avion1);
	}

}
