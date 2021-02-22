package main;

import classes.Calculadora;

public class Main {

    public static void main(String[] args) {
        
        Calculadora calculadora = new Calculadora(500,600,1100);
        
        System.out.println(calculadora.valor1);
        System.out.println(calculadora.valor2);
        System.out.println(calculadora.valor3);
        
        System.out.println(calculadora.soma());
        System.out.println(calculadora.subtracao());
        System.out.println(calculadora.divisao());
        System.out.println(calculadora.multiplicação());
       
    }
}
