package Ruben.Tema3;

public class Avion {
	//Metodos como comportamientos
	
	int cantidadCombustible=1000;
	int alturavuelo=1;
	
	boolean despegar (int cantidadCombustible, int alturaVuelo) {
		
		this.cantidadCombustible=this.cantidadCombustible - cantidadCombustible;
		this.alturavuelo=this.alturavuelo + alturaVuelo;
		
		if (this.cantidadCombustible>0) {
			return true;
		}
		else {
			return false;
		}
		
		//return this.cantidadCombustible;
		
	}
}
