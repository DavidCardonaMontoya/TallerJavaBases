package ej10;

import utilidades.leer;

public class Ej10 {
    private static StringBuilder frase;
    private static StringBuilder fraseSinEspacios;

    public static void ejecutar() {
        System.out.println("Frase: ");
        frase = new StringBuilder(leer.leerCadena());
        quitarEspaciosEnBlanco();
        System.out.println("La frase sin espacios es: " + fraseSinEspacios.toString());
    }

    private static void quitarEspaciosEnBlanco() {
        fraseSinEspacios = new StringBuilder(frase);
        int j = 0;
        int i;
        for (i = 0; i < fraseSinEspacios.length(); i++) {
            if (noEsUnEspacioEnBlanco(fraseSinEspacios, i)) {
                fraseSinEspacios.setCharAt(j++, fraseSinEspacios.charAt(i));
            }
        }
        fraseSinEspacios.delete(j, fraseSinEspacios.length());
    }

    private static boolean noEsUnEspacioEnBlanco(StringBuilder frase, int i) {
        return !Character.isWhitespace(frase.charAt(i));
    }
}
