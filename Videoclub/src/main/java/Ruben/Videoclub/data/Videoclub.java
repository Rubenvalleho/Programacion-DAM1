package Ruben.Videoclub.data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

import Ruben.Videoclub.domain.Cliente;
import Ruben.Videoclub.domain.Pelicula;
import Ruben.Videoclub.domain.Prestamo;

public class Videoclub {
	
	private Collection <Cliente> listaClientes;
	private Collection <Pelicula> listaPeliculas;
	private Collection <Prestamo> listaPrestamos;
	
	public Videoclub () {
		this.listaClientes = new ArrayList<>();
		this.listaPeliculas = new ArrayList<>();
		this.listaPrestamos = new ArrayList<>();
	}
	
	public boolean addCliente(Cliente cliente) {
		if (!listaClientes.contains(cliente)) {
			return listaClientes.add(cliente);
		}
		return false;
	}
	
	public void addClienteFor(Cliente cliente) {
		boolean dentroLista = false;
		
		for (Cliente iterator : listaClientes) {
			if (iterator.getNumeroCarnet().equals(cliente.getNumeroCarnet()));
			dentroLista = true;
			break;
		}
		if (!dentroLista) {
			listaClientes.add(cliente);
		}
	}
	
	public boolean addPelicula(Pelicula pelicula) {
		if (!listaPeliculas.contains(pelicula)) {
			return listaPeliculas.add(pelicula);
		}
		return false;
	}
	
	public boolean addPrestamo(Prestamo prestamo) {
		if (!listaPrestamos.contains(prestamo)) {
			return listaPrestamos.add(prestamo);
		}
		return false;
	}
	
	
	
	
}
