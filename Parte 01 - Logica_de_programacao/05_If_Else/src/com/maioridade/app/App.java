package com.maioridade.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //Declaração de variaveis
        String nome; 
        int idade;

        // instaciar a classe Scaner
        Scanner sc = new Scanner(System.in);

        //input dos dados
        System.out.println("Informe o seu nome: ");
        nome = sc.nextLine();
        System.out.println("Informe sua idade: ");
        idade = sc.nextInt();

        // Verificar idade
        if (idade >= 18) {
            System.out.println( nome + " " + "é maior de idade.");
        } else {
            System.out.println( nome + " " + "é menor de idade.");
        }
        sc.close();
    }
}
