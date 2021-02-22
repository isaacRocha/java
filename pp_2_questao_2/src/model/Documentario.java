package model;

public class Documentario extends ProdutoAudiovisual {

    private boolean ganhouOscar;
    private int duracao;

    public Documentario(long id, int ano, String titulo, String diretor, String URL, boolean ganhouOscar, int duracao) {
        super(id, ano, titulo, diretor, URL);
        this.duracao = duracao;
        this.ganhouOscar = ganhouOscar;
    }

    public void ganhouOscar(boolean ganhouOscar) {
        this.ganhouOscar = ganhouOscar;
    }

    public void alterarDuracao(int minutos) {
        this.duracao = minutos;
    }

}
