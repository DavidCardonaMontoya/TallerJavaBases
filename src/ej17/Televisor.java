package ej17;

public class Televisor extends Electrodomestico {
    private final int RESOLUCION = 20;
    private final boolean SINTONIZADORTDT = false;

    private int resolucion;
    private boolean sintonizadorTDT;

    public Televisor() {
        super();
        this.resolucion = RESOLUCION;
        this.sintonizadorTDT = SINTONIZADORTDT;
    }

    public Televisor(double precio, double peso) {
        super(precio, peso);
    }

    public Televisor(double precioBase, String color, char consumoEnergetico, double peso, int resolucion, boolean sintonizadorTDT) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public int getResolucion() {
        return resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    @Override
    protected double precioFinal() {
        double precioF = super.precioFinal();
        if (resolucion > 40) {
            precioF *= (1.3);
        }
        if (sintonizadorTDT) {
            precioF += 50;
        }
        return precioF;
    }
}
