package libreriavirtual;

import java.time.LocalDate;

public class Libro extends Producto {

	public Libro(String nombre, int codigo, double precio) {
		super(nombre, codigo, precio);
		
	}

	public Libro(String nombre, LocalDate fechaDePublicacion, String editorial, int codigo, double precio) {
		super(nombre, fechaDePublicacion, editorial, codigo, precio);
		
	}
	
	

}
