package ej7;

import utilidades.leer;

public class Ej7 {
    private static Double numero;

    private static boolean esNegativo() {

        return numero < 0;
    }

    public static void ejecutar() {
        do {
            System.out.println("Ingrese un número no negativo: ");
            numero = leer.leerNumeroDecimal();
            if (leer.error) {
                System.out.println("Valor inválido.");
                break;
            }
        } while ( esNegativo() );
        if (!leer.error){
            System.out.println("Número: " + numero);
        }
    }
}
