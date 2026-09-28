package com.backaofront;

import java.util.Scanner;

public class Exercicio_3 {
        public static void main(String[] args) {
            // declaro a variavel para o Scanner
            Scanner input = new Scanner(System.in);

            // peço para o usuario colocar o salario antes do aumento
            System.out.println("Insira seu salario atual: ");
            double salario = input.nextDouble();

            // peço para o usuario colocar o percentual de aumento
            System.out.println("Insira o percentual de aumento: ");
            double percentual = input.nextDouble();

            // faço a conta do percentual e do total
            double aumento = (salario * percentual) / 100;
            double total = aumento + salario;

            // mostro para o usuario quanto aumentou e quando sera o salario final
            System.out.printf("Seu salario se ajustou em: R$%.2f, com o salario total de R$%.2f",aumento, total);

        }
    }
