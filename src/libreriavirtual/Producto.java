package libreriavirtual;

import java.time.LocalDate;

public abstract class Producto {
	
	private String nombre;
	private LocalDate fechaDePublicacion;
	private String editorial;
	private int codigo;
	private double precioCompra;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public double getPrecioCompra() {
		return precioCompra;
	}
	public void setPrecioCompra(double precioCompra) {
		this.precioCompra = precioCompra;
	}
	public LocalDate getFechaDePublicacion() {
		return fechaDePublicacion;
	}
	public String getEditorial() {
		return editorial;
	}
	
	public Producto(String nombre, LocalDate fechaDePublicacion, String editorial, int codigo, double precioCompra) {
		super();
		this.nombre = nombre;
		this.fechaDePublicacion = fechaDePublicacion;
		this.editorial = editorial;
		this.codigo = codigo;
		this.precioCompra = precioCompra;
	}
	public Producto(String nombre, int codigo, double precioCompra) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.precioCompra = precioCompra;
		
		
		
	}
	
	

}
