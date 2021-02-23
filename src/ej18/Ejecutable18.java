package ej18;

public class Ejecutable18 {
    public static void ejecutar() {
        Serie[] series = new Serie[5];
        Videojuego[] videojuegos = new Videojuego[5];
        series[0] = new Serie();
        series[1] = new Serie("The walking Dead", "Tulio recomienda");
        series[2] = new Serie("Azul", "Anita");
        series[3] = new Serie("Rojo", "Luisito");
        series[4] = new Serie("cuerno", 4, "terror", "Arnold");
        videojuegos[0] = new Videojuego("The empires", 120);
        videojuegos[1] = new Videojuego("Calamar", 3);
        videojuegos[2] = new Videojuego();
        videojuegos[3] = new Videojuego("Survivor", 23);
        videojuegos[4] = new Videojuego("Amparito", 12, "Acción", "EA");
        videojuegos[0].entregar();
        videojuegos[3].entregar();
        series[3].entregar();
        int seriesPrestadas = 0;
        for (Serie serie : series) {
            if (serie.esEntregado()) {
                seriesPrestadas++;
                serie.devolver();
            }
        }
        int videojuegosPrestados = 0;
        for (Videojuego videojuego : videojuegos) {
            if (videojuego.esEntregado()) {
                videojuegosPrestados++;
                videojuego.devolver();
            }
        }
        System.out.println("\nSeries prestadas: " + seriesPrestadas);
        System.out.println("Videojuegos prestados: " + videojuegosPrestados);

        int maxNumeroTemporadas = series[0].getNumeroTemporadas();
        int indiceMax = 0;
        for (int i=1; i<series.length; i++) {
            if (series[i].getNumeroTemporadas() > maxNumeroTemporadas) {
                maxNumeroTemporadas = series[i].getNumeroTemporadas();
                indiceMax = i;
            }
        }
        System.out.println("Serie con más temporadas: ");
        System.out.println(series[indiceMax].toString());
        int maxHorasEstimadas = videojuegos[0].getHorasEstimadas();
        indiceMax = 0;
        for (int i=1; i<videojuegos.length; i++) {
            if (videojuegos[i].getHorasEstimadas() > maxHorasEstimadas) {
                maxHorasEstimadas = videojuegos[i].getHorasEstimadas();
                indiceMax = i;
            }
        }
        System.out.println("Videojuego con más horas estimadas: ");
        System.out.println(videojuegos[indiceMax].toString()+"\n");
    }
}
