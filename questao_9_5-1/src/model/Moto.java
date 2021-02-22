package model;

public class Moto implements IProduto {

    private String nome;
    private String marca;
    private double preco;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public String getMarca() {
        return this.marca;
    }

    @Override
    public double getPreco() {
        return this.preco;
    }
}
