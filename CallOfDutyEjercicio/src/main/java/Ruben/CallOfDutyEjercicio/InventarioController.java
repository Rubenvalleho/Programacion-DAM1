package Ruben.CallOfDutyEjercicio;

import java.util.Scanner;

public class InventarioController {
	
	private final int TAM_INVENTARIO_DEF = 10;
	
	private Equipamiento[] armasPrincipales;
	private Equipamiento[] armasSecundarias;
	private Equipamiento[] accesorios;
	
	private Usuario usuario;
	
	//Constructor de inventario
	public InventarioController() {
		//Meter objetos al array de armas principales
		this.armasPrincipales = new ArmaPrincipal[TAM_INVENTARIO_DEF];
		this.armasPrincipales[0] = new ArmaPrincipal(3, "MP7", 35, "Subfusil");
		this.armasPrincipales[1] = new ArmaPrincipal(5, "AK47", 52, "Fusil de asalto");
		this.armasPrincipales[2] = new ArmaPrincipal(4, "KSG", 40, "Escopeta");
		
		//Meter objetos al array de armas secundarias
		this.armasSecundarias = new ArmaSecundaria[TAM_INVENTARIO_DEF];
		this.armasSecundarias[0] = new ArmaSecundaria(2, "Five-Seven", 20, "Pistola");
		this.armasSecundarias[1] = new ArmaSecundaria(10, "RPG", 100, "Lanzamisiles");
		this.armasSecundarias[2] = new ArmaSecundaria(4, "Executioner", 30, "Revolver");
		
		//Meter objetos al array de accesorios
		this.accesorios = new Accesorio[TAM_INVENTARIO_DEF];
		this.accesorios[0] = new Accesorio (1, "Granada", "Explosión");
		this.accesorios[1] = new Accesorio (2, "Claymore", "Explosión");
	}

	
	private void mostrarArray(Equipamiento[] array, String msg) {
		System.out.println(msg);
		for (Equipamiento item : array) {
			if (item != null) {
				System.out.println(item + "\n");
			}
		}
	}
	
	public void mostrarInventario() {
		mostrarArray(armasPrincipales, "Armas prinicipales: \n");
		mostrarArray(armasSecundarias, "Armas Secundarias: \n");
		mostrarArray(accesorios, "Accesorios: \n");
	}
	
	//
	public void addArma() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("\nElige la clase de arma: \n[1] ARMA PRINCIPAL \n [2] ARMA SECUNDARIA");
		int claseArma = scanner.nextInt();
		
		if (claseArma == 1 || claseArma == 2) {
			
			if (claseArma==1) {
				for (int i = 0; i < armasPrincipales.length; i++) {
					System.out.println(armasPrincipales[i]);
				}
				
				System.out.println("\nEscribe el nombre del arma: ");
				String nombreArmaPrincipal = scanner.next();
				System.out.println("\nEscribe el espacio que ocupa el arma: ");
				int espacio = scanner.nextInt();
				System.out.println("\nEscribe el daño por segundo que hace el arma: ");
				int dps = scanner.nextInt();
				System.out.println("\nEscribe el tipo de arma que es");
				String tipoArma = scanner.next();
				
				for (int i = 0; i < armasPrincipales.length - 1; i++) {
					if (armasPrincipales[i] == null) {
						armasPrincipales[i] = new ArmaPrincipal(espacio, nombreArmaPrincipal, dps, tipoArma);
						break;
					}
				} 
				
				System.out.println("\nArma añadida a armas principales: ");
				for (int i = 0; i < armasPrincipales.length - 1; i++) {
					if (armasPrincipales[i]!=null) {
						System.out.println(armasPrincipales[i]);
					}	
				}
				
			} else {
				for (int i = 0; i < armasSecundarias.length; i++) {
					System.out.println(armasSecundarias[i]);
				}
				
				System.out.println("\nEscribe el nombre del arma: ");
				String nombreArmaSecundaria = scanner.next();
				System.out.println("\nEscribe el espacio que ocupa el arma: ");
				int espacio = scanner.nextInt();
				System.out.println("\nEscribe el daño por segundo que hace el arma: ");
				int dps = scanner.nextInt();
				System.out.println("\nEscribe el tipo de arma que es");
				String tipoArma = scanner.next();
				
				for (int i = 0; i < armasSecundarias.length - 1; i++) {
					if (armasSecundarias[i] == null) {
						armasSecundarias[i] = new ArmaPrincipal(espacio, nombreArmaSecundaria, dps, tipoArma);
						break;
					}
				} 
				
				System.out.println("\nArma añadida a armas secundarias: ");
				for (int i = 0; i < armasSecundarias.length - 1; i++) {
					if (armasSecundarias[i]!=null) {
						System.out.println(armasSecundarias[i]);
					}	
				}
				
			}
			
		} else {
			
			System.out.println("Has elegido un numero incorrecto");
		}
	}
	
	//
	public void addAccesorio() {
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < accesorios.length -1; i++) {
			System.out.println(accesorios[i]);
		}
		
		System.out.println("\nEscribe el nombre del accesorio: ");
		String nombre = scanner.next();
		
	}
	
	//
	public void equiparUsuario () {
		
	}
	
	
	//
	public void desequiparUsuario() {
		
	}
	
}
