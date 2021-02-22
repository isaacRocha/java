package main;

import model.*;

public class ProdutoAudiovisualMain {

    public static void main(String[] args) {
        
        Filme filme = new Filme(101021L, 2010, "hulk", "lucas", "www.hulk.com", false, 150);
        
        filme.adicionarAtor("Anderson");
        filme.adicionarAtor("Almir");
        filme.removerAtor("Almir");
        
    }

}
