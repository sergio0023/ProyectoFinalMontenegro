package libreriavirtual;

import java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {
		
		//GENERAR PRODUCTO
		Libro lib1 =new Libro("Mundo",111,10.0);
		Revista rev1 = new Revista("Atlas",100,10.0);
		Revista rev2 = new Revista("Deportivo",105,10.0);
		Libro lib2 = new Libro("El universo",150,10.0);
		Revista rev3 = new Revista("Gourmet",200,15.0);
		
			
		//CREO CARRITO DE COMPRAS  
		CarritoCompra c = new CarritoCompra();
		
		
		//GENERAR ITEMS
		ItemCarrito i1 = new ItemCarrito(rev1,10,true);
		ItemCarrito i2 = new ItemCarrito(lib1,10,true);
		ItemCarrito i3 = new ItemCarrito(rev2,10,false);
    	ItemCarrito i4 = new ItemCarrito(lib2,10,false);
		ItemCarrito i5 = new ItemCarrito(rev3,10,true);
		
		
		//AGREGAR ITEMS
		c.agregarItem(i1);
		c.agregarItem(i2);
		c.agregarItem(i3);	
		c.agregarItem(i4);
		c.agregarItem(i5);
		
		//MUESTRO LOS PRODUCTOS ASOCIADOS AL CARRITO
		c.mostrarCarrito();

	}

}
