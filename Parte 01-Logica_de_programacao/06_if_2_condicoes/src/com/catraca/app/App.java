package com.catraca.app;

import java.util.Scanner; 

public class App {
    public static void main(String[] args) throws Exception {
        //Declaração de Variaveis
        String nome;
        double peso;
        double altura;

        // Instacinar cçasse Scanner
        Scanner sc = new Scanner(System.in);

        // Entrada de dados
        System.out.println("Iforme seu nome: ");
        nome = sc.nextLine();
        System.out.println("Informe seu peso em Kg: ");
        peso = sc.nextDouble();
        System.out.println("Informe sua altura em metros: ");
        altura = sc.nextDouble();

        //Condiconal com operador booleano
        if (peso <= 120 && altura >= 1.25) {
            System.out.println("Entrada de " + nome + " permitida");
            
        } else{
            System.out.println("Entrada de " + nome + " não permitida");
        }

        // Fechar objeto Scanner
        sc.close();
    }
}
