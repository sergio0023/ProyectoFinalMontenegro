package libreriavirtual;

import java.util.ArrayList;
import java.util.List;

 class CarritoCompra {
private ArrayList<ItemCarrito> items;

public CarritoCompra() {
	this.items = new ArrayList<ItemCarrito>();
}
public void agregarItem(ItemCarrito ic) {
	this.items.add(ic);
}
public void quitarItem(ItemCarrito ic) {
	this.items.remove(ic);
}

public void mostrarCarrito() {
	if (items.isEmpty()) System.out.println("No hay productos en el carrito");
	else {
		for(ItemCarrito i : items) {
			i.mostrarItem();
		}
	}
}

}
