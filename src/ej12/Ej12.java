package ej12;

import utilidades.leer;

public class Ej12 {
    private static StringBuilder frase1;
    private static StringBuilder frase2;
    private static int numCoincidencias;

    public static void ejecutar() {
        numCoincidencias = 0;
        leerFrases();
        if (sonIguales()){
            System.out.println("Frases iguales");
        }
        igualarLongitudes();
        encontrarDiferencias();
        mostrarDiferencias();
    }

    private static void mostrarDiferencias() {
        System.out.println(frase1.toString());
        System.out.println(frase2.toString());
        System.out.println("Número de caracteres diferentes: " + (frase1.length()-numCoincidencias));
    }

    private static void igualarLongitudes() {
        if ( frase1.length() != frase2.length() ){
            if ( frase1.length() > frase2.length() ){
                completar(frase1.length(), frase2);
            }
            if ( frase1.length() < frase2.length() ) {
                completar(frase2.length(), frase1);
            }
        }
    }

    private static boolean sonIguales() {

        return frase1.toString().equals(frase2.toString());
    }

    private static void leerFrases() {
        System.out.println("Frase 1: ");
        frase1 = new StringBuilder(leer.leerCadena());
        System.out.println("Frase 2: ");
        frase2 = new StringBuilder(leer.leerCadena());
    }

    private static void completar(int lenFraseMayor, StringBuilder fraseMenor) {
        int diferencia = lenFraseMayor - fraseMenor.length();
        String frasePorPegar = " ".repeat(diferencia);
        fraseMenor.append(frasePorPegar);
    }

    private static void encontrarDiferencias() {
        for (int i = 0; i < frase1.length(); i++) {
            if (frase1.charAt(i) == frase2.charAt(i)) {
                frase1.setCharAt(i,'*');
                frase2.setCharAt(i, '*');
                numCoincidencias++;
            }
        }
    }
}
