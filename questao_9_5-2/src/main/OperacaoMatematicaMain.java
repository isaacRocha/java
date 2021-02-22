package main;

import java.util.Scanner;
import util.*;

public class OperacaoMatematicaMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a operação\n1 - Soma\n2 - Subtração\n3 - Multiplicação\n4 - Divisão");
        int opcao = scanner.nextInt();

        if (opcao == 1) {
            Soma soma = new Soma(10, 10);
            System.out.println("A soma: " + soma.calcula());

        } else if (opcao == 2) {
            Subtracao subtracao = new Subtracao(10, 5);
            System.out.println("A subtração: " + subtracao.calcula());
        } else if (opcao == 3) {
            Multiplicacao multiplicacao = new Multiplicacao(10, 3);
            System.out.println("A multiplicação: " + multiplicacao.calcula());

        } else if (opcao == 4) {
            Divisao divisao = new Divisao(100, 10);
            System.out.println("A Divisão: " + divisao.calcula());

        } else {
            System.out.println("operação invalida");
        }
    }
}
