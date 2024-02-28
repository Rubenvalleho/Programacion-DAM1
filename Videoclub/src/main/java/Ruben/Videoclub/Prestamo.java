package Ruben.Videoclub;

import java.time.LocalDate;

public class Prestamo {
	
	private String codigoPrestamo;
	private int contador = 1;
	private final String IDPREFIX = "Prestamo_";
	private Cliente cliente;
	private Pelicula pelicula;
	private LocalDate fechaPrestamo;
	private LocalDate fechaDevolucion;
	
	public Prestamo(Cliente cliente, Pelicula pelicula) {
		this.codigoPrestamo = IDPREFIX + contador++;
		this.cliente = cliente;
		this.pelicula = pelicula;
		this.fechaPrestamo = LocalDate.now();
		this.fechaDevolucion = LocalDate.now().plusDays(2);
	}
}
