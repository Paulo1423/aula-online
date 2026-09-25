package com.backaofront;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args ) {

        System.out.println("Exercicio 1");

        int base, altura, area;

        base = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho da base do seu retângulo: "));
        altura = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho da altura do seu retângulo: "));

        area = (base * altura);

        JOptionPane.showMessageDialog(null, "A área do seu retângulo é de: " + area);
    }
}
