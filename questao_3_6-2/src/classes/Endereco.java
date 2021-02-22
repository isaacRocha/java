package classes;

public class Endereco {

    public String logradouro;
    public String complemento;
    public String bairro;
    public String cidade;
    public int numero;
    public String cep;

    public Endereco() {

    }

    public Endereco(String logradouro, String complemento, String bairro, String cidade, int numero, String cep) {
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.numero = numero;
        this.cep = cep;
    }
    
    public String ImprimirEndereco(){
        return "Logradouro: "+logradouro+ " Complemento: "+ complemento +" Bairro: "+bairro +" Cidade: "+cidade + " Numero: " + numero +" CEP: "
+cep;    }

}
