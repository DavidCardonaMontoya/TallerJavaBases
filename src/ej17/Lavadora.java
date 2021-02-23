package ej17;

public class Lavadora extends Electrodomestico {
    private final int CARGA = 5;
    private int carga;

    public Lavadora(){
        super();
        carga = CARGA;
    }

    public Lavadora(double precio, double peso) {
        super(precio, peso);
        this.carga = CARGA;
    }

    public Lavadora(double precioBase, String color, char consumoEnergetico, double peso, int carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    @Override
    protected double precioFinal() {
        double precioF = super.precioFinal();
        if (carga > 30) {
            precioF  += 50;
        }
        return precioF;
    }
}
