package model;

public class ContaPoupanca {

    public int agencia;
    public String operacao;
    public String conta;
    public float saldo;
    public Banco banco;

    public ContaPoupanca() {
    }

    public ContaPoupanca(int agencia, String operacao, String conta,
            float saldo, Banco banco) {
        this.agencia = agencia;
        this.operacao = operacao;
        this.conta = conta;
        this.saldo = saldo;
        this.banco = banco;
    }
    
       public String imprimirContaPoupanca(){
            return "Agencia: " + this.agencia 
                    +" Operacao: "+this.operacao 
                    +" Conta: "+this.conta
                    +" Saldo: "+this.saldo
                    +" Banco: "+this.banco.imprimirBanco();  
        }
}
