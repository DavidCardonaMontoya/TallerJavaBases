package ej17;

import java.util.HashMap;

public class Electrodomestico {
    private final String COLOR = "blanco";
    private final char CONSUMO_ENERGETICO = 'F';
    private final double PRECIO_BASE = 100;
    private final double PESO = 5;

    protected double precioBase;
    protected String color;
    protected Character consumoEnergetico;
    protected double peso;

    private HashMap<Character, Integer> tablaPrecios;

    public Electrodomestico() {
        color = COLOR;
        consumoEnergetico = CONSUMO_ENERGETICO;
        precioBase = PRECIO_BASE;
        peso = PESO;
        consumoPorPrecio();
    }

    public Electrodomestico(double precioBase, double peso) {
        this();
        this.precioBase = precioBase;
        this.peso = peso;
    }

    public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
        comprobarColor(color);
        comprobarConsumoEnergetico(consumoEnergetico);
        consumoPorPrecio();
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    private void comprobarConsumoEnergetico(char letra) {
        char[] tiposConsumo = {'A', 'B', 'C', 'D', 'E', 'F'};
        int j = 0;
        for (int i = 0; i < tiposConsumo.length; i++) {
            if (tiposConsumo[i] != letra){
                j++;
            }
        }
        if (j == tiposConsumo.length){
            consumoEnergetico = CONSUMO_ENERGETICO;
        }
    }

    private void comprobarColor(String color) {
        String [] colores = {"blanco", "negro", "azul", "rojo", "gris"};
        int j = 0;
        for (int i = 0; i < colores.length; i++) {
            if (!colores[i].equals(color)){
                j++;
            }
        }
        if (j == colores.length){
            this.color = COLOR;
        }
    }

    protected double precioFinal() {
        return precioBase+tablaPrecios.get(consumoEnergetico) + consumoPorTamanio();
    }

    private void consumoPorPrecio() {
        tablaPrecios = new HashMap<>();
        tablaPrecios.put('A', 100);
        tablaPrecios.put('B', 80);
        tablaPrecios.put('C', 60);
        tablaPrecios.put('D', 50);
        tablaPrecios.put('E', 30);
        tablaPrecios.put('F', 10);
    }

    private double consumoPorTamanio() {
        if (peso <= 19){
            return 10;
        }
        else if (20 <= peso && peso <= 49) {
            return 50;
        }
        else if (50 <= peso && peso <= 79) {
            return 80;
        }
        return 100;
    }
}
