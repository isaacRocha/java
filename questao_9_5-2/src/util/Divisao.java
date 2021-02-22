package util;

public class Divisao implements IOperacaoMatematica {

    private int valorUm;
    private int valorDois;

    public Divisao(int valorUm, int valorDois) {
        this.valorUm = valorUm;
        this.valorDois = valorDois;
    }

    @Override
    public int calcula() {
        return this.valorUm / valorDois;
    }
}
