package model;

public abstract class Avaliacao {

    private String nome;
    private Double nota;

    public double getNota() {
        return nota;
    }

    public String getinfo() {
        return nome;
    }

    public Avaliacao(String nome, Double nota) {
        this.nome = nome;
        this.nota = nota;
    }
    
}
