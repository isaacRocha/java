package model;

public class Peixe extends Animal{
    
    public Peixe(){}
    
    public void dadosPeixe(){
        System.out.println("\n");
        System.out.println("Nome: "+ super.nome);
        System.out.println("Cor: "+ super.cor);
        System.out.println("Quantidades de Patas: "+ super.quantidadePatas);
        System.out.println("\n");
    }
    
}
