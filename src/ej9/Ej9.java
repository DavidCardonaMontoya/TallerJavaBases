package ej9;

import utilidades.leer;

public class Ej9 {
    private static StringBuilder textoOriginal;
    private static StringBuilder textoNuevo;

    public static void ejecutar() {
        textoOriginal = new StringBuilder("La sonrisa sera la mejor arma contra la tristeza");
        System.out.println("La frase original es: " + textoOriginal.toString());
        reemplazar('a', 'e');
        leerTextoNuevo();
        adicionar();
        System.out.println("\n"+textoOriginal.toString());
    }

    private static void reemplazar(char letraVieja, char letraNueva) {
        for (int i=0; i<textoOriginal.length(); i++) {
            if (textoOriginal.charAt(i) == letraVieja){
                textoOriginal.replace(i, i+1, Character.toString(letraNueva));
            }
        }
    }

    private static void leerTextoNuevo() {
        System.out.println("Introduzca el texto que desea adicionar: ");
        textoNuevo = new StringBuilder(leer.leerCadena());
    }

    private static void adicionar() {
        textoOriginal.append(textoNuevo);
    }
}
