package ej5y6;

public class Ej5y6 {
    private static StringBuilder pares;
    private static StringBuilder impares;

    public static void ejecutar() {
        System.out.println("Números pares e impares del 1 al 100 con un ciclo While:");
        conWhile();
        System.out.println("Pares: " + pares.toString());
        System.out.println("Impares: " + impares.toString());
        System.out.println("\nNúmeros pares e impares del 1 al 100 con un ciclo For:");
        conFor();
        System.out.println("Pares: " + pares.toString());
        System.out.println("Impares: " + impares.toString());
    }

    private static void conWhile(){
        int i = 1;
        pares = new StringBuilder();
        impares = new StringBuilder();
        while (i <= 100){
            if ((i % 2) == 0){
                pares.append(Integer.toString(i) + " ");
            } else{
                impares.append(Integer.toString(i) + " ");
            }
            i++;
        }
    }

    private static void conFor(){
        pares = new StringBuilder();
        impares = new StringBuilder();
        for (int i=1; i<=100; i++){
            if ((i % 2) == 0){
                pares.append(Integer.toString(i) + " ");
            } else{
                impares.append(Integer.toString(i) + " ");
            }
        }
    }
}
