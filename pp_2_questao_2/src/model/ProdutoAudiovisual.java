
package model;

public class ProdutoAudiovisual {
    
    private long id;
    private int ano;
    private String titulo, diretor, URL;
    
    public ProdutoAudiovisual(long id, int ano, String titulo, String diretor,  String URL){
        this.id = id;
        this.ano = ano;
        this.titulo = titulo;
        this.diretor = diretor;
        this.URL= URL;  
    }

    public void alterarAno(int ano) {
        this.ano = ano;
    }

    public void alterarTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void alterarDiretor(String diretor) {
        this.diretor = diretor;
    }

    public void alterarURL(String URL) {
        this.URL = URL;
    }
}
