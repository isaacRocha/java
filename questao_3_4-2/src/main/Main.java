package main;

import model.*;

public class Main {

    public static void main(String[] args) {
        
        Banco banco = new Banco();

        banco.cnpj="111.222.333/0001-000";
        banco.nome="Banco do Brasil";
        
        ContaPoupanca contaPoupanca
                = new ContaPoupanca(1001, "013", "55587",
                        50000, banco);

        Pessoa pessoa = new Pessoa("Anderson", "888.555.666-55",
                contaPoupanca);

        System.out.println(pessoa.imprimirPessoa());
        
        
    
    }

}
