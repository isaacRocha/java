package main;

import model.*;

public class ComputadorMain {

    public static void main(String[] args) {
        ComputadorDeMesa computadorDeMesa = new ComputadorDeMesa("Samsung", "i3",
                "8GB", "500 GB", "Samsung", "xPro", "500v");
        
        computadorDeMesa.trocarProcessador("i5");
        computadorDeMesa.trocarMemoriaSecundaria("16GB");
        computadorDeMesa.trocarMemoriaSecundaria("1000GB");
        computadorDeMesa.trocarTipoGabinete("xPro2");
        computadorDeMesa.trocarFonte("800v");
        
        
        Smartphone smartphone = new Smartphone("xiaomi", "a540", "4GB", "128GB",
                                        "6.28", "64", "vivo");
        
        smartphone.trocarOperadora("claro");
   
    }

}
