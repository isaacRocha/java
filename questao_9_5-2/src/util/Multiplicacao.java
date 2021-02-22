/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

public class Multiplicacao implements IOperacaoMatematica {

    private int valorUm;
    private int valorDois;

    public Multiplicacao(int valorUm, int valorDois) {
        this.valorUm = valorUm;
        this.valorDois = valorDois;
    }

    @Override
    public int calcula() {
        return this.valorUm * valorDois;
    }
}
