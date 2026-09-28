package com.backaofront;
// importo uma classe(neste caso podemos chamar de função), para poder usar input.
import javax.swing.JOptionPane;
// declaro uma classe/objeto novo
public class Exercicio_2 {
    public static void main(String[] args){
        // pararvisualizar o começo do exercicio
        System.out.println("exercicio 2");

        // declaro o tipo das variaveis
        double votos,v, b, n, validos, brancos, nulos;

        // peço a porcentagem de votos para o usuario
        // 2º turno (27 de outubro de 2024) - Total de votos apurados: 6382084
        votos = Double.parseDouble(JOptionPane.showInputDialog("Total dos votos em São Paulo: "));
        JOptionPane.showMessageDialog(null,"Divididos em...");

        // peço os valores de cada categoria
        v = Double.parseDouble(JOptionPane.showInputDialog("Total de votos validos: ")); // 5717011 votos
        b = Double.parseDouble(JOptionPane.showInputDialog("Total de votos brancos: ")); // 234317 votos
        n = Double.parseDouble(JOptionPane.showInputDialog("Total de votos nulos: ")); // 430756 votos

        // faço a formula de percentual de cada voto
        validos = (v * 100) / votos;
        brancos = (b * 100) / votos;
        nulos = (n * 100) / votos;

        // imprimo a mensagem com os valores em porcentagem
        JOptionPane.showMessageDialog(null, String.format("Validos: %.2f%%", validos)); // 89,58%
        JOptionPane.showMessageDialog(null, String.format("Brancos: %.2f%%",  brancos)); // 3,67%
        JOptionPane.showMessageDialog(null, String.format("Nulos: %.2f%%", nulos)); // 6,75%
    }
}