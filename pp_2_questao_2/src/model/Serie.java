
package model;

import java.util.HashSet;
import java.util.Set;

public class Serie extends ProdutoAudiovisual {
     private Set<String> atores = new HashSet<String>();
     private int temporadas;

    public Serie(long id, int ano, String titulo, String diretor, String URL,int temporadas) {
        super(id, ano, titulo, diretor, URL);
        this.temporadas = temporadas;
    }
    
    public void adicionarAtor(String nome) {
        this.atores.add(nome);
    }
    
    public void removerAtor(String nome) {
        this.atores.remove(nome);
    }

    public void alterarNumTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }
   
}
