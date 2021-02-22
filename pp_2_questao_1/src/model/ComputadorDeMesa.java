package model;

public class ComputadorDeMesa extends Computador {

    private String fabricanteGabinte, tipoGabinete, fonte;

    public ComputadorDeMesa(String fabricante, String processador, String memoriaPrincipal, String memoriaSecundaria, String fabricanteGabinte, String tipoGabinete, String fonte) {
        super(fabricante, processador, memoriaPrincipal, memoriaSecundaria);
        this.fabricanteGabinte = fabricanteGabinte;
        this.tipoGabinete = tipoGabinete;
        this.fonte = fonte;
    }

    public void trocarFabricanteGabinte(String fabricanteGabinte) {
        this.fabricanteGabinte = fabricanteGabinte;
    }

    public void trocarTipoGabinete(String tipoGabinete) {
        this.tipoGabinete = tipoGabinete;
    }

    public void trocarFonte(String fonte) {
        this.fonte = fonte;
    }
    
}
