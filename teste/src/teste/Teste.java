package teste;

import javax.swing.JOptionPane;

public class Teste {

    public static void main(String[] args) {

        Numeros num = new Numeros();
        soma(num.pegarA(), num.pegarB(), 0);

    }

    public static void soma(int a, int b, int r) {

        r = a + b;

        System.out.println(r);

    }

}

class Numeros {

    private int a;
    private int b;

    public int pegarA() {
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite A"));
        return a;
    }

    public int pegarB() {
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite B"));
        return b;
    }

}
