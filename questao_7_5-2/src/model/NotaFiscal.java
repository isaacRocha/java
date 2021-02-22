package model;

public class NotaFiscal {
    
    public int numero;
    public String resumo;
    public Pagamento pagamento;
    
    public NotaFiscal(int numero, String resumo, Pagamento pagamento){
        super();
        this.numero = numero;
        this.resumo = resumo;
        this.pagamento = pagamento;
    }
    
    public void imprimirNota(){
        System.out.println("Nota Fiscal numero: "+ numero);
        System.out.println("Resumo da compra: \n: "+ resumo);
        System.out.println("Forma de pagamento: "+ pagamento.imprimir());
    }
    
}
