
package model;


public class Seminario extends Avaliacao{
        
    private final String tema;
    private final double tempoDuracao;
    
    public Seminario(String nome, Double nota, String tema, double tempo) {
        super(nome,nota);
        this.tema = tema;
        this.tempoDuracao = tempo;
    }  
}
