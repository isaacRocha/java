package main;

import model.Programa;

public class ProgramaMain {

    public static void main(String[] args) {

        Programa blocoDeNotas = new Programa();
        Programa galeriaDeFotos = new Programa();

        blocoDeNotas.setNome("NotePad++");
        blocoDeNotas.setFabricante("ifb");
        blocoDeNotas.setVersão("1.23");
        blocoDeNotas.setNumeroRegistro(1523547871215454545L);

        System.out.println("Nome: " + blocoDeNotas.getNome());
        System.out.println("Fabricante: " + blocoDeNotas.getFabricante());
        System.out.println("Versão: " + blocoDeNotas.getVersão());
        System.out.println("Numero de resgistro: " + blocoDeNotas.getNumeroRegistro());
        System.out.println("\n");

        galeriaDeFotos.setNome("Fotor");
        galeriaDeFotos.setFabricante("Fotor.com");
        galeriaDeFotos.setVersão("7.69");
        galeriaDeFotos.setNumeroRegistro(2545745458745L);

        System.out.println("Nome: " + galeriaDeFotos.getNome());
        System.out.println("Fabricante: " + galeriaDeFotos.getFabricante());
        System.out.println("Versão: " + galeriaDeFotos.getVersão());
        System.out.println("Numero de resgistro: " + galeriaDeFotos.getNumeroRegistro());

    }
}
