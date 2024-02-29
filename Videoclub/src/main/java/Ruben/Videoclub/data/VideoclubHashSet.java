package Ruben.Videoclub.data;

import java.util.Collection;
import java.util.HashSet;

import Ruben.Videoclub.domain.Cliente;
import Ruben.Videoclub.domain.Pelicula;
import Ruben.Videoclub.domain.Prestamo;

public class VideoclubHashSet {

	private Collection <Cliente> setClientes;
	private Collection <Prestamo> setPrestamos;
	private Collection <Pelicula> setPeliculas;
	
	public VideoclubHashSet () {
		this.setClientes = new HashSet<>();
		this.setPrestamos = new HashSet<>();
		this.setPeliculas = new HashSet<>();
	}
	
	public boolean addCliente (Cliente cliente) {
		return setClientes.add(cliente);
	}
	
	public boolean addPrestamo (Prestamo prestamo) {
		return setPrestamos.add(prestamo);
	}
	
	public boolean addPeliculas (Pelicula pelicula) {
		return setPeliculas.add(pelicula);
	}
}
