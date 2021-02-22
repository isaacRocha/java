package main;

import model.Mamifero;
import model.Peixe;

public class AnimalMain {

    public static void main(String[] args) {
        
        
        Mamifero camelo = new Mamifero();
        Peixe tubarao = new Peixe();
        Mamifero  ursoCanada = new Mamifero();
                
        
        camelo.nome = "Camelo";
        camelo.cor = "Amarelo";
        camelo.quantidadePatas = 4;
        camelo.setTipoAlimentacao("Carnívoro");
        
    
        tubarao.nome = "Tubarão";
        tubarao.cor = "Cinzento";
        tubarao.quantidadePatas = 0;
        
        ursoCanada.nome = "Urso-do-canadá";
        ursoCanada.cor = "Vermelho";
        ursoCanada.quantidadePatas= 4;
        ursoCanada.setTipoAlimentacao("Mel");
        
        camelo.dadosMamifero();
        tubarao.dadosPeixe();
        ursoCanada.dadosMamifero();
        
        
        
        
                
                
          
    }
}
