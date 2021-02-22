package model;

public class EstudoDirigido extends Avaliacao {

    private String tema;
    private int numeroDePaginas;

    public EstudoDirigido(String nome, Double nota, String tema, int numeroDePaginas) {
        super(nome, nota);
        this.numeroDePaginas = numeroDePaginas;
        this.tema = tema;

    }

}
