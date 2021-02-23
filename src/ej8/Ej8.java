package ej8;

import utilidades.leer;

import java.util.HashSet;
import java.util.Set;

public class Ej8 {
    private static String day;
    private static Set<String> week;

    public static void ejecutar() {
        loadWeek();
        readDay();
        typeOfDay(categorizeDay());
    }

    private static void typeOfDay(String s) {
        System.out.println(s);
    }

    private static void loadWeek() {
        week = new HashSet<>();
        week.add("monday");
        week.add("tuesday");
        week.add("wednesday");
        week.add("thursday");
        week.add("friday");
        week.add("saturday");
        week.add("sunday");
    }

    private static void readDay() {
        System.out.println("Weekday: ");
        day = leer.leerCadena().toLowerCase();
    }

    private static String categorizeDay() {
        if ( week.contains(day) ) {
            if ( day.equals("saturday") || day.equals("sunday") ) {

                return "It's not a business day";
            }

            return "It's a business day";
        }

        return "The entered value is invalid";
    }
}
