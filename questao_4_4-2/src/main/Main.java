package main;

import classes.Gincana;

public class Main {

    public static void main(String[] args) {

        Gincana gincana = new Gincana();

        gincana.primeiraEquipe(10);
        gincana.segundaEquipe(10);
        gincana.terceiraEquipe(10);

        gincana.removerPontosPrimeiraEquipe(1);
        gincana.removerPontosSegundaEquipe(2);
        gincana.removerPontosTerceiraEquipe(2);

        gincana.finalGincana();
    }
}
