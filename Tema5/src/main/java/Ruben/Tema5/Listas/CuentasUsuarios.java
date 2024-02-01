package Ruben.Tema5.Listas;

import java.util.HashSet;
import java.util.Set;

/*1) Crear clase que construya Cliente
  2) Crear una coleccion para esos objetos clientes
  		Tiene sentido que se pueda repetir clientes? NO
  		Vamos a hacer operaciones de agregar / borrar ??
  		Operaciones de tipo lectura
  		Tienen que estar ordenados
  		
  3) Agregar objetos a esa coleccion
  4) Recorrer
*/

public class CuentasUsuarios {

	public static void main(String[] args) {

		Cliente cl1 = new Cliente ("Enrique Iglesias", "0001", 1000000.00);
		Cliente cl2 = new Cliente ("Rafael Nadal", "0002", 2000000.00);
		Cliente cl3 = new Cliente ("Carmen Lomana", "0003", 3000000.00);
		Cliente cl4 = new Cliente ("David Bisbal", "0004", 1000000.00);
		
		//Usamos el Set con HashSet porque Set es una interfaz y no se pueden instanciar objetos por ello
		Set <Cliente> clientesBanco = new HashSet<> ();
		
		clientesBanco.add(cl1);
		clientesBanco.add(cl2);
		clientesBanco.add(cl3);
		clientesBanco.add(cl4);
		
		
		//Recorremos la coleccion
		
		System.out.println(clientesBanco.toString());	//opcion 1
		
		for (Cliente clientes : clientesBanco) {		//opcion 2
			System.out.println(clientes);
		}
	}

}
