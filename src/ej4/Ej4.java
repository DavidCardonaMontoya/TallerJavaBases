package ej4;

import utilidades.leer;

public class Ej4 {
    private static double precio;
    private static final double IVA = 0.21;

    private static double calcularPrecio(){

        return precio*(1+IVA);
    }

    public static void ejecutar() {
        System.out.println("Precio base del producto: ");
        precio = leer.leerNumeroDecimal();
        if (leer.error) {
            System.out.println("Valor inválido para el precio del producto.");
        }
        else {
            System.out.println("Precio del producto con IVA: " + calcularPrecio());
        }
    }
}
