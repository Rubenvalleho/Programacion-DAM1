package Ruben.Videoclub.data;

import java.util.Collection;
import java.util.HashSet;
import java.util.Scanner;

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
	
	public Pelicula buscarPelicula(String codigoPelicula) {
		for (Pelicula pelicula : setPeliculas) {
			if (pelicula.getCodigoPelicula().equals(codigoPelicula)) {
				return pelicula;
			}
		}
		return null;
	}
	
	public Cliente buscarCliente(String codigoCliente) {
		for (Cliente cliente : setClientes) {
			if (cliente.getNumeroCarnet().equals(codigoCliente)) {
				return cliente;
			}
		}
		return null;
	}
	
	public HashSet<Prestamo> getPrestamos() {
		return (HashSet<Prestamo>) setPrestamos;
	}
	
	public void solicitarPrestamo(String codigoCliente) {
		Scanner scanner = new Scanner (System.in);
		String codigo;
		
		if (!buscarCliente(codigoCliente).getMorosidad()) {
			System.out.println("\nElige una de las siguientes peliculas: ");
			for (Pelicula peli : setPeliculas) {
				System.out.println("\n"+peli);
			}
			System.out.println("\nTeclee un código: ");
			codigo = scanner.next();
			
			for (Pelicula peli : setPeliculas) {
				if (peli.getCodigoPelicula().equals(codigo)) {
					setPrestamos.add(new Prestamo(buscarCliente(codigoCliente), peli));
				}
			}
		} else {
			System.out.println("\nCliente moroso, no puede recibir prestamos.");
		}
	}
}
