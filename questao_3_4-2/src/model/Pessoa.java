package model;

public class Pessoa {

    public String nome;
    public String cpf;
    public ContaPoupanca contaPoupanca;

    public Pessoa() {
    }

    public Pessoa(String nome, String cpf,
            ContaPoupanca contaPoupanca) {
        this.nome = nome;
        this.cpf = cpf;
        this.contaPoupanca = contaPoupanca;
    }

    public String imprimirPessoa() {
        return "Nome: " + this.nome
                + " CPF: " + this.cpf
                + " Conta: " + this.contaPoupanca.imprimirContaPoupanca();
    }
}
