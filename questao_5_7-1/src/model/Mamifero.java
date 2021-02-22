
package model;

public class Mamifero extends Animal{
    
    private String tipoAlimentacao;

    public void setTipoAlimentacao(String tipoAlimentacao) {
        this.tipoAlimentacao = tipoAlimentacao;
    }

    public String getTipoAlimentacao() {
        return tipoAlimentacao;
    }
    
    public Mamifero(){}
    
    public Mamifero(String tipoAlimentacao){
        this.tipoAlimentacao = tipoAlimentacao;
    }
    
    public void dadosMamifero(){
        System.out.println("Nome: "+ super.nome);
        System.out.println("Cor: "+ super.cor);
        System.out.println("Quantidades de Patas: "+ super.quantidadePatas);
        System.out.println("Tipo de alimentacao: "+ this.tipoAlimentacao);
    }
}
