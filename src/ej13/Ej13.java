package ej13;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ej13 {
    public static void ejecutar() {
        DateTimeFormatter fechaYHora = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(fechaYHora.format(now));
    }
}
