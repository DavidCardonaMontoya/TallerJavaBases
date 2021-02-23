package ej16;

import utilidades.leer;

public class Ejecutable16 {
    public static void ejecutar() {
        String nombre;
        Integer edad;
        Character sexo;
        Double peso;
        Double altura;
        try {
            System.out.println("Nombre: ");
            nombre = leer.leerCadena();
            System.out.println("Edad: ");
            edad = leer.leerNumeroEntero();
            System.out.println("Sexo: ");
            sexo = leer.leerCadena().charAt(0);
            System.out.println("Peso: ");
            peso = leer.leerNumeroDecimal();
            System.out.println("Altura: ");
            altura = leer.leerNumeroDecimal();

            Persona persona1 = new Persona(nombre, edad, sexo, peso, altura);

            Persona persona2 = new Persona("Angélica", 25, 'M');

            Persona persona3 = new Persona();
            persona3.setNombre("Álvaro");
            persona3.setEdad(45);
            persona3.setAltura(1.75);
            persona3.setPeso(80);
            persona3.setSexo('H');

            System.out.println("IMC de la persona 1: " + persona1.interpretarIMC());

            System.out.println("IMC de la persona 2: " + persona2.interpretarIMC());

            System.out.println("IMC de la persona 3: " + persona3.interpretarIMC());

            System.out.println("La persona 1 " + persona1.mostrarSiEsMayorDeEdad());

            System.out.println("La persona 2: " + persona2.mostrarSiEsMayorDeEdad());

            System.out.println("La persona 3: " + persona3.mostrarSiEsMayorDeEdad());

            System.out.println(persona1.toString());

            System.out.println(persona2.toString());

            System.out.println(persona3.toString());

        } catch (NullPointerException e) {
            System.out.println("Ocurrió un error en la lectura.");
        }
    }
}
