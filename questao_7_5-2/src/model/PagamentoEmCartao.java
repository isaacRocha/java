package model;

public class PagamentoEmCartao extends Pagamento{

    public String bandeira;
    public long  numeroTransacao;
    
    
    public PagamentoEmCartao(double valor, String bandeira, long numeroTransacao){
        super.valor=valor;
        this.bandeira = bandeira;
        this.numeroTransacao = numeroTransacao;
    }
    
    @Override
    public String imprimir() {
        System.out.println("O valor total do pagamento: " +super.valor);
        System.out.println("Bandeira do cartão: " +this.bandeira);
        System.out.println("Número da transação: " +this.numeroTransacao);
        return "Cartão";
       
    }
    
}
