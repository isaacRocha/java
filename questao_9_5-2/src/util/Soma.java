package util;

public class Soma implements IOperacaoMatematica {

    private int valorUm;
    private int valorDois;

    public Soma(int valorUm, int valorDois) {
        this.valorUm = valorUm;
        this.valorDois = valorDois;
    }

    @Override
    public int calcula() {
        return this.valorUm + valorDois;
    }
}
