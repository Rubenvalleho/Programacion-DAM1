package Ruben.Tema5.PracticaExamen;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class PracticaCollections {
	
	private Collection<Persona> personas;
	
	public PracticaCollections () {
		this.personas = new HashSet<>();
	}
	
	public void addPersona(Persona persona) {
		personas.add(persona);
	}
	
	public void mostrarCollection() {
		Iterator<Persona> iterador = personas.iterator();
		
		while (iterador.hasNext()) {
			Persona muestra = iterador.next();
			System.out.println(muestra);
		}
	}
	
	
	public static void main (String [] args) {
		Collection<Persona> hashPersonas = new HashSet<>();
		Collection<Persona> linkedHashPersonas = new LinkedHashSet<>();
		Collection<Persona> arrayListPersonas = new ArrayList<>();
		Collection<Persona> linkedListPersonas = new LinkedList<>();
		
		Persona persona1 = new Persona("Ruben","Vallejo");
		Persona persona2 = new Persona("Toto", "Toto");
		Persona persona3 = new Persona("Jose", "Jose");
		Persona persona4 = new Persona("Dani", "Dani");
 		
		
		hashPersonas.add(persona2);
		hashPersonas.add(persona3);
		hashPersonas.add(persona1);
		hashPersonas.add(persona4);
		
		linkedHashPersonas.add(persona1);
		linkedHashPersonas.add(persona2);
		linkedHashPersonas.add(persona3);
		linkedHashPersonas.add(persona4);
		
		arrayListPersonas.add(persona1);
		arrayListPersonas.add(persona2);
		arrayListPersonas.add(persona3);
		arrayListPersonas.add(persona4);
		
		linkedListPersonas.add(persona1);
		linkedListPersonas.add(persona2);
		linkedListPersonas.add(persona3);
		linkedListPersonas.add(persona4);
		
		
		Iterator<Persona> iterador = hashPersonas.iterator();
		while(iterador.hasNext()) {
			Persona iterar = iterador.next();
			System.out.println(iterar);
		}
		
		Iterator<Persona> iterador2 = linkedHashPersonas.iterator();
		while(iterador2.hasNext()) {
			Persona iterar = iterador2.next();
			System.out.println(iterar);
		}
		
		/*PracticaCollections practica = new PracticaCollections();
		practica.addPersona(persona1);
		practica.addPersona(persona2);
		
		practica.mostrarCollection();
		
		System.out.println(persona1);
		persona1.aumentarFecha(persona1);
		System.out.println(persona1);*/
		
		Iterator<Persona> iterador3 = arrayListPersonas.iterator();
		
		while(iterador3.hasNext()) {
			Persona iterar = iterador3.next();
			System.out.println(iterar);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Iterator<Persona> iterator4 = linkedListPersonas.iterator();
		
		while(iterator4.hasNext()) {
			Persona iterar = iterator4.next();
			System.out.println(iterar);
		}
	}

}
