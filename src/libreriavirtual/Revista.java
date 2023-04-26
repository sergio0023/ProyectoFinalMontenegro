package libreriavirtual;

import java.time.LocalDate;

public class Revista extends Producto {

	public Revista(String nombre, int codigo, double precio) {
		super(nombre, codigo, precio); 
		
	}

	public Revista(String nombre, LocalDate fechaDePublicacion, String editorial, int codigo, double precio) {
		super(nombre, fechaDePublicacion, editorial, codigo, precio);
		
	}
	
}
