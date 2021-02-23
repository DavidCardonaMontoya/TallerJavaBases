package ej14;

import utilidades.leer;

public class Ej14 {
    private static Double numero;

    public static void ejecutar() {
        System.out.println("Introduzca un número: ");
        numero = leer.leerNumeroDecimal();
        if (leer.error) {
            System.err.println("Valor inválido");
        } else {
            imprimir();
        }
    }

    private static void imprimir() {
        double num = numero.doubleValue();
        if (num > 1000) {
            System.err.println("El número introducido no puede ser mayor a 1000.");
        } else {
            int i = 0;
            while (num <= 1000) {
                i++;
                if (i % 10 == 0) {
                    System.out.println();
                }
                System.out.print(num+"\t");
                num += 2;
            }
            System.out.println();
        }
    }
}
