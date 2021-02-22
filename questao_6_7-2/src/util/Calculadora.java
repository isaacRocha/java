package util;

public class Calculadora {
    
    public static void soma(int numero1, int numero2){
        int r = numero1+numero2;
        System.out.println("A soma: "+ r);
    }
    
    public static void soma(int numero1, int numero2 ,int numero3){
        int r = numero1+numero2+numero3;
        System.out.println("A soma: "+ r);
    }
    
    public static void subtração(int numero1, int numero2){
        int r = numero1-numero2;
        System.out.println("A subtração: "+ r);
    }
    
    public static void subtração(int numero1, int numero2 ,int numero3){
        int r = numero1-numero2-numero3;
        System.out.println("A subtração: "+ r);     
    }
    
    public static void multiplicacao(int numero1, int numero2){
        int r = numero1*numero2;
        System.out.println("A multiplicacao: "+ r);
    }
    
    public static void multiplicacao(int numero1, int numero2 ,int numero3){
        int r = numero1*numero2*numero3;
        System.out.println("A multiplicacao: "+ r);
    }
    
    public static void divisao(int numero1, int numero2){
        int r = numero1/numero2;
        System.out.println("A divisao: "+ r);
    }
    
    public static void divisao(int numero1, int numero2 ,int numero3){
        int r = numero1/numero2/numero3;
        System.out.println("A divisao: "+ r);
    }
    
}
