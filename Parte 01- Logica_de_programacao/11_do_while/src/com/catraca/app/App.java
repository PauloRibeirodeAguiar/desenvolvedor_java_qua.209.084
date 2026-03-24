package com.catraca.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        String nome;
        double peso;
        double altura;
        int opcao;

        do {
            System.out.println("Deseja inserir um novo registro?");         
               
            System.out.print("[1]-Inseir / [2]-Sair\n");

            opcao = sc.nextInt();

            if (opcao == 1) {

                sc.nextLine();

                System.out.println("Informe o nome: ");
                nome = sc.nextLine();

                System.out.println("Informe o peso: ");
                peso = sc.nextDouble();

                System.out.println("Informe a altura: ");
                altura = sc.nextDouble();

                if (peso < 120 && altura >= 1.25) {
                    System.out.println("Entrada de "+nome+" autorizada.");
                }else{
                    System.out.println("Entrada de "+nome+" não autorizada.");
                }

            }else if (opcao == 2) {
                System.out.println("Obrigado pela preferência!");
            }else{
                System.out.println("Opção inválida!");
            }
        } while (opcao != 2);
            
        sc.close();
    }
}
