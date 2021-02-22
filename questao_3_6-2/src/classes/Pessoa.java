package classes;

public class Pessoa {

  
    public String nome;
    public String cpf;
    public Endereco endereco;
   
    public Pessoa() {

    }

    public Pessoa(String nome, String cpf, String bairro, Endereco endereco) {
       
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
       
    }
    
    public String imprimir(){
        return "Nome: " + nome +" CPF: "+ cpf;
    }

}
