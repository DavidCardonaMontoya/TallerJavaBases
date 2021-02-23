package ej3;

import utilidades.leer;

public class Ej3 {
    private static double r;

    private static double calcularArea(){

        return Math.PI*Math.pow(r, 2);
    }

    public static void ejecutar() {
        System.out.println("\nRadio del círculo: ");
        r = leer.leerNumeroDecimal();
        if (leer.error) {
            System.out.println("Valor inválido para el radio.");
        } else {
            System.out.println("Área del círculo: " + calcularArea()+"\n");
        }
    }
}
