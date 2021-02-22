package util;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class CalendarioUtil {

    public static void data() {
        LocalDate data = LocalDate.now();
        DateTimeFormatter data2 = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        String r = data.format(data2);

        System.out.println("Data: " + r);
    }

    public static void ano() {
        LocalDateTime data = LocalDateTime.now();
        DateTimeFormatter ano = DateTimeFormatter.ofPattern("yyyy");

        String r = data.format(ano);

        System.out.println("Ano: " + r);
    }

    public static void mes() {
        LocalDateTime data = LocalDateTime.now();
        DateTimeFormatter mes = DateTimeFormatter.ofPattern("MM");

        String r = data.format(mes);

        System.out.println("Mes: " + r);
    }

    public static void dia() {
        LocalDateTime data = LocalDateTime.now();
        DateTimeFormatter dia = DateTimeFormatter.ofPattern("dd");

        String r = data.format(dia);

        System.out.println("Dia: " + r);
    }

    public static void hora() {
        LocalDateTime data = LocalDateTime.now();
        DateTimeFormatter hora = DateTimeFormatter.ofPattern("HH:mm:ss");

        String r = data.format(hora);

        System.out.println("Hora: " + r);
    }

    public static void minuto() {
        LocalDateTime data = LocalDateTime.now();
        DateTimeFormatter minuto = DateTimeFormatter.ofPattern("mm");

        String r = data.format(minuto);

        System.out.println("Minuto: " + r);
    }

    public static void segundo() {
        LocalDateTime data = LocalDateTime.now();
        DateTimeFormatter segundo = DateTimeFormatter.ofPattern("ss");

        String r = data.format(segundo);

        System.out.println("Segundo: " + r);
    }
}
