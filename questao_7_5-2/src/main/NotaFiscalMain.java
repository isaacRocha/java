package main;

import model.*;

public class NotaFiscalMain {

    public static void main(String[] args) {
        
        Pagamento dinheiro = new PagamentoEmDinheiro(70,100 , 30);
        Pagamento cartao = new PagamentoEmCartao(80, "visa", 1010);
        
        NotaFiscal notaFiscal;
        
        notaFiscal = new NotaFiscal(10, "livros", cartao);
        notaFiscal.imprimirNota();
        
        
        notaFiscal = new NotaFiscal(5, "Jogos", dinheiro);
        notaFiscal.imprimirNota();
        
    }
}
