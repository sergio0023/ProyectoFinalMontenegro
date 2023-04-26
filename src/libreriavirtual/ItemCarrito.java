package libreriavirtual;


public class ItemCarrito {
	Producto producto;
	int cantidad;
	boolean copiaFisica;
	private double precioItem;
	
	public double precioVenta() {
	 return  producto.getPrecioCompra()*1.08*cantidad;
	
	}
    	
		
		public double precioTotal() {
		if (producto instanceof Libro) {
			//Es libro
			if (copiaFisica) {
				return producto.getPrecioCompra()*1.18*cantidad;
			}else {
				return producto.getPrecioCompra()*1.08*cantidad;
			}
		}else {
			//Es revista
			if (copiaFisica) {
				return producto.getPrecioCompra()*1.22*cantidad;
			}else {
				return producto.getPrecioCompra()*1.12*cantidad;
		}
	}}
	
	public double getPrecioItem() {
		return precioItem;
	}
	public void setPrecioItem(double precioItem) {
		this.precioItem = precioItem;
	}


	public ItemCarrito(Producto producto, int cantidad) {
		super();
		this.producto = producto;
		this.cantidad = cantidad;
	}
	

	public ItemCarrito(Producto producto, int cantidad, boolean copiaFisica) {
		super();
		this.producto = producto;
		this.cantidad = cantidad;
		this.copiaFisica = copiaFisica;
	}

	public void mostrarItem() {
		System.out.println("Articulo: "+producto.getNombre()+ " - Cantidad: "+cantidad+ " - PrecioVenta: $"+precioTotal());
		System.out.println("- - - - - - - - ");
	  
				
	}		
}
