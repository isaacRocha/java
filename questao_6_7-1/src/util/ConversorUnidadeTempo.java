package util;

public class ConversorUnidadeTempo {

    public static void segundos(int minutos) {
        int r = minutos * 60;
        System.out.println("A quantidade de minutos em segundos: " + r);
    }

    public static void minutos(int horas) {
        int r = horas * 60;
        System.out.println("A quantidade de horas em minutos: " + r);
    }

    public static void dias(int dias) {
        int r = dias * 24;
        System.out.println("A quantidade de dias em horas: " + r);
    }

    public static void semanas(int semanas) {
        int r = semanas * 7;
        System.out.println("A quantidade de semanas em dias: " + r);
    }

    public static void mes(int mes) {
        int r = mes * 30;
        System.out.println("A quantidade de mês em dias: " + r);
    }

    public static void anos(int anos) {
        int r = anos * 365;
        System.out.println("A quantidade de anos em dias: " + r);
    }

}
