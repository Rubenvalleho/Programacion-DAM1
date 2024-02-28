package Ruben.CallOfDutyEjercicio;

import java.util.Scanner;

public class InventarioController {
	
	private final int TAM_INVENTARIO_DEF = 10;
	private final int TAM_ACCESORIOS_USU = 3;
	
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
					if (armasPrincipales[i]!=null) {
						System.out.println(armasPrincipales[i]);
					}
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
					if (armasSecundarias[i]!=null) {
						System.out.println(armasSecundarias[i]);
					}
					
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
						armasSecundarias[i] = new ArmaSecundaria(espacio, nombreArmaSecundaria, dps, tipoArma);
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
			if (accesorios[i]!=null) {
				System.out.println(accesorios[i]);
			}
			
		}
		
		System.out.println("\nEscribe el nombre del accesorio: ");
		String nombre = scanner.next();
		System.out.println("\nEscribe el espacio que ocupa: ");
		int espacio = scanner.nextInt();
		System.out.println("\nEscribe la utilidad del accesorio: ");
		String utilidad = scanner.next();
		
		for (int i = 0; i < accesorios.length; i++) {
			if (accesorios[i]==null) {
				accesorios[i] = new Accesorio(espacio, nombre, utilidad);
				break;
			}
		}
		
		System.out.println("\nAccesorio añadido");
		for (int i = 0; i < accesorios.length - 1; i++) {
			if (accesorios[i]!=null) {
				System.out.println(accesorios[i]);
			}
			
		}
	}
	
	//
	public void equiparUsuario (Usuario usuario) {
		Scanner scanner = new Scanner(System.in);
		mostrarInventario();
		System.out.println("\nElige el ID de un arma principal: ");
		int armaPrincipal = scanner.nextInt();
		System.out.println("\nElige el arma secundaria: ");
		int armaSecundaria = scanner.nextInt();
		System.out.println("\nElige el primer accesorio: ");
		int primerAccesorio = scanner.nextInt();
		System.out.println("\nElige el segundo accesorio: ");
		int segundoAccesorio = scanner.nextInt();
		System.out.println("\nElige el tercer accesorio: ");
		int tercerAccesorio = scanner.nextInt();
		
		for (int i = 0; i < armasPrincipales.length -1; i++) {
			if (armasPrincipales!=null) {
				if (armasPrincipales[i].getId() == armaPrincipal) {
					usuario.setArmaPrincipal(armasPrincipales[i]);
				}
			}
			
		}
		
		for (int i = 0; i < armasSecundarias.length - 1; i++) {
			if (armasSecundarias[i].getId() == armaSecundaria) {
				usuario.setArmaSecundaria(armasSecundarias[i]);
			}
		}
		
		Accesorio [] accesoriosUsuarios = new Accesorio [TAM_ACCESORIOS_USU];
		for (int i = 0; i < accesorios.length - 1; i++) {
			if (accesorios[i].getId() == primerAccesorio) {
				accesoriosUsuarios[0] = (Accesorio) accesorios[i]; 
			}
			
			if (accesorios[i].getId() == segundoAccesorio) {
				accesoriosUsuarios[1] = (Accesorio) accesorios[i];
			}
			
			if (accesorios[i].getId() == tercerAccesorio) {
				accesoriosUsuarios[2] = (Accesorio) accesorios[i];
			}
		}
		usuario.setAccesorios(accesoriosUsuarios);
		System.out.println("\nTodo equipado.");
		usuario.toString();
	}
	
	
	//
	public void desequiparUsuario(Usuario usuario) {
		Scanner scanner = new Scanner (System.in);
		System.out.println(usuario.toString());
		
		System.out.println("\n¿Que quieres desequipar? \n[1] Arma principal \n[2] Arma secundaria \n[3]Accesorios");
		int desequipar = scanner.nextInt();
		
		if (desequipar == 1) {
			usuario.setArmaPrincipal(null);
		}
		else if (desequipar == 2) {
			usuario.setArmaSecundaria(null);
		}
		else if (desequipar == 3) {
			usuario.getAccesorios().toString();
			System.out.println("\nSelecciona el accesorio a desequipar: ");
			String nombreAccesorio = scanner.next();
			
			for (int i = 0; i < usuario.getAccesorios().length; i++) {
				if (usuario.getAccesorios()[i].getNombre() == nombreAccesorio) {
					usuario.getAccesorios()[i] = null;
				}
			}
		}
		else {
			System.out.println("No escribiste un numero valido");
			desequiparUsuario(usuario);
		}
	}
	
}
