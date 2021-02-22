package classes;

public class Calculadora {

    public int valor1, valor2, valor3;

    public Calculadora() {

    }

    public Calculadora(int valor1) {
        this.valor1 = valor1;
    }

    public Calculadora(int valor1, int valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public Calculadora(int valor1, int valor2, int valor3) {
        this.valor1 = valor1;
        this.valor2 = valor2;
        this.valor3 = valor3;
    }

    public int soma() {
        return valor1 + valor2 + valor3;
    }

    public int subtracao() {
        return valor1 - valor2 - valor3;
    }

    public int divisao() {
        return valor1 / valor2 / valor3;
    }
    
     public int multiplicação() {
        return valor1 * valor2 * valor3;
    }

}
