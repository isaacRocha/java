package mmc;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Mmc {

    public static void main(String[] args) {

        List a = new ArrayList();
        List b = new ArrayList();

        for (int i = 0; i < 3; i++) {
            int numeros = Integer.parseInt(JOptionPane.showInputDialog("Digite numero"));
            for (int j = 0; j < numeros * 2; j++) {
                int r = numeros * j;
                a.add(r);
            }
        }
        int[] c = new int[a.size()];
        for (int i = 0; i < a.size(); i++) {
            c[i] = (int) a.get(i);
        }
        int e = 0;
        for (int i = 0; i < c.length; i++) {
            for (int j = i + 1; j < c.length; j++) {
                if (c[i] == c[j]) {
                    b.add(c[i]);
                }
            }
        }
        for (int i = 0; i < b.size(); i++) {
            System.out.println(b.get(i));
        }
    }
}
