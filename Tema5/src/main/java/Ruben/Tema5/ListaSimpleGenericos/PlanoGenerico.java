package Ruben.Tema5.ListaSimpleGenericos;

import java.time.LocalDate;

public class PlanoGenerico <T extends Number> {


	T	maxY, minY, maxX, minX;
	
	
	public PlanoGenerico(T maxY, T minY, T maxX, T minX) {
		super();
		this.maxY = maxY;
		this.minY = minY;
		this.maxX = maxX;
		this.minX = minX;
	}

	@Override
	public String toString() {
		return "Plano [maxY=" + maxY + ", minY=" + minY + ", maxX=" + maxX + ", minX=" + minX + "]";
	}


	
	
	public static void main(String[] args) {

		
        PlanoGenerico<Integer> p = new PlanoGenerico<Integer>(2, 2, 0, 0);
        
        PlanoGenerico<Double> d = new PlanoGenerico<Double>(2.2, 3.2, 4.1, 5.2);
         
        System.out.println(p);
        System.out.println(d);
		
        System.out.println(LocalDate.now());
        LocalDate.now().plusDays(2);

	}

	
	
	
	
	
}
