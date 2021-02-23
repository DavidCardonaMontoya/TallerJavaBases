package ej15;

import utilidades.leer;

public class Ej15 {
    private static String elMenu = "\n******GESTIÓN CINEMATOGRÁFICA********"+
        "\n1-NUEVO ACTOR"+
        "\n2-BUSCAR ACTOR"+
        "\n3-ELIMINAR ACTOR"+
        "\n4-MODIFICAR ACTOR"+
        "\n5-VER TODOS LOS ACTORES"+
        "\n6-VER PELÍCULAS DE LOS ACTORES"+
        "\n7-VER CATEGORÍA DE LAS PELÍCULAS DE LOS ACTORES"+
        "\n8-SALIR";

    public static void ejecutar() {
        int opcion;
        do {
            mostrarMenu();
            opcion = leer.leerNumeroEntero();
        } while (opcion != 8);
    }

    private static void mostrarMenu() {
        System.out.println(elMenu);
    }
}
