package utilidades;

import java.util.Scanner;

public class leer {
    private static Scanner lee;
    public static boolean error;

    public static Double leerNumeroDecimal() {
        error  = false;
        Double numero = null;
        lee = new Scanner(System.in);
        try {
            numero = Double.parseDouble(lee.nextLine());
        } catch (NullPointerException | NumberFormatException e) {
            error = true;
        }
        return numero;
    }

    public static String leerCadena() {
        return lee.nextLine();
    }

    public static Integer leerNumeroEntero() {
        error  = false;
        Integer numero = null;
        lee = new Scanner(System.in);
        try {
            numero = Integer.parseInt(lee.nextLine());
        } catch (NullPointerException | NumberFormatException e) {
            error = true;
        }
        return numero;
    }
}
