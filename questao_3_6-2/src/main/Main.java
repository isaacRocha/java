package main;

import classes.Endereco;
import classes.Pessoa;

public class Main {
    
    public static void main (String [] args){
        Pessoa pessoa = new Pessoa();
        
        pessoa.nome = "isaac";
        pessoa.cpf = "71711-71";
        pessoa.endereco = new Endereco();
        
        pessoa.endereco.bairro ="paranoa";
        pessoa.endereco.cep = "71711-71";
        pessoa.endereco.cidade = "paranoa";
        pessoa.endereco.complemento = "520";
        pessoa.endereco.logradouro = " q 2 c 3 c 12";
        pessoa.endereco.numero = 12;
        
        System.out.print(pessoa.imprimir()+" ");
        System.out.println(pessoa.endereco.ImprimirEndereco());
       
        
        
    }
}
