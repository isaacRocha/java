/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Calculadora extends JFrame {
    JTextField campo;
    JPanel painel;
    JButton botaoPonto;
    JButton botaoIgual;
    JButton botaoAdicao;
    JButton botaoSubtracao;
    JButton botaoMultiplicacao;
    JButton botaoDivisao;
    JButton[] botaoNumerico;
    char operacao;
    double operando1;

    public Calculadora() {
        super("Ultra-Mini Calculadora");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        campo = new JTextField();
        add(campo, BorderLayout.NORTH);
        painel = new JPanel(new GridLayout(4, 4, 3, 3));
        add(painel, BorderLayout.CENTER);
        botaoPonto = new JButton(".");
        botaoIgual = new JButton("=");
        botaoAdicao = new JButton("+");
        botaoSubtracao = new JButton("-");
        botaoMultiplicacao = new JButton("×");
        botaoDivisao = new JButton("÷");
        botaoNumerico = new JButton[10];
        for(int i = 0; i < 10; i++) {
            botaoNumerico[i] = new JButton(""+i);
            botaoNumerico[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    JButton botao = (JButton)e.getSource();
                    campo.setText(campo.getText()+botao.getText());
                }
            });
        }
        botaoPonto.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                campo.setText(campo.getText()+botaoPonto.getText());
            }
        });
        botaoAdicao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                operando1 = Double.parseDouble(campo.getText());
                operacao = '+';
                campo.setText("");
            }
        });
        botaoSubtracao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                operando1 = Double.parseDouble(campo.getText());
                operacao = '-';
                campo.setText("");
            }
        });
        botaoMultiplicacao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                operando1 = Double.parseDouble(campo.getText());
                operacao = '×';
                campo.setText("");
            }
        });
        botaoDivisao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                operando1 = Double.parseDouble(campo.getText());
                operacao = '÷';
                campo.setText("");
            }
        });
        botaoIgual.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double operando2 = Double.parseDouble(campo.getText());
                double resultado = 0;
                if(operacao == '+') {
                    resultado = operando1+operando2;
                } else if(operacao == '-') {
                    resultado = operando1-operando2;
                } else if(operacao == '×') {
                    resultado = operando1*operando2;
                } else if(operacao == '÷') {
                    resultado = operando1/operando2;
                }
                campo.setText(""+resultado);
            }
        });
        painel.add(botaoNumerico[7]);
        painel.add(botaoNumerico[8]);
        painel.add(botaoNumerico[9]);
        painel.add(botaoDivisao);
        painel.add(botaoNumerico[4]);
        painel.add(botaoNumerico[5]);
        painel.add(botaoNumerico[6]);
        painel.add(botaoMultiplicacao);
        painel.add(botaoNumerico[1]);
        painel.add(botaoNumerico[2]);
        painel.add(botaoNumerico[3]);
        painel.add(botaoSubtracao);
        painel.add(botaoNumerico[0]);
        painel.add(botaoPonto);
        painel.add(botaoIgual);
        painel.add(botaoAdicao);
    }

    public static void main(String[] args) {
        Calculadora janela = new Calculadora();
        janela.setSize(300,400);
        janela.setVisible(true);
    }
    
}
