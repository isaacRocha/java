package main;

import util.Calculadora;

public class CalculadoraMain {
   
   public static void main (String [] args){
       
       Calculadora.soma(2, 5);
       Calculadora.soma(2, 5, 3);
       Calculadora.subtração(7, 5);
       Calculadora.subtração(7, 1, 5);
       Calculadora.multiplicacao(2, 5);
       Calculadora.multiplicacao(2, 3, 5);
       Calculadora.divisao(20, 2);
       Calculadora.divisao(20, 2, 5);
       
       
   }
}
