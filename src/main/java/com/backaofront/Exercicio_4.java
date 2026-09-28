package com.backaofront;

import java.util.Scanner;

public class Exercicio_4 {
        public static void main(String[] args) {
            // declaro o Scanner
            Scanner input = new Scanner(System.in);

            // capturo a idade do usuario
            System.out.println("Insira sua idade: ");
            int idade = input.nextInt();

            // coloco uma condição com if para saber se o usuario é maior de idade
            if (idade >= 18){
                System.out.println("Você é maior de idade e pode dirigir.");

                // dou um caminho alternativo caso não cumpra a condição do if
            }else {
                System.out.println("Você não é maior de idade e não pode dirigir!!!");
            }
        }
    }