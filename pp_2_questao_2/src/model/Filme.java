package model;

import java.util.HashSet;
import java.util.Set;

public class Filme extends ProdutoAudiovisual{
    
    private Set<String> atores = new HashSet<String>();
    private boolean ganhouOscar;
    private int duracao;
    
    public Filme(long id, int ano, String titulo, String diretor, String URL, boolean ganhouOscar, int duracao ) {
        super(id, ano, titulo, diretor, URL);
        this.duracao = duracao;
        this.ganhouOscar = ganhouOscar;
    }

    public void adicionarAtor(String nome) {
        this.atores.add(nome);
    }
    
    public void removerAtor(String nome) {
        this.atores.remove(nome);
    }

    public void ganhouOscar(boolean ganhouOscar) {
        this.ganhouOscar = ganhouOscar;
    }

    public void alterarDuracao(int minutos){
        this.duracao = minutos;
    }

    public Set<String> getAtores() {
        return atores;
    }
    
}
