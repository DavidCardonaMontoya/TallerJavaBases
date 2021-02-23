package ej1y2;

import utilidades.leer;

public class Ej1y2 {

    private static double[] numeros;

    private static int comparar(){
        if ( numeros[0] < numeros[1] ) {
            return -1;

        } else if ( numeros[0] == numeros[1] ) {

            return 0;
        }

        return 1;
    }

    public static void ejecutar() {
        numeros = new double[2];

        System.out.println("Número 1: ");
        Double numero1 = leer.leerNumeroDecimal();
        boolean existeError = leer.error;

        System.out.println("Número 2: ");
        Double numero2 = leer.leerNumeroDecimal();
        existeError = existeError && leer.error;

        if (existeError) {
            System.err.println("Algún número ingresado era inválido.");
        } else {
            numeros[1] = numero1;
            numeros[0] = numero2;

            switch (comparar()) {
                case -1:
                    System.out.println(numeros[0] + " < " + numeros[1]);
                    break;
                case 0:
                    System.out.println(numeros[0] + " = " + numeros[1]);
                    break;
                case 1:
                    System.out.println(numeros[0] + " > " + numeros[1]);
                    break;
                default:
                    System.err.println("No son comparables.");
                    break;
            }
        }

    }
}
