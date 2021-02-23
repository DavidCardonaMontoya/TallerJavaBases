package principal;

import ej10.Ej10;
import ej11.Ej11;
import ej12.Ej12;
import ej13.Ej13;
import ej14.Ej14;
import ej15.Ej15;
import ej16.Ejecutable16;
import ej17.Ejecutable17;
import ej18.Ejecutable18;
import ej1y2.Ej1y2;
import ej3.Ej3;
import ej4.Ej4;
import ej5y6.Ej5y6;
import ej7.Ej7;
import ej8.Ej8;
import ej9.Ej9;
import utilidades.leer;

public class Principal {
    public static Integer ejercicio;
    public static void ejecutarEjercicio() {
        switch (ejercicio) {
            case 1:
                Ej1y2.ejecutar();
                break;
            case 2:
                Ej3.ejecutar();
                break;
            case 3:
                Ej4.ejecutar();
                break;
            case 4:
                Ej5y6.ejecutar();
                break;
            case 5:
                Ej7.ejecutar();
                break;
            case 6:
                Ej8.ejecutar();
                break;
            case 7:
                Ej9.ejecutar();
                break;
            case 8:
                Ej10.ejecutar();
                break;
            case 9:
                Ej11.ejecutar();
                break;
            case 10:
                Ej12.ejecutar();
                break;
            case 11:
                Ej13.ejecutar();
                break;
            case 12:
                Ej14.ejecutar();
                break;
            case 13:
                Ej15.ejecutar();
                break;
            case 14:
                Ejecutable16.ejecutar();
                break;
            case 15:
                Ejecutable17.ejecutar();
                break;
            case 16:
                Ejecutable18.ejecutar();
                break;
            case 0:
                System.out.println("Gracias por revisar mi taller. Que te vaya muy bien.");
                break;
            default:
                System.out.println("Opción inválida. Ingrese un número entero entre 1 y 16 para ejecutar un ejercicio. 0 para salir.");
                break;
        }
    }
    
    public static void main(String[] args) {
        
        String menuCadena = "***EJERCICIOS***\n" +
                "Cada ejercicio está asociado con un número del 1 al 16.\n" +
                "Para SALIR ingrese el número cero (0).\n"+
                "NOTA: Los ejercicios 1 y 2 cuentan como un solo ejercicio. Igual para los ejercicios 5 y 6.\n" +
                "Número de ejercicio: ";
        do {
            System.out.println(menuCadena);
            ejercicio = leer.leerNumeroEntero();
            if (leer.error) {
                System.err.println("Debe ser un número.");
                ejercicio = -1;
            } else {
                ejecutarEjercicio();
            }
        } while(ejercicio != 0);


    }
}
