package Ruben.Tema4;

import java.util.Scanner;

public class EjercicioArrayAlumnos {
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime un nombre: ");
		String nombre = sc.nextLine();
		System.out.println("Dime una edad: ");
		int edad = sc.nextInt();
		int contador = 0;
		
		
		Alumno alumnos [] = new Alumno[20];
		
		/*for (int i = 0; i<20; i++) {
			alumnos[i]=new Alumno(nombres[(int)(Math.random()*4)], (int)(Math.random()*6+10));
		}*/
		
		Alumno.rellenarArray(alumnos);
		
		for (int i=0; i<20; i++) {
			System.out.println(alumnos[i]);
			
			if (alumnos[i].getNombre().equals(nombre) & alumnos[i].getEdad()==edad){
				contador++;
			}
		}
		
		System.out.println(nombre + " de edad " + edad + " años"+ " se repite " + contador + " veces");
	}

}
