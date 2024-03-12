package Ruben.Tema5.PracticaExamen;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class PracticaCollections2 {
	
	Collection<Integer> numerosHash;
	Collection<Integer> numerosArrayList;
	Collection<Integer> numerosLinkedList;
	
	public PracticaCollections2() {
		this.numerosHash = new HashSet<>();
		this.numerosArrayList = new ArrayList<>();
		this.numerosLinkedList = new LinkedList<>();
	}

	public static void main(String[] args) {
		PracticaCollections2 practica = new PracticaCollections2();
		
		Collection<Integer> numerosHash = new HashSet<>();
		Collection<Integer> numerosArrayList = new ArrayList<>();
		Collection<Integer> numerosLinkedList = new LinkedList<>();
		
		numerosHash.add(1);
		numerosHash.add(2);
		numerosHash.add(3);
		numerosHash.add(4);
		numerosHash.add(5);
		numerosHash.add(6);
		
		/*Iterator<Integer> iteradorHash = numerosHash.iterator();
		while (iteradorHash.hasNext()) {
			Integer numeroIterar = iteradorHash.next();
			System.out.println(numeroIterar);
		}*/
		
		
		
		
		
		
		numerosArrayList.add(1);
		numerosArrayList.add(2);
		numerosArrayList.add(3);
		numerosArrayList.add(4);
		numerosArrayList.add(5);
		numerosArrayList.add(6);
		
		Iterator<Integer> iteradorArray = numerosArrayList.iterator();
		
		while (iteradorArray.hasNext()) {
			Integer numIterar = iteradorArray.next();
			System.out.println(numIterar);
		}
		
		
		iteradorArray = numerosArrayList.iterator();
		while (iteradorArray.hasNext()) {
			Integer numIterar = iteradorArray.next();
			if (numIterar.equals(2)) {
				iteradorArray.remove();
			}
		}
		
		iteradorArray = numerosArrayList.iterator();
		while (iteradorArray.hasNext()) {
			Integer numIterar = iteradorArray.next();
			System.out.println(numIterar);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Iterator<Integer> iterador2 = numerosArrayList.iterator();
		while(iterador2.hasNext()) {
			Integer iterar = iterador2.next();
			System.out.println(iterar);
		}
		
		
		

	}

}
