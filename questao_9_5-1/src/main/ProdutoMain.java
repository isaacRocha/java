package main;

import model.*;

public class ProdutoMain {

    public static void main(String[] args) {

        Carro carro = new Carro();

        carro.setNome("fusca");
        carro.setMarca("Volkswagen");
        carro.setPreco(5.123);

        System.out.println(carro.getNome());
        System.out.println(carro.getMarca());
        System.out.println(carro.getPreco());

        Moto moto = new Moto();

        System.out.println("\n");
        moto.setNome("CB 1000");
        moto.setMarca("Honda");
        moto.setPreco(35.512);

        System.out.println(moto.getNome());
        System.out.println(moto.getMarca());
        System.out.println(moto.getPreco());

    }
}
