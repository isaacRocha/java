package model;

public class PagamentoEmDinheiro extends Pagamento {

    private double valorRecebido;
    private double troco;

    public PagamentoEmDinheiro(double valor ,double valorRecebido, double troco) {
        super.valor = valor;
        this.valorRecebido = valorRecebido;
        this.troco = troco;
    }

    @Override
    public String imprimir() {
        System.out.println("O valor recebido :" + valorRecebido);
        System.out.println("Troco :" + troco);
        return  "Dinheiro"; 
    }
}
