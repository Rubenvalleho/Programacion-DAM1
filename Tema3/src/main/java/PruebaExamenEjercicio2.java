import java.util.Scanner;

public class PruebaExamenEjercicio2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long numero;
		long par = 0;
		long resto;
		long restosuma = 0;
		long suma = 0;
		
		System.out.println("Dame un numero: ");
		numero = sc.nextInt();
		
		do {
			resto=numero%10;
			numero=numero/10;
			if (resto%2==0) {
				par=par*10+resto;
			}
		}
		while (numero>0);
		System.out.println("Estos son los numeros pares: " + par );
		
		do {
			restosuma=par%10;
			suma=suma+restosuma;
			par=par/10;
			
		}
		while (par>0);
				
		
		System.out.println("La suma de todos los pares es: " + suma);
	}
}
