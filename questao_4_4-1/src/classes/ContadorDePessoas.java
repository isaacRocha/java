package classes;

public class ContadorDePessoas {

    public int limitePessoas;
    public int qtdePresentes;
    public int qtdeTotal;

    public ContadorDePessoas() {

    }

    public ContadorDePessoas(int limite) {
        this.limitePessoas = limite;
    }

    public void registraEntrada(int quantidade) {
        
        this.qtdeTotal = this.qtdePresentes + quantidade;
        this.qtdePresentes += quantidade;

        if (this.qtdePresentes >= this.limitePessoas) {
            System.out.println("Bem Vindo!");
        } else {
            System.out.println("limite maximo!");
        }

    }

    public int registraSaida(int quantidade) {

        int s = this.qtdePresentes - quantidade;

        if (s >= this.qtdePresentes) {
            this.qtdePresentes = 0;
            return this.qtdePresentes;
        } else {
            return this.qtdePresentes = s;
        }
    }

    public String mostrarRelatorio() {
            return "Quantidade de pessoas presentes no restaurante: " + this.qtdePresentes + " total de pessoas: " + this.qtdeTotal;
       
    }

}
