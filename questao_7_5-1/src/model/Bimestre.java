package model;

public class Bimestre {

    public String idBimestre;
    public Avaliacao av1;
    public Avaliacao av2;
    public Avaliacao av3;
    
    public void imprimirAvaliacoes() {
        System.out.println("ID do bimestre: "+this.idBimestre);
        System.out.println("A avaliação 1 : Nome "+ av1.getinfo() + " Nota: " + av1.getNota());
        System.out.println("A avaliação 2 : Nome "+ av2.getinfo() + " Nota: " + av2.getNota());
        System.out.println("A avaliação 3 : Nome "+ av3.getinfo() + " Nota: " + av3.getNota());
       
    }
}
