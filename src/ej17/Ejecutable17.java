package ej17;

public class Ejecutable17 {
    public static void ejecutar() {
        Electrodomestico[] electrodomesticos = new Electrodomestico[10];
        electrodomesticos[0] = new Lavadora(1800, 17);
        electrodomesticos[1] = new Televisor();
        electrodomesticos[2] = new Electrodomestico();
        electrodomesticos[3] = new Lavadora();
        electrodomesticos[4] = new Electrodomestico();
        electrodomesticos[5] = new Televisor(1000, "rojo", 'F', 10, 1024, true);
        electrodomesticos[6] = new Electrodomestico();
        electrodomesticos[7] = new Lavadora();
        electrodomesticos[8] = new Televisor();
        electrodomesticos[9] = new Televisor();

        double totalPreciosTVs = 0;
        double totalPreciosLav = 0;
        double totalPreciosElectr = 0;

        for (Electrodomestico electrodomestico : electrodomesticos) {
            if (electrodomestico instanceof Lavadora) {
                totalPreciosLav += electrodomestico.precioFinal();
            } else if (electrodomestico instanceof Televisor) {
                totalPreciosTVs += electrodomestico.precioFinal();
            } else {
                totalPreciosElectr += electrodomestico.precioFinal();
            }
        }
        System.out.println("\nTotal precios lavadoras: " + totalPreciosLav);
        System.out.println("Total precios Televisores: " + totalPreciosTVs);
        System.out.println("Total precios otros electrodomésticos: " + totalPreciosElectr+"\n");
    }
}
