package ej11;

import utilidades.leer;
import java.util.HashMap;

public class Ej11 {
    private static StringBuilder frase;
    private static HashMap<Character, Integer> vocales = new HashMap<>();

    public static void ejecutar() {
        leerFrase();
        contarVocales();
        mostrarVocales();
    }

    private static void mostrarVocales() {
        for (Character letra : vocales.keySet()) {
            System.out.println(letra + " : " + vocales.get(letra));
        }
    }

    private static void contarVocales() {
        iniciarVocales();
        for (int i = 0; i < frase.length(); i++) {
            if (vocales.containsKey(frase.charAt(i))){
                vocales.put(frase.charAt(i), vocales.get(frase.charAt(i))+1);
            }
        }
    }

    private static void leerFrase() {
        System.out.println("Introduzca una frase: ");
        frase = new StringBuilder(leer.leerCadena().toLowerCase());
        System.out.println("La longitud de la frase es: " + frase.length());
    }

    private static void iniciarVocales() {
        vocales.put('a', 0);
        vocales.put('e', 0);
        vocales.put('i', 0);
        vocales.put('o', 0);
        vocales.put('u', 0);
    }
}
