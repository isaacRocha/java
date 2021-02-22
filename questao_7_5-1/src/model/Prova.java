package model;

public class Prova extends Avaliacao {
    
    private  double tempoDuracao ;
    private  int quantidadeDeQuestao;
    private  boolean consultaAutorizada;

    public Prova(String nome, Double nota, double tempo,int qtdQuestoes, boolean consulta) {
        super(nome, nota);
        this.consultaAutorizada = consulta;
        this.quantidadeDeQuestao = qtdQuestoes;
        this.tempoDuracao = tempo;
    }

}
