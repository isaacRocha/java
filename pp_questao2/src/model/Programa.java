
package model;


public class Programa {
    private String nome, versão, fabricante;
    private Long numeroRegistro;

    public String getNome() {
        return nome;
    }

    public String getVersão() {
        return versão;
    }

    public String getFabricante() {
        return fabricante;
    }

    public Long getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setVersão(String versão) {
        this.versão = versão;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void setNumeroRegistro(Long numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }
    
}
