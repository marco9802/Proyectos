package test;

import domain.*;

public class VentasTest {
	
	public static void main(String[] args) {
		
		Producto producto1=new Producto("Camisa Gucci",15000.00);
		Producto producto2=new Producto("Pantalon CH",10000.00);
		Orden orden1=new Orden();
		orden1.agregarProducto(producto1);
		orden1.agregarProducto(producto2);
		orden1.agregarProducto(producto2);
		orden1.agregarProducto(producto1);
		orden1.agregarProducto(producto2);
		orden1.mostrarOrden();
	}
	
}