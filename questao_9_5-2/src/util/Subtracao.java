package util;

public class Subtracao implements IOperacaoMatematica {

    private int valorUm;
    private int valorDois;

    public Subtracao(int valorUm, int valorDois) {
        this.valorUm = valorUm;
        this.valorDois = valorDois;
    }

    @Override
    public int calcula() {
        return this.valorUm - valorDois;
    }
}
