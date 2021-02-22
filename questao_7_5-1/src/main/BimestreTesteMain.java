package main;

import model.*;

public class BimestreTesteMain {

    public static void main(String[] args) {

        Bimestre bimestre = new Bimestre();

        bimestre.av1 = new Prova("isaac", 10.0, 60, 30, true);
        bimestre.av2 = new Seminario("isaac", 8.0, "java", 45.0);
        bimestre.av3 = new EstudoDirigido("Isaac rocha", 7.0, "git", 25);

        bimestre.idBimestre ="166566558";
        bimestre.imprimirAvaliacoes();

    }
}
