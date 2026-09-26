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

        // imprimo a mensagem com os valores em porcentagem
        JOptionPane.showMessageDialog(null, "Validos: " + (v * 100) / votos + "%"); // 89,58%
        JOptionPane.showMessageDialog(null, "Brancos: " + (b * 100) / votos + "%"); // 3,67%
        JOptionPane.showMessageDialog(null, "Nulos: " + (n * 100) / votos + "%"); // 6,75%

    }
}  // tem como ficar melhor