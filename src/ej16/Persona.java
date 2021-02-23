package ej16;

import java.util.Random;

public class Persona {
    private String nombre;
    private int edad;
    private int DNI;
    private char sexo;
    private double peso;
    private double altura;

    public Persona() {
        nombre = null;
        edad = 0;
        DNI = 0;
        sexo = 'H';
        peso = 0;
        altura = 0;
        DNI = generaDNI();
    }

    public Persona(String nombre, int edad, char sexo) {
        this();
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        comprobarSexo(sexo);
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        DNI = generaDNI();
        comprobarSexo(sexo);
    }

    private int calcularIMC() {
        Double imc = peso/(altura*altura);
        if (imc.isNaN() || imc.isInfinite()) {
            return -2;
        }
        if (imc < 20) {
            return -1;
        }
        if (20 <= imc && imc <= 25) {
            return 0;
        }
        return 1;
    }

    private boolean esMayorDeEdad() {

        return edad >= 18;
    }

    public String mostrarSiEsMayorDeEdad() {
        if (esMayorDeEdad()) {
            return "Es mayor de edad";
        }
        return "Es menor de edad";
    }

    private void comprobarSexo(char sexo) {
        if (sexo != 'M' && sexo != 'H' ) {
            this.sexo = 'H';
        }
    }

    public String interpretarIMC() {
        int rango = calcularIMC();
        switch (rango) {
            case 1 :
                return "Sobrepeso";
            case 0 :
                return "Peso ideal";
            case -1 :
                return "Por debajo del peso ideal";
            default :
                return "Ocurrió un error";
        }
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", DNI='" + DNI + '\'' +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }

    private int generaDNI() {
        Random aleatorio = new Random();
        int min = 10000000;
        int max = min*10-1;
        return aleatorio.nextInt(max-min) + min;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
