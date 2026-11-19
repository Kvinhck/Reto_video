package com.krakedev.demo.test;

import com.krakedev.demo.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto p1 = new Producto(2808, "Doritos verdes");
		p1.setDescripcion("Golosinas de maiz en forma de triangulos, sabor a limon picante");
		p1.setPeso(20);
		
		System.out.println("El producto es: " + p1.getNombre());
		System.out.println("El codigo del producto es: " + p1.getCodigo());
		System.out.println("La descripcion del producto es: " + p1.getDescripcion());
		System.out.println("El peso del producto es: " + p1.getPeso() + "g");
	}

}
