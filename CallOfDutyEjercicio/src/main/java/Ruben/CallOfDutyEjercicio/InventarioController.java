package Ruben.CallOfDutyEjercicio;

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
	public void addArma(Usuario usuario, int numero) {
		usuario.setArmaPrincipal(armasPrincipales[numero]);
	}
	
	//
	public void addEquipamiento() {
		
	}
	
	//
	public void equiparUsuario () {
		
	}
	
	
	//
	public void desequiparUsuario() {
		
	}
	
}
