package main;

import classes.ContadorDePessoas;

public class Main {

    public static void main(String[] args) {

        ContadorDePessoas contador = new ContadorDePessoas(40);
        System.out.println("limite de pessoas: " + contador.limitePessoas);
        contador.registraEntrada(30);
        contador.registraSaida(25);

        System.out.println(contador.mostrarRelatorio());

    }
}
