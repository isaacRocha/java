package model;

public class Smartphone extends Computador {

    private String tamanhoDeTela, densidadePixels, operadora;

    public Smartphone(String fabricante, String processador, String memoriaPrincipal, String memoriaSecundaria, String tamanhoDeTela, String densidadePixels, String operadora) {
        super(fabricante, processador, memoriaPrincipal, memoriaSecundaria);
        this.tamanhoDeTela = tamanhoDeTela;
        this.densidadePixels = densidadePixels;
        this.operadora = operadora;

    }

    public void trocarOperadora(String operadora) {
        this.operadora = operadora;
    }

}
